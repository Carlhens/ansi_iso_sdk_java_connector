package com.innovatrics.iengine.ansiiso;

/**
 * Structure representing a particular minutia (distinctive fingerprint feature found in fingerprint skeleton, such as a bifurcation or an ending).
 */
public final class Minutiae {

    /**
     * Minutia angle encoded in one byte. Valid range: 0-255.
     */
    public final int angle;
    /**
     * Minutiae x coordinate as stored in the template.
     */
    public final int x;
    /**
     * Minutiae y coordinate as stored in the template.
     */
    public final int y;
    /**
     * Minutiae type (bifurcation/ending)
     */
    public final MinutiaeTypeEnum type;

    public Minutiae(int angle, int x, int y, MinutiaeTypeEnum type) {
	this.angle = angle;
	this.x = x;
	this.y = y;
	this.type = type;
    }

    @Override
    public String toString() {
	return "Minutiae{" + type + " at " + x + "," + y + "; angle=" + angle + '}';
    }
}
