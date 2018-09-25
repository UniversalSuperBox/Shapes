package org.cvtc.shapes.test;

import org.cvtc.shapes.Sphere;

import static org.junit.Assert.*;

import org.junit.Test;

public class SphereTest {

	MessageBoxSub myMessageBoxSub = new MessageBoxSub();

	@Test
	public void testVolume() {
		assertEquals(new Sphere(5, myMessageBoxSub).volume(), 523.5, 0.2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSphere() {
		new Sphere(-4, myMessageBoxSub);
	}

	@Test
	public void testGetRadius() {
		assertEquals(new Sphere(5, myMessageBoxSub).getRadius(), 5, 0.002);
	}

}
