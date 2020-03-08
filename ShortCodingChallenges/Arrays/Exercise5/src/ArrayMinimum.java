public class ArrayMinimum {

    public static void main(String[] args) {

        int[] inputArr = new int[]{9, 2, 3, 6};

        int min = findMinimum(inputArr);
        System.out.println("Min element in input array is :" + min);

    }

   public static int findMinimum(int[] arr){

        int min = arr[0];

       for (int i = 0; i < arr.length ; i++) {

           if(arr[i] < min){
               min = arr[i];
           }
       }

       return min;
    }
}
