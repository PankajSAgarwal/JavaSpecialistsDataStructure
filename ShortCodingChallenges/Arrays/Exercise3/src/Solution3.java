import java.util.HashSet;
import java.util.Set;

public class Solution3 {

    public static int[] findSum(int[] arr , int n){

        int[] result = new int[2];

        Set<Integer> set = new HashSet<>();
        for(int i:arr){

            if(set.contains(n - i)){
                result[0] = i;
                result[1] = n - i;
                break;
            }
            set.add(i);
        }
        return result;// return the elements in the array whose sum is equal to the value passed as parameter
    }

    public static void main(String[] args) {

        int n = 9;
        int[] arr1 = {2,3,5,7,9};


        if(arr1.length > 0){

            int[] arr2 = findSum(arr1, n);
            int num1 = arr2[0];
            int num2 = arr2[1];
            //System.out.println("num1 : " +num1);
            //System.out.println("num2 : " +num2);
            if((num1 + num2) != n ){
                System.out.println("Not Found");
            }else{
                System.out.println("Number 1 = " + num1);
                System.out.println("Number 2 = " + num2);
                System.out.println("Sum = " +(n));
            }

        }else{
            System.out.println("Input Array is empty");
        }
    }
}
