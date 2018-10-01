package org.cvtc.shapes.test;

import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.ShapeType;
import org.cvtc.shapes.IShape;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeFactoryTest {

    MessageBoxSub myMessageBoxSub = new MessageBoxSub();
    ShapeFactory myShapeFactory = new ShapeFactory(myMessageBoxSub);

    @Test
    public void testCreateCuboid() {
        IShape myCuboid = myShapeFactory.make(ShapeType.Cuboid);
        assertEquals(myCuboid.volume(), 6f, 0.1f);
        assertEquals(myCuboid.surfaceArea(), 22f, 0.1f);
    }

    @Test
    public void testCreateCylinder() {
        IShape myCylinder = myShapeFactory.make(ShapeType.Cylinder);
        assertEquals(myCylinder.volume(), 6.28f, 0.1f);
        assertEquals(myCylinder.surfaceArea(), 12.56f, 18.85f);
    }

    @Test
    public void testCreateSphere() {
        IShape mySphere = myShapeFactory.make(ShapeType.Sphere);
        assertEquals(mySphere.volume(), 4.188f, 0.1f);
        assertEquals(mySphere.surfaceArea(), 12.56f, 0.1f);
    }

}
