package org.cvtc.shapes;

/** Test program for the Shapes library */
public class TestShapes {

	public static void main(String[] args) {

		// The cuboid that we'll render
		Cuboid myCuboid;
		// The cylinder that we'll render
		Cylinder myCylinder;
		// The Sphere that we'll render
		Sphere mySphere;

		// A dialog box for all of them
		MessageBox myMessageBox = new MessageBox(null, "Shapes test program");

		// Unit tests? Where we're going we don't need unit tests.
		try {
			new Cuboid(1, 1, -1, myMessageBox);
		} catch (IllegalArgumentException e) {
			System.out.println("Correctly can't instance Cuboid with negative depth");
		}
		try {
			new Cuboid(1, -1, 1, myMessageBox);
		} catch (IllegalArgumentException e) {
			System.out.println("Correctly can't instance Cuboid with negative height");
		}
		try {
			new Cuboid(-1, 1, 1, myMessageBox);
		} catch (IllegalArgumentException e) {
			System.out.println("Correctly can't instance Cuboid with negative width");
		}

		try {
			new Cylinder(1, -1, myMessageBox);
		} catch (IllegalArgumentException e) {
			System.out.println("Correctly can't instance cylinder with negative height");
		}
		try {
			new Cylinder(-1, 1, myMessageBox);
		} catch (IllegalArgumentException e) {
			System.out.println("Correctly can't instance cylinder with negative radius");
		}

		try {
			new Sphere(-1, myMessageBox);
		} catch (IllegalArgumentException e) {
			System.out.println("Correctly can't instance sphere with negative radius");
		}

		myCuboid = new Cuboid(5, 5, 5, myMessageBox);
		myCylinder = new Cylinder(5, 5, myMessageBox);
		mySphere = new Sphere(5, myMessageBox);

		System.out.println("Rendering cuboid");
		myCuboid.render();
		System.out.println("Rendering cylinder");
		myCylinder.render();
		System.out.println("Rendering sphere");
		mySphere.render();

	}

}
