package org.cvtc.shapes.test;

import org.cvtc.shapes.Cylinder;

import static org.junit.Assert.*;

import org.junit.Test;

public class CylinderTest {

	MessageBoxSub myMessageBoxSub = new MessageBoxSub();

	@Test(expected = IllegalArgumentException.class)
	public void testCylinderNegRadius() {
		new Cylinder(-1, 3, myMessageBoxSub);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCylinderNegLength() {
		new Cylinder(2, -3, myMessageBoxSub);
	}

	@Test
	public void testGetRadius() {
		assertEquals(new Cylinder(2, 3, myMessageBoxSub).getRadius(), 2, 0.001);
	}

	@Test
	public void testGetHeight() {
		assertEquals(new Cylinder(2, 3, myMessageBoxSub).getHeight(), 3, 0.001);
	}

}
