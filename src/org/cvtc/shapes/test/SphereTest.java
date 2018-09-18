package org.cvtc.shapes.test;

import org.cvtc.shapes.Sphere;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

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
