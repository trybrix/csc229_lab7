/**
 *
 * @author Jan Brix Batalla
 */

public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
        long sum = 0; //long is a data type to store values larger than int
        for (int num =2; num<=n; num++){
            for (int i =2; i<Math.sqrt(num);num++){
                if (num %1==0){
                    break;
                }
            }
        }
        return sum;

    }
    //wrong 
    
}