package com.rucjava.infoplace.ModelModule.NetworkModule;

import com.rucjava.infoplace.ModelModule.DataUtils.RGBColor;

// 用来发送的像素块数据包
public class PixelDataPack {
    protected RGBColor[][] colorInfo;
    protected int rowNum;
    protected int colNum;
    public PixelDataPack() {

    }
}
