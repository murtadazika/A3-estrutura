package Bubblesort;

import static java.nio.file.Files.size;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author User
 */
public class BubbleSort {
    public static void bubbleSort(int [] arr){
        int n = arr.length; 
        boolean swapped;
        int movements =0;
        int comparisons = 0;
        
        for (int i=0; i< n-1; i++){
            swapped = false;
            for (int  j = 0; j < n - 1 - i; j++){
                comparisons++;
                if(arr[j] > arr[j + 1]){
                    //swap entre arr[j] e arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            //Se nenhum par de elementos foi trocado no loop interno, então o array já está ordenado.
            if(!swapped){
                break;
            }
        }
        System.out.println("Bubble Sort -  movements:" + movements +", Comparisons: " + comparisons);
    }
    public static void main(String[] args){
        int[] sizes = {100, 1000, 10000, 100000, 1000000};
        
        for (int size : sizes){
            int[] arr = new int[size];
            //Initialize the array with random values
            Random rand = new Random();
            for (int i = 0; i < size; i++){
                arr[i] = rand.nextInt(size);
            }
            // Measure the time taken by the Bubble Sort algorithm
            long startTime = System.nanoTime();
            bubbleSort(arr);
            long endTime = System.nanoTime();
            double timeTaken = (endTime - startTime) / 1_000_000.0;
            System.out.println("Bubble Sort - Size: " + size + ",Time taken: " + timeTaken + "ms");
        }
    }
}