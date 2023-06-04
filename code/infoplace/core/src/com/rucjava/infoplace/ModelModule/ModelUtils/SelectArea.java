package com.rucjava.infoplace.ModelModule.ModelUtils;

public class SelectArea {
    /** close bound
     */
    private int selectAreaLeftBound;
    private int selectAreaRightBound;
    private int selectAreaUpBound;
    private int selectAreaDownBound;

    // initialize to 0
    public void selectArea() {
        /*
        set to a minus value to represent null bound
         */
        this.selectAreaUpBound = this.selectAreaDownBound = this.selectAreaLeftBound = this.selectAreaRightBound = -1;
    }

    public void setSelectAreaLeftBound(int selectAreaLeftBound) {
        this.selectAreaLeftBound = selectAreaLeftBound;
    }
    public void setSelectAreaRightBound(int selectAreaRightBound) {
        this.selectAreaRightBound = selectAreaRightBound;
    }

    public void setSelectAreaDownBound(int selectAreaDownBound) {
        this.selectAreaDownBound = selectAreaDownBound;
    }

    public void setSelectAreaUpBound(int selectAreaUpBound) {
        this.selectAreaUpBound = selectAreaUpBound;
    }

    public int getSelectAreaDownBound() {
        return selectAreaDownBound;
    }

    public int getSelectAreaLeftBound() {
        return selectAreaLeftBound;
    }

    public int getSelectAreaRightBound() {
        return selectAreaRightBound;
    }

    public int getSelectAreaUpBound() {
        return selectAreaUpBound;
    }
}
