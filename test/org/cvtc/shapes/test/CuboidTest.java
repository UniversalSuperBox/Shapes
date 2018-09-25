package org.cvtc.shapes.test;

import org.cvtc.shapes.Cuboid;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuboidTest {

	MessageBoxSub myMessageBoxSub = new MessageBoxSub();

	@Test(expected = IllegalArgumentException.class)
	public void testCuboidNegWidth() {
		new Cuboid(-1, 2, 3, myMessageBoxSub);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCuboidNegWHeight() {
		new Cuboid(1, -2, 3, myMessageBoxSub);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCuboidNegDepth() {
		new Cuboid(1, 2, -3, myMessageBoxSub);
	}

	@Test
	public void testGetWidth() {
		assertEquals(new Cuboid(1, 2, 3, myMessageBoxSub).getWidth(), 1, 0.0002);
	}

	@Test
	public void testGetHeight() {
		assertEquals(new Cuboid(1, 2, 3, myMessageBoxSub).getHeight(), 2, 0.0002);;
	}

	@Test
	public void testGetDepth() {
		assertEquals(new Cuboid(1, 2, 3, myMessageBoxSub).getDepth(), 3, 0.0002);
	}

}
