//Brute Force
public class Solution1 {

    public static int[] fundSum(int[] arr, int n){
        int[] result = new int[2];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1 ; j < arr.length; j++) {

                if(arr[i] + arr[j] == n){
                    result[0] = arr[i];
                    result[1] = arr[j];
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {

        int n = 9;
        int[] arr1 = {2, 4, 5, 7, 8};
        if(arr1.length > 0){
            int[] arr2 = fundSum(arr1, n);
            int num1 = arr2[0];
            int num2 = arr2[1];

            if((num1 + num2) != n)
                System.out.println("Not Found");
            else {
                System.out.println("Number 1 = " + num1);
                System.out.println("Number 2 = " + num2);
                System.out.println("Sum = " +  (n) );

            }
        } else {
            System.out.println("Input Array is Empty!");
        }
    }
}
