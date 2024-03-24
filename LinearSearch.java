/**
 *
 * @author Jan Brix Batalla
 */

 public class LinearSearch {
    
    public static int search(int arr[], int x) {
        //lenght of array
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
        //          - prvoide asymptotic analysis of the developed solution

        //iterate arrays
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) { //checks target key
                return i; 
            }
        }
        return -1; // Return -1 if element is not found
    }
    //Time complexity would be - O ( n ) 1 for loop ( n )
    //Space complexity would be - constant as doesn't require a large space
}
