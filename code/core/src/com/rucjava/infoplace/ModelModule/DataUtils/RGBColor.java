package com.rucjava.infoplace.ModelModule.DataUtils;

import com.rucjava.infoplace.ModelModule.Constants;

public class RGBColor {
    protected int RValue;
    protected int GValue;
    protected int BValue;
    public RGBColor() {
        this.RValue = Constants.DefaultRValue;
        this.BValue = Constants.DefaultBValue;
        this.GValue = Constants.DefaultGValue;
    }
    public RGBColor(int RValue, int GValue, int BValue) {
        this.RValue = RValue;
        this.BValue = GValue;
        this.GValue = BValue;
    }
    public int getRValue() {
        return RValue;
    }
    public int getGValue() {
        return GValue;
    }

    public int getBValue() {
        return BValue;
    }
    public void setRValue(int rvalue) {
        this.RValue = rvalue;
    }
    public void setBValue(int bvalue) {
        this.BValue = bvalue;
    }
    public void setGValue(int gvalue) {
        this.GValue = gvalue;
    }
    public void setRGB(int rvalue, int gvalue, int bvalue) {
        this.RValue = rvalue;
        this.GValue = gvalue;
        this.BValue = bvalue;
    }
}
