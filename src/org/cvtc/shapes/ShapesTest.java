package org.cvtc.shapes;

/** Test program for the Shapes library */
public class ShapesTest {

	public static void main(String[] args) {

		// The cuboid that we'll render
		IShape myCuboid;
		// The cylinder that we'll render
		IShape myCylinder;
		// The Sphere that we'll render
		IShape mySphere;

		// A dialog box for all of them
		MessageBox myMessageBox = new MessageBox(null, "Shapes test program");
		ShapeFactory whyDoIHaveShapeFactory = new ShapeFactory(myMessageBox);

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

		myCuboid = whyDoIHaveShapeFactory.make(ShapeType.Cuboid);
		myCylinder = whyDoIHaveShapeFactory.make(ShapeType.Cylinder);
		mySphere = whyDoIHaveShapeFactory.make(ShapeType.Sphere);

		System.out.println("Rendering cuboid");
		if (myCuboid instanceof IRenderer) {
			IRenderer tempCuboid = (IRenderer) myCuboid;
			tempCuboid.render();
		}
		System.out.println("Rendering cylinder");
		if (myCylinder instanceof IRenderer) {
			IRenderer tempCylinder = (IRenderer) myCylinder;
			tempCylinder.render();
		}
		System.out.println("Rendering sphere");
		if (mySphere instanceof IRenderer) {
			IRenderer tempCylinder = (IRenderer) mySphere;
			tempCylinder.render();
		};

	}

}
