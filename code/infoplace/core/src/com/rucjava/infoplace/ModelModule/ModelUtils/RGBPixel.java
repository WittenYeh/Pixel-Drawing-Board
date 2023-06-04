package com.rucjava.infoplace.ModelModule.ModelUtils;

import com.rucjava.infoplace.ControllerModule.ControllerUtils.RGBColor;

public class RGBPixel extends RGBColor {
    private float squareLength;
    private float posx;
    private float posy;
    public RGBPixel() {
        super();
        this.squareLength = Constants.DefaultSquareLength;
        this.posx = Constants.DefaultBottomLayerPosX;
        this.posy = Constants.DefaultBottomLayerPosY;
    }
    public RGBPixel(int rvalue, int gvalue, int bvalue, float l, int x, int y) {
        super(rvalue, gvalue, bvalue);
        this.squareLength = l;
        this.posx = x;
        this.posy = y;
    }
    public void setSquareLength(float l) {
        this.squareLength = l;
    }
    public void setPos(float x, float y) {
        this.posx = x;
        this.posy = y;
    }
    public float getPosX() {
        return this.posx;
    }
    public float getPosY() {
        return this.posy;
    }
    public float getSquareLength() {
        return this.squareLength;
    }
}
