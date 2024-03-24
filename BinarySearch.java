/**
 *
 * @author Jan Brix Batalla
 */

public class BinarySearch {

    public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {//iterates until low <= high

            int mid = low + ((high - low) / 2);//calc mid index of array : divides half

            if (sortedArray[mid] < key) {
                low = mid + 1;

            } else if (sortedArray[mid] > key) {
                high = mid - 1;

            } else if (sortedArray[mid] == key) {
                index = mid;
                break;//if key equal to mid then set and break
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    public class Main {
        public static void main(String[] args) {
            int[] sortedArray = {1, 6, 9, 18, 27, 42, 67};//input
                            //   0, 1, 2,  3,  4,  5,  6
            int key = 18;//what we're looking for

            //calls method abovce and stores into index
            int index = runBinarySearchIteratively(sortedArray, key, 0, sortedArray.length - 1);


            if (index != Integer.MAX_VALUE) {
                System.out.println("Key found at index: " + index);
            } else {
                System.out.println("Key not found in the array.");
            }
        }
        //The time complexity would be log n - beucase each iteration is halved
        //Space complexity would be O ( 1 ) - few variables
    }
    

}