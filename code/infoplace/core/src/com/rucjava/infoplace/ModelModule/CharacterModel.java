package com.rucjava.infoplace.ModelModule;

public class CharacterModel {
    private double posX;
    private double posY;
    private int frameID;  // specify which frame now

    public void setPosX(int x) {
        this.posX = x;
    }
    public void setPosY(int y) {
        this.posY = y;
    }
    public void setPos(int x, int y) {
        this.posX = x;
        this.posY = y;
    }
    public double getPosX() {
        return this.posX;
    }
    public double getPosY() {
        return this.posY;
    }
    public void setFrameID(int frameID) {
        this.frameID = frameID;
    }
    public int getFrameID() {
        return this.frameID;
    }
}