public class CheckMaxMin {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print("Array before min/max: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        maxMin(arr);

        System.out.print("Array after min/max: ");

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Solution 1 :
    // Since array is sorted , we use a pointer to switch between larger and smaller values
    public static void maxMin(int[] arr){

        //Create a result array to hold re-arranged version of given arr
        int[] result = new int[arr.length];

        int smallPointer = 0;//PointerSmall => Start of arr
        int largePointer = arr.length -1 ; //PointerLarge => End of arr

        //Flag which will help in switching between two pointers
        boolean switchPointer = true;

        for (int i = 0; i < arr.length ; i++) {

            if(switchPointer){

                result[i] = arr[largePointer--]; // copy large values
            }else{
                result[i] = arr[smallPointer++]; // copy small values
            }

            switchPointer =!switchPointer;// switching between small and large
        }

        for (int i = 0; i < arr.length ; i++) {

            arr[i] =result[i];
        }

    }
}
