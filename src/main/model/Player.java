package main.model;

public interface Player {

    /**
     * Move the player to the point (x,y).
     * @param x final X coordinate
     * @param y final Y coordinate
     */
    void moveTo(int x, int y);

    /**
     * Jump.
     */
    void jump();

    /**
     * @return the X coordinate of the player
     */
    int getX();

    /**
     * @return the Y coordinate of the player
     */
    int getY();

    /**
     * @return the height of the jumps of the player
     */
    int getJumpHeight();

    /**
     * @return the number of lifes of the player
     */
    int getLifes();

    /**
     * @return true if the shield is active
     */
    boolean isShieldActive();

    /**
     * Sets the height of the jumps.
     * @param h the new height of the jump
     */
    void setJumpHeight(int h);

    /**
     * Sets the number of lifes of the player.
     * @param lifes the new number of lifes
     */
    void setNumberOfLifes(int lifes);

    /**
     * Sets the shield.
     * @param active true if the shield is active
     */
    void setShield(boolean active);

}
