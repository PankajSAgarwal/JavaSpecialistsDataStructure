public class SecondMaxInArray {

    public static void main(String[] args) {

        int[] arr = {9,2,3,6};

        System.out.println("Array: " + arrayToString(arr));

        int maxSecondTwiceArrayTraversal = findSecondMaximumByTwiceArrayTraversal(arr);
        System.out.println("### Solution 1 #####");
        System.out.println("Second maximum by traversing array twice: " + maxSecondTwiceArrayTraversal);

        System.out.println("### Solution 2 #####");
        int maxSecondOnceArrayTraversal = findSecondMaximumByOnceArrayTraversal(arr);
        System.out.println("Second maximum by traversing array once: " + maxSecondOnceArrayTraversal);



    }

    // Solution 1 - by Traversing array Twice
    public static int findSecondMaximumByTwiceArrayTraversal(int[] arr){

        int max = Integer.MIN_VALUE;
        int maxSecond = Integer.MIN_VALUE;

        // Find the maximum value in the array by comparing each index with max
        // If an element is greater than max then update max to be equal to it
        for (int i = 0; i < arr.length ; i++) {

            if(arr[i] > max){
                max= arr[i];
            }

        } // end of for loop

        // Find the second maximum value by comparing each index with secondmax
        // If an element is greater than secondmax and not equal to previously
        // calculated max, then update secondmax to be equal to that element.
        for (int i = 0; i < arr.length ; i++) {

            if(arr[i] > maxSecond && arr[i] != max){
                maxSecond = arr[i];
            }
        } // end of for loop

        return maxSecond;
    }

    // Solution 2 - by Traversing array Once
    public static int findSecondMaximumByOnceArrayTraversal(int[] arr){

        int max = Integer.MIN_VALUE;
        int maxSecond = Integer.MIN_VALUE;

        // Find the maximum value in the array by comparing each index with max
        // If an element is greater than max then update max to be equal to it
        for (int i = 0; i < arr.length ; i++) {

            if(arr[i] > max){

                maxSecond = max ;
                max= arr[i];

            }else if(arr[i] > maxSecond && arr[i] != max ){

                maxSecond = arr[i];
            }

        } // end of for loop

        return maxSecond;
    }

    public static String arrayToString(int arr[]){
        if (arr.length > 0){
            String result = "";
            for(int i = 0; i < arr.length; i++) {
                result += arr[i] + " ";
            }
            return result;
        }
        else {
            return "Empty Array!";
        }
    }

}
