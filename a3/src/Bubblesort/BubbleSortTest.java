/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bubblesort;

/**
 *
 * @author User
 */
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {
    
    @Test
    public void testBubblesort() {
        int[] arr1 = {3, 2, 1};
        int[] sortedArr1 = {1, 2, 3};
        BubbleSort.bubbleSort(arr1);
        assertArrayEquals(sortedArr1, arr1);
        
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] sortedArr2 = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr2);
        assertArrayEquals(sortedArr2, arr2);
        
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] sortedArr3 = {1, 2, 3, 4, 5};
        BubbleSort.bubbleSort(arr3);
        assertArrayEquals(sortedArr3, arr3);
        
        int[] arr4 = {5, 5, 5, 5, 5};
        int[] sortedArr4 = {5, 5, 5, 5, 5};
        BubbleSort.bubbleSort(arr4);
        assertArrayEquals(sortedArr4, arr4);
        
        int[] arr5 = {};
        int[] sortedArr5 = {};
        BubbleSort.bubbleSort(arr5);
        assertArrayEquals(sortedArr5, arr5);
    }

    
}
