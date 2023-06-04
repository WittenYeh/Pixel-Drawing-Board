package com.rucjava.infoplace.ModelModule.ModelUtils;

import com.badlogic.gdx.Gdx;

// SingleCharacterModel is a rectangle region
public class SingleCharacterModel {
    private float characterPosX;
    private float characterPosY;
    private float characterWidth;
    /** moveDirection variable not only represents the moving direction of dynamic character
     *  but also body orientation of static
     */
    private MoveDirection moveDirection;
    private float moveSpeed;
    private int frameID;    // 当前展示动画的第几帧
    private int totalFrameNum;  // 一个动画的总帧数
    private CharacterState characterState;

    public SingleCharacterModel() {
        this.characterPosX = Constants.DefaultCharacterPosX;
        this.characterPosY =  Constants.DefaultCharacterPosY;
        this.characterWidth = Gdx.graphics.getWidth() * Constants.DefaultCharacterScreenRatio;
        this.moveSpeed = Gdx.graphics.getWidth() * Constants.DefaultCharacterScreenRatio;
        this.moveDirection = MoveDirection.PositiveX;
    }

    public MoveDirection getMoveDirection() {
        return this.moveDirection;
    }

    public void setMoveDirection(MoveDirection moveDirection) {
        this.moveDirection = moveDirection;
    }

    public void setPosX(float x) {
        this.characterPosX = x;
    }

    public void setPosY(float y) {
        this.characterPosY = y;
    }

    public void setPos(float x, float y) {
        this.characterPosX = x;
        this.characterPosY = y;
    }

    public void setCharacterWidth(float w) {
        this.characterWidth = w;
    }

    public float getPosX() {
        return this.characterPosX;
    }

    public float getPosY() {
        return this.characterPosY;
    }

    public float getMoveSpeed() {
        return this.moveSpeed;
    }

    public void setMoveSpeed(float moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public void setCharacterState(CharacterState characterState) {
        this.characterState = characterState;
    }

    public CharacterState getCharacterState() {
        return this.characterState;
    }

    public void setFrameID(int frameID) {
        this.frameID = frameID;
    }

    public int getFrameID() {
        return this.frameID;
    }

    public void setTotalFrameNum(int totalFrameNum) {
        this.totalFrameNum = totalFrameNum;
    }

    public int getTotalFrameNum() {
        return this.totalFrameNum;
    }

    public void updateCharacterPosition() {
        switch (this.moveDirection) {
            case NegativeX: {
                this.characterPosX = this.characterPosX - moveSpeed * Gdx.graphics.getDeltaTime();
                break;
            }
            case NegativeY: {
                this.characterPosY = this.characterPosY - moveSpeed * Gdx.graphics.getDeltaTime();
                break;
            }
            case PositiveX: {
                this.characterPosX = this.characterPosX + moveSpeed * Gdx.graphics.getDeltaTime();
                break;
            }
            case PositiveY: {
                this.characterPosY = this.characterPosY + moveSpeed * Gdx.graphics.getDeltaTime();
                break;
            }
            default: break;
        }
    }

    public void updateCharacterMovement() {
        this.frameID = (this.frameID + 1) % totalFrameNum;
    }
}
