package com.example;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BubbleSortTest {

	BubbleSort sorter = new BubbleSort();

	@Test
	public final void shouldDoNothingWithEmptyArray() {
		int[] inputArray = {};
		int[] expectedArray = {};
		assertArrayEquals(expectedArray, sorter.sort(inputArray));
	}

	@Test
	public final void shouldDoNothingWithOneElementArray() {
		int[] inputArray = { 22 };
		int[] expectedArray = { 22 };
		assertArrayEquals(expectedArray, sorter.sort(inputArray));
	}

	@Test
	public final void shouldSortArrayWithTwoElements() {
		int[] inputArray = { 24, 12 };
		int[] expectedArray = { 12, 24 };
		assertArrayEquals(expectedArray, sorter.sort(inputArray));
	}

	@Test
	public final void shouldSortArrayWithThreeElements() {
		int[] inputArray = { 4, 0, 8 };
		int[] expectedArray = { 0, 4, 8 };
		assertArrayEquals(expectedArray, sorter.sort(inputArray));
	}

	@Test
	public final void shouldSortArrayWithFiveElements() {
		int[] inputArray = { 9, 5, -5, 1, 3 };
		int[] expectedArray = { -5, 1, 3, 5, 9 };
		assertArrayEquals(expectedArray, sorter.sort(inputArray));
	}
}
