package com.example;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BubbleSortTest {

	BubbleSort sorter = new BubbleSort();

	@Test
	public void sortEmptyList_ShouldReturnEmptyList() {
		int[] inputArray = {};
		int[] expectedArray = {};
		assertArrayEquals(expectedArray, sorter.sort(inputArray));
	}

	@Test
	public void sortListWithOneElement_ShouldReturnSortedList() {
		int[] inputArray = {1};
		int[] expectedArray = {1};
		assertArrayEquals(expectedArray, sorter.sort(inputArray));
	} 
	
	@Test
	public void sortListWithTwoElementsInCorrectOrder_ShouldReturnSameList() {
		int[] inputArray = {1, 2};
		int[] expectedArray = {1, 2};
		assertArrayEquals(expectedArray, sorter.sort(inputArray));
	} 
	
	@Test
	public void sortListWithTwoElementsInReverseOrder_ShouldReturnSortedList() {
		int[] inputArray = {2, 1};
		int[] expectedArray = {1, 2};
		assertArrayEquals(expectedArray, sorter.sort(inputArray));
	} 
	
	@Test
	public void sortListWithSameTwoElements_ShouldReturnSortedList() {
		int[] inputArray = {2, 2};
		int[] expectedArray = {2, 2};
		assertArrayEquals(expectedArray, sorter.sort(inputArray));
	} 
	
	@Test
	public void sortListWithThreeElementsInCorrectOrder_ShouldReturnSameList() {
		int[] inputArray = {1, 2, 3};
		int[] expectedArray = {1, 2, 3};
		assertArrayEquals(expectedArray, sorter.sort(inputArray));
	}
	
	@Test
	public void sortListWithThreeElementsFirstTwoSwapped_ShouldReturnSortedList() {
		int[] inputArray = {2, 1, 3};
		int[] expectedArray = {1, 2, 3};
		assertArrayEquals(expectedArray, sorter.sort(inputArray));
	}
	
	@Test
	public void sortListWithThreeElementsLastTwoSwapped_ShouldReturnSortedList() {
		int[] inputArray = {1, 3, 2};
		int[] expectedArray = {1, 2, 3};
		assertArrayEquals(expectedArray, sorter.sort(inputArray));
	}
	
	@Test
	public void sortListWithThreeElementsReverseOrder_ShouldReturnSortedList() {
		int[] inputArray = {3, 2, 1};
		int[] expectedArray = {1, 2, 3};
		assertArrayEquals(expectedArray, sorter.sort(inputArray));
	}
	
	@Test
	public void sortListWithNElementsRandomOrder_ShouldReturnSortedList() {
		int[] inputArray = {2, 19, 0, -5, 2, 7, 1, -1, 3};
		int[] expectedArray = {-5, -1, 0, 1, 2, 2, 3, 7, 19};
		assertArrayEquals(expectedArray, sorter.sort(inputArray));
	}
}
