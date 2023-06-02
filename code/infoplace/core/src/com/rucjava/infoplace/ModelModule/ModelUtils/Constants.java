package com.rucjava.infoplace.ModelModule.ModelUtils;

public final class Constants {
    private Constants() {}
    public static final int MaxPixelPerUser = 128;
    public static final int DefaultPixelPerUser = 128;
    public static final int GlobalPixelHeight = 256 * 15;
    public static final int GlobalPixelWidth = 256 * 10;
    public static final int DefaultRValue = 255;
    public static final int DefaultGValue = 255;
    public static final int DefaultBValue = 255;
    public static final double DefaultSquareLength = 1;
    public static final double DefaultBottomLevelPosX = 0;
    public static final double DefaultBottomLevelPosY = 0;
    /**
     * the following height/width attributes are relative value,
     * because we use the strategy of viewport to scaling.fit
     * attribute type is float instead of double because
     */
    public static final float DeskWidth = 16;
    public static final float DeskHeight = 9;
    public static final float BlackboardWidth = 16;
    public static final float BlackboardHeight = 9;
    public static final float ClassroomWidth = 16;
    public static final float ClassroomHeight = 9;
    public static final double DefaultBoardDeskRatio = 0.8; // board is 0.8 of desk
    public static final double DefaultAreaBoardRatio = 0.9;
    public static final double DefaultAreaBlackboardRatio = 0.9;
}



