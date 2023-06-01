package com.rucjava.infoplace.ModelModule;

import com.rucjava.infoplace.ModelModule.DataUtils.RGBPixel;

import static java.lang.Math.min;


/* this class provides a interface, it should manage the length of draw board pixels
 * and supply a visualization of only need to adjust its initial position and number of pixels
 */
/* Use stage position system as our position system, (0,0) is left bottom。
 * | | | | | | | | |
 * | | | | | | | | |
 * | | | | | | | | |
 * | |*| | | | | | |
 * |+| | | | | | | |
 * : '+' is (0,0) pixel and '*' is (1,1) pixel
 */
public final class DrawBoardModel {
    private double boardPosX;    // position of left edge of draw board
    private double boardPosY;    // position of right edge of draw board
    private double boardHeight;
    private double boardWidth;
    private int rowNum;
    private int colNum;
    private RGBPixel[][] pixels;
    // automatically adjust value:
    private double drawAreaPosX;
    private double drawAreaPosY;
    private double drawAreaHeight;
    private double drawAreaWidth;
    private double pixelLength;

    public DrawBoardModel(double x, double y, int rowNum, int colNum, double boardHeight, double boardWidth) {
        this.boardPosX = x;
        this.boardPosY = y;
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.boardHeight = boardHeight;
        this.boardWidth = boardWidth;
        this.pixels = new RGBPixel[this.rowNum][this.colNum];  // this will
        autoAdjustDrawArea();
    }
    public void setBoardPos(int x, int y) {
        this.boardPosX = x;
        this.boardPosY = y;
        autoAdjustDrawArea();
    }
    public void boardResize(int boardHeight, int boardWidth) {
        this.boardHeight = boardHeight;
        this.boardWidth = boardWidth;
        autoAdjustDrawArea();
    }
    public void boardReshape(int newRowNum, int newColNum) {
        // update pixel matrix
        this.rowNum = newRowNum;
        this.colNum = newColNum;
        RGBPixel[][] orgPixels = this.pixels;
        this.pixels = new RGBPixel[newRowNum][newColNum];
        copyDrawBoard(this.pixels, orgPixels);
        autoAdjustDrawArea();
    }
    public RGBPixel[][] getDrawBoard() {
        return pixels;
    }

    private void autoAdjustDrawArea() {
        this.pixelLength = min(this.boardWidth/this.colNum, this.boardHeight/this.rowNum);
        this.drawAreaHeight = this.pixelLength * this.rowNum;
        this.drawAreaWidth = this.pixelLength * this.colNum;
        double drawBoardHeightCenter = this.boardPosY + this.boardHeight/2;
        double drawBoardWidthCenter = this.boardPosX + this.boardWidth/2;
        this.drawAreaPosX = drawBoardWidthCenter - this.colNum/2*pixelLength;
        this.drawAreaPosY = drawBoardHeightCenter - this.rowNum/2*pixelLength;
        updateAllPixelLength();
        updateAllPixelPos();
    }
    private void updateAllPixelLength() {
        for (int r = 0; r < rowNum; ++r) {
            for (int c = 0; c < colNum; ++c) {
                pixels[r][c].setSquareLength(this.pixelLength);
            }
        }
    }
    private void updateAllPixelPos() {
        for (int r = 0; r < rowNum; ++r) {
            for (int c = 0; c < colNum; ++c) {
                pixels[r][c].setPos(this.drawAreaPosX + c*pixelLength, this.drawAreaPosY + r*pixelLength);
            }
        }
    }
    // Attention: orgPixels should be larger than newPixels
    private void copyDrawBoard(RGBPixel[][] newPixels, RGBPixel[][] orgPixels) {
        int orgRowNum = orgPixels.length;
        int orgColNum = (orgPixels[0]).length;
        for (int r = 0; r < orgRowNum; ++r)
            for (int c = 0; c < orgColNum; ++c)
                newPixels[r][c] = orgPixels[r][c]; // reference-copy / shallow copy
    }

}
