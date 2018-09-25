package org.cvtc.shapes;

/** A Sphere object */

public class Sphere extends Shape implements IRenderer {

    // Radius of sphere
    protected float radius;

    /** Create a new Sphere
     * @param radius radius of the new Sphere
     * @param messageBox MessageBox to use when rendering
     * @throws IllegalArgumentException if radius is not positive
     */
    public Sphere(float radius, MessageBox messageBox) throws IllegalArgumentException {
        super(messageBox);
        setRadius(radius);
    }

    /** Get the surface area of this Sphere */
    @Override
    public float surfaceArea() {
        // 4πr^2
        return (4 * (float)Math.PI * (radius * radius));
    }

    /** Get the volume of this Sphere */
    @Override
    public float volume() {
        return (float)(((4.0 / 3.0) * Math.PI) * Math.pow((double)radius, 3));
    }

    /** Show a message box with this Sphere's radius, height, depth, surface area, and volume. */
    @Override
    public int render() {
        String rendered = "Radius: " + String.valueOf(radius) + "\n";
        rendered += "Surface Area: " + String.valueOf(surfaceArea()) + "\n";
        rendered += "Volume: " + String.valueOf(volume()) + "\n";
        return messageBox.show(rendered);
    }

    /** Get this Sphere's radius */
    public float getRadius() {
        return this.radius;
    }

    /** Set this Sphere's radius
     * @param radius New radius to set
     */
    private void setRadius(float radius) throws IllegalArgumentException {
    	if (radius > 0) {
    		this.radius = radius;
    	} else {
            throw new IllegalArgumentException("New radius must be a positive number");
        }
    }

}
