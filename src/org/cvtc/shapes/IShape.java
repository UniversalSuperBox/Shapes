package org.cvtc.shapes;

/** Interface defining a shape which can calculate its own surface area and volume */
public interface IShape {

	/** The shape's surface area. */
	public float surfaceArea();

	/** The shape's volume. */
	public float volume();

}
