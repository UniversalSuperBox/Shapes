package org.cvtc.shapes;

/** A Cylinder object */

public class Cylinder extends Shape implements IRenderer, IShape {

    // Radius of cylinder
    private float radius;
    // Height of cylinder
    private float height;

    /** Create a new Cylinder
     * @param radius radius of the new Cylinder
     * @param height Height of the new Cylinder
     * @param messageBox MessageBox to use when rendering
     * @throws IllegalArgumentException if radius or height is not positive
     */
    public Cylinder(float radius, float height, MessageBox messageBox) throws IllegalArgumentException {
        super(messageBox);
        setRadius(radius);
        setHeight(height);
    }

    /** Get the surface area of this Cylinder */
    @Override
    public float surfaceArea() {
        float π = (float)Math.PI;
        // 2πrh+2πr^2
        return (2 * π * radius * height) + (2 * π * radius * radius);
    }

    /** Get the volume of this Cylinder */
    @Override
    public float volume() {
        return (float)Math.PI * (radius * radius) * height;
    }

    /** Show a message box with this Cylinder's radius, height, surface area, and volume. */
    @Override
    public int render() {
        String rendered = "Radius: " + String.valueOf(radius) + "\n";
        rendered += "Height: " + String.valueOf(height) + "\n";
        rendered += "Surface Area: " + String.valueOf(surfaceArea()) + "\n";
        rendered += "Volume: " + String.valueOf(volume()) + "\n";
        return messageBox.show(rendered);
    }

    /** Get this Cylinder's radius */
    public float getRadius() {
        return this.radius;
    }

    /** Set this Cylinder's radius
     * @param radius New radius to set
     */
    private void setRadius(float radius) throws IllegalArgumentException {
    	if (radius > 0) {
    		this.radius = radius;
    	} else {
            throw new IllegalArgumentException("New radius must be a positive number");
        }
    }

    /** Get this Cylinder's height */
    public float getHeight() {
        return this.height;
    }

    /** Set this Cylinder's height
     * @param height New height to set
     */
    private void setHeight(float height) throws IllegalArgumentException {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("New height must be a positive number");
        }
    }

}
