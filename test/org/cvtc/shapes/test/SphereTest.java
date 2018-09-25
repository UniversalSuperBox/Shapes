package org.cvtc.shapes.test;

import org.cvtc.shapes.Sphere;

import static org.junit.Assert.*;

import org.junit.Test;

public class SphereTest {

	@Test
	public void testVolume() {
		assertEquals(new Sphere(5).volume(), 523.5, 0.2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSphere() {
		new Sphere(-4);
	}

	@Test
	public void testGetRadius() {
		assertEquals(new Sphere(5).getRadius(), 5, 0.002);
	}

}
