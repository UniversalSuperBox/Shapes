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
public class SphereTestVolume {

	@Parameters
	public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {{1f, 4.19f}, {2f, 33.52f}, {3f, 113.14f}});
	}

	@Parameter
	public float fInput;

	@Parameter(1)
	public float fExpected;

	@Test
	public void testVolume() {
		assertEquals(fExpected, new Sphere(fInput).volume(), 0.2);
	}

}
