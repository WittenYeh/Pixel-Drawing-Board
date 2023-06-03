package com.rucjava.infoplace.ModelModule.ModelUtils;

import com.rucjava.infoplace.ControllerModule.ControllerUtils.RGBColor;

public class RGBPixel extends RGBColor {
    private double squareLength;
    private double posx;
    private double posy;
    public RGBPixel() {
        super();
        this.squareLength = Constants.DefaultSquareLength;
        this.posx = Constants.DefaultBottomLayerPosX;
        this.posy = Constants.DefaultBottomLayerPosY;
    }
    public RGBPixel(int rvalue, int gvalue, int bvalue, double l, int x, int y) {
        super(rvalue, gvalue, bvalue);
        this.squareLength = l;
        this.posx = x;
        this.posy = y;
    }
    public void setSquareLength(double l) {
        this.squareLength = l;
    }
    public void setPos(double x, double y) {
        this.posx = x;
        this.posy = y;
    }
    public double getPosx() {
        return this.posx;
    }
    public double getPosy() {
        return this.posy;
    }
    public double getSquareLength() {
        return this.squareLength;
    }
}
