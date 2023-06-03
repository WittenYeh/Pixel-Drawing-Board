package com.rucjava.infoplace.ModelModule.ModelUtils;

public final class Constants {
    private Constants() {}
    public static final int MaxPixelNumPerUser = 128;
    public static final int DefaultPixelNumPerUser = 128;
    public static final int DefaultGlobalDrawBoardRowNum = 256 * 15;
    public static final int DefaultGlobalDrawBoardColNum = 256 * 10;
    public static final int DefaultRValue = 255;
    public static final int DefaultGValue = 255;
    public static final int DefaultBValue = 255;
    public static final double DefaultSquareLength = 1;
    public static final double DefaultBottomLayerPosX = 0;
    public static final double DefaultBottomLayerPosY = 0;
    /**
     * the following height/width attributes are relative value,
     * because we use the strategy of viewport to scaling.fit
     * attribute type is float instead of double because
     */
    public static final float RelativeDeskWidth = 16;
    public static final float RelativeDeskHeight = 9;
    public static final float RelativeBlackboardWidth = 16;
    public static final float RelativeBlackboardHeight = 9;
    public static final float RelativeClassroomWidth = 16;
    public static final float RelativeClassroomHeight = 9;
    public static final double DefaultBoardDeskRatio = 0.8; // board is 0.8 of desk
    public static final double DefaultPixelAreaBoardRatio = 0.9;
    public static final double DefaultPixelAreaBlackboardRatio = 0.9;
}



