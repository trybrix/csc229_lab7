/**
 *
 * @author Jan Brix Batalla
 */

public class BubbleSort {

    public static void bubbleSort(int a[], int size) {

        int outer, inner, temp;//variables
  
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity

                if ( a[inner] > a[inner + 1]){//if curr elem > next elem

                    temp = a[inner]; //store curr elem

                    a[inner] = a[inner+1];//swaps curr to next elem

                    a[inner+1] = temp;//sets what the next elem is to temp
                }
            }
            //Time complexity would be - n^2 due to the nested loop
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 1}; 
        int size = arr.length; 
        
        System.out.println("OG:");
        printArray(arr); 
        
        bubbleSort(arr, size); //calls bubblesort
        
        System.out.println("After:");
        printArray(arr);
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
