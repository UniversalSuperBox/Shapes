package org.cvtc.shapes;

/**
 *
 * @author Dalton Durst
 * Abstract class describing three-dimensional shapes
 *
 */
public abstract class Shape {

	/** The shape's surface area */
	abstract float surfaceArea();

	/** The shape's volume */
	abstract float volume();

	/** Show a message box detailing the shape's surface area, volume, and dimensions */
	abstract void render();

}
