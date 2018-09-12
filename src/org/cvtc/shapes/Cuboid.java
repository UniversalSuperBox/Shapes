package org.cvtc.shapes;

import javax.swing.JOptionPane;

/** A cuboid object */

public class Cuboid extends Shape {

    // Width of cuboid
    private float width;
    // Height of cuboid
    private float height;
    // Depth of cuboid
    private float depth;

    /** Create a new Cuboid
     * @param width Width of the new Cuboid
     * @param height Height of the new Cuboid
     * @param depth Depth of the new Cuboid
     * @throws IllegalArgumentException if any argument is not positive
     */
    public Cuboid(float width, float height, float depth) throws IllegalArgumentException {
        setWidth(width);
        setHeight(height);
        setDepth(depth);
    }

    /** Get the surface area of this Cuboid */
    @Override
    public float surfaceArea() {
        return 2 * ((depth * width) + (width * height) + (height * depth));
    }

    /** Get the volume of this Cuboid */
    @Override
    public float volume() {
        return width * height * depth;
    }

    /** Show a message box with this Cuboid's width, height, depth, surface area, and volume. */
    @Override
    public void render() {
        String rendered = "Width: " + String.valueOf(width) + "\n";
        rendered += "Height: " + String.valueOf(height) + "\n";
        rendered += "Depth: " + String.valueOf(depth) + "\n";
        rendered += "Surface Area: " + String.valueOf(surfaceArea()) + "\n";
        rendered += "Volume: " + String.valueOf(volume()) + "\n";
        JOptionPane.showMessageDialog(null, rendered);
    }

    /** Get this cuboid's width */
    public float getWidth() {
        return this.width;
    }

    /** Set this cuboid's width
     * @param width New width to set
     * @throws IllegalArgumentException if width is negative
     */
    private void setWidth(float width) throws IllegalArgumentException {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("New width must be a positive number");
        }
    }

    /** Get this cuboid's height */
    public float getHeight() {
        return this.height;
    }

    /** Set this cuboid's height
     * @param height New height to set
     * @throws IllegalArgumentException if height is negative
     */
    private void setHeight(float height) throws IllegalArgumentException {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("New height must be a positive number");
        }
    }

    /** Get this cuboid's depth */
    public float getDepth() {
        return this.depth;
    }

    /** Set this cuboid's depth
     * @param depth New depth to set
     * @throws IllegalArgumentException if depth is negative
     */
    private void setDepth(float depth) throws IllegalArgumentException {
        if (depth > 0) {
            this.depth = depth;
        } else {
            throw new IllegalArgumentException("New depth must be a positive number");
        }
    }

}
