package com.rucjava.infoplace.ControllerModule;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.rucjava.infoplace.ModelModule.DrawBoardModel;
import com.rucjava.infoplace.ModelModule.ModelUtils.BackgroundType;
import com.rucjava.infoplace.ModelModule.ModelUtils.RGBPixel;
import com.rucjava.infoplace.ObjectPool.ControllerPool;

abstract public class DrawBoardController extends BasicSceneController {
    protected DrawBoardModel drawBoardModel;
    protected Actor[][] pixelActors;

    public DrawBoardController(int row, int col, float height, float width) {
        this.initDrawBoard();
        // initialize drawBoardModel
        this.drawBoardModel.boardReshape(row, col); // 64 * 64 default
        this.drawBoardModel.boardResize(height, width);
        // initialize actors
        this.pixelActors = new Actor[this.drawBoardModel.getRowNum()][this.drawBoardModel.getColNum()];
        resetStageActors();
    }
    abstract public void initDrawBoard();

    public void changeBackgroundType() {
        backgroundModel.setBackgroundType(BackgroundType.BLACKBOARD);
    }

    public void resize(float height, float width) {
        this.drawBoardModel.boardResize(height, width);
        resetStageActors();
    }

    public void reshape(int newRow, int newCol) {
        this.drawBoardModel.boardReshape(newRow, newCol);
        resetStageActors();
    }
    public void resetStageActors() {
        // clear all actors
        this.resetStage();
        RGBPixel[][] pixels = this.drawBoardModel.getDrawBoard();
        for (int r = 0; r < this.drawBoardModel.getRowNum(); ++r) {
            for (int c = 0; c < this.drawBoardModel.getColNum(); ++c) {
                this.pixelActors[r][c] = new Actor();
                this.pixelActors[r][c].setHeight(pixels[r][c].getSquareLength());
                this.pixelActors[r][c].setWidth(pixels[r][c].getSquareLength());
                this.pixelActors[r][c].setPosition(pixels[r][c].getPosX(), pixels[r][c].getPosY());
                this.stage.addActor(this.pixelActors[r][c]);
            }
        }
    }
    // call after the stage receive a touch event
    public void updateSelectArea(Vector2 touchDownPosition, Vector2 touchUpPosition) {

    }
}
