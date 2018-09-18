package org.cvtc.shapes.test;

import org.cvtc.shapes.Cylinder;

import static org.junit.Assert.*;

import org.junit.Test;

public class CylinderTest {

	@Test
	public void testSurfaceArea() {
		assertEquals(new Cylinder(2, 3).surfaceArea(), 62.83, 0.1);
	}

	@Test
	public void testVolume() {
		assertEquals(new Cylinder(2, 3).volume(), 37.699, 0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCylinderNegRadius() {
		new Cylinder(-1, 3);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCylinderNegLength() {
		new Cylinder(2, -3);
	}

	@Test
	public void testGetRadius() {
		assertEquals(new Cylinder(2, 3).getRadius(), 2, 0.001);
	}

	@Test
	public void testGetHeight() {
		assertEquals(new Cylinder(2, 3).getHeight(), 3, 0.001);
	}

}
