package org.cvtc.shapes.test;

import org.cvtc.shapes.Cylinder;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CylinderTestSurfaceArea {

	MessageBoxSub myMessageBoxSub = new MessageBoxSub();

	@Parameters
	public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {{1f, 1f, 12.56f}, {1f, 2f, 18.85f}, {2f, 2f, 50.27f}});
	}

	@Parameter
	public float rInput;

	@Parameter(1)
	public float hInput;

	@Parameter(2)
	public float expected;

	@Test
	public void testSurfaceArea() {
		assertEquals(new Cylinder(rInput, hInput, myMessageBoxSub).surfaceArea(), expected, 0.1);
	}

}
