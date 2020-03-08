public class CheckReArrange {

    public static void main(String[] args) {

        int[] arr = {2, 4, -6, 8, -5, -10};

        System.out.print("Array before re-arranging: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
            System.out.println();

        //reArrangeWithNewArray(arr);

        reArrangeInPlace(arr);

        System.out.print("Array after rearranging: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }



    // Solution 1 - put negative values first in a new array and then positive values.
    // Not an in place and increases space complexity
    public static void reArrangeWithNewArray(int[] arr){

        int n = arr.length;
        int[] newArray = new int[n];
        int newArray_index = 0;

        // put all elements<0 on left side of array

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<0){
                newArray[newArray_index++] = arr[i];
            }
        }

        // put all elements>=0 on right side of array
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>=0){
                newArray[newArray_index++] = arr[i];
            }
        }

        // copy all the elements from new array back to original array

        for (int j = 0; j < newArray_index ; j++) {

            arr[j] = newArray[j];
        }

    }

    // Solution 2 - Using single array and in place
    public static void reArrangeInPlace(int[] arr){

        int j = 0;

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i]<0){ // if negative number found
                if(i!=j){

                int temp = arr[i];
                arr[i] = arr[j];    //swapping with leftmost positive
                arr[j] = temp;

                }
                j++;
            }
        }

    } // end of re-arrange in place
}
