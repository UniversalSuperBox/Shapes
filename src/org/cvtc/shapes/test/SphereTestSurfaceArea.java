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

@RunWith(Parameterized.class)
public class SphereTestSurfaceArea {

	@Parameters
	public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {{1f, 12.57f}, {2f, 50.28f}, {3f, 113.14f}});
	}

	@Parameter
	public float fInput;

	@Parameter(1)
	public float fExpected;

	@Test
	public void testSurfaceArea() {
		assertEquals(fExpected, new Sphere(fInput).surfaceArea(), 0.2);
	}

}
