public class SecondMaxInArray {

    public static void main(String[] args) {

        int[] arr = {9,2,3,6};

        System.out.println("Array: " + arrayToString(arr));

        int maxSecond = findSecondMaximum(arr);
        System.out.println("Second maximum: " + maxSecond);

    }

    public static int findSecondMaximum(int[] arr){

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
