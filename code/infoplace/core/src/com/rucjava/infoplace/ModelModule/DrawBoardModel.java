package com.rucjava.infoplace.ModelModule;

import com.badlogic.gdx.Gdx;
import com.rucjava.infoplace.ModelModule.ModelUtils.Constants;
import com.rucjava.infoplace.ModelModule.ModelUtils.RGBPixel;

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
    private float boardPosX;    // position of left edge of draw board
    private float boardPosY;    // position of right edge of draw board
    private float boardHeight;
    private float boardWidth;
    private int rowNum;
    private int colNum;
    private RGBPixel[][] pixels;
    // automatically adjust value:
    private float drawAreaPosX;
    private float drawAreaPosY;
    private float drawAreaHeight;
    private float drawAreaWidth;
    private float pixelLength;

    public int getRowNum() {
        return this.rowNum;
    }

    public int getColNum() {
        return this.colNum;
    }

    public DrawBoardModel(int rowNum, int colNum) {
        this.boardHeight = Constants.DefaultBoardDeskRatio * Gdx.graphics.getHeight();
        this.boardWidth = Constants.DefaultBoardDeskRatio * Gdx.graphics.getWidth();
        float hCenter = Gdx.graphics.getHeight() / 2;
        float wCenter = Gdx.graphics.getWidth() / 2;
        this.boardPosX = wCenter - this.boardWidth / 2;
        this.boardPosY = hCenter - this.boardHeight / 2;
        autoAdjustDrawArea();   // automatically adjust draw area
    }

    public DrawBoardModel(float x, float y, int rowNum, int colNum, float boardHeight, float boardWidth) {
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
    public void boardResize(float boardHeight, float boardWidth) {
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

    // automatically adjust pixelLength, drawAreaHeight, drawAreaWidth
    private void autoAdjustDrawArea() {
        this.pixelLength = min(this.boardWidth/this.colNum, this.boardHeight/this.rowNum);
        this.drawAreaHeight = this.pixelLength * this.rowNum;
        this.drawAreaWidth = this.pixelLength * this.colNum;
        float drawBoardHeightCenter = this.boardPosY + this.boardHeight/2;
        float drawBoardWidthCenter = this.boardPosX + this.boardWidth/2;
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

    private void copyDrawBoard(RGBPixel[][] newPixels, RGBPixel[][] orgPixels) {
        int orgRowNum = orgPixels.length;
        int orgColNum = (orgPixels[0]).length;
        int newRowNum = newPixels.length;
        int newColNum = (newPixels[0]).length;
        for (int r = 0; r < newRowNum; ++r) {
            for (int c = 0; c < newColNum; ++c) {
                if (r < orgRowNum && c < orgColNum)
                    newPixels[r][c] = orgPixels[r][c]; // reference-copy / shallow copy
                else
                    newPixels[r][c] = new RGBPixel();  // initialize with default color
            }
        }
    }
}
