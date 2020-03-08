public class ProductArray {

    public static void main(String[] args) {

        int[] input = {-1,2,-3,4,-5};
        int[] result = findProduct(input);

        for (int i = 0; i < result.length ; i++) {
            System.out.println(result[i]);
        }

    }

    public static int[] findProduct(int[] arr){

        int temp = 1,j;
        int n = arr.length;
        int[] result = new int[n];

        // initialize all elements of result array to 1
        for (int i = 0; i < result.length ; i++) {
            result[i] = 1;
        }

        // Product of all element on the left of element excluding arr[i]
        for (int i = 0; i < n ; i++) {

            result[i] = temp;
            temp *= arr[i];
        }

        // intialize temp to 1 again
        temp = 1;

        // Product of elements on right side excluding arr[i]
        for (int i = n -1 ; i >=0 ; i--) {

            result[i] *= temp;
            temp *= arr[i];

        }
        return result;
    }
}
