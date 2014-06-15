package com.swipesort.swipesorter;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestSorter {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSort() {
		int[] mesh = {3,2,5,6,1,2,5,4};
		SwipeSorter.sort(mesh);
		assertArrayEquals(new int[]{1,2,2,3,4,5,5,6}, mesh); 
	}

}
