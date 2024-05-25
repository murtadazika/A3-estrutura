/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java. util.Arrays;
import java.util.Random;

public class QuickSortTest {
    public static void main(String[] args){
        int[] sizes = {100, 1000, 10000, 100000, 1000000};
        for (int size: sizes){
            int[] arr = new int[size];
            Random rand = new Random();
            for (int i = 0; i < size; i++){
                arr[i] = rand.nextInt(size * 10);
            }
            long startTime = System.nanoTime();
            QuickSort.quickSort(arr);
            long endTime = System.nanoTime();
            double timeTaken = (endTime - startTime)/ 1_000_000.0;
            System.out.println("Quick Sort - Size:" + size + ", Time taken:" + timeTaken + "ms");
        }
    }
}
