public class CheckRemoveEven {

    public static int[] removeEven(int[] arr){

        int oddElements = 0;

        // Find number of odd elements in arr

        for(int i=0 ; i<arr.length;i++){

            if(arr[i] % 2 !=0)
                oddElements ++;

        }

        // //Create odd array array with the size equal to the number of odd elements in arr
        int[] oddArr = new int[oddElements];
        int odd_index = 0;


        //Put odd values from arr to the resulted array
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i] % 2 != 0){
                oddArr[odd_index++] = arr[i];
            }
        }

        return oddArr;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,4,5,10,6,3};

        int[] oddArr = removeEven(arr);

        for (int i = 0; i <oddArr.length ; i++) {
            System.out.println(oddArr[i]);
        }


    }
}
