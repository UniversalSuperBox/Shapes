package org.cvtc.shapes.test;

import org.cvtc.shapes.Cuboid;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CuboidTestSurfaceArea {

	@Parameters
	public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {1f, 1f, 1f, 6f}, {1f, 2f, 1f, 10f}, {1f, 2f, 2f, 16f}
        });
	}

	@Parameter
	public float rInput;

	@Parameter(1)
    public float hInput;

    @Parameter(2)
    public float dInput;

	@Parameter(3)
	public float expected;

	@Test
	public void testVolume() {
		assertEquals(new Cuboid(rInput, hInput, dInput).surfaceArea(), expected, 0.1);
	}

}
