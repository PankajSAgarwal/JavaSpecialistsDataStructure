public class UniqueNonRepeatingArrayElement {

    public static void main(String[] args) {

        int[] arr = {9, 2, 3, 2, 6, 6}; // sample input
        System.out.println("Input Array: " + arrayToString(arr));
        int uniqueFirst = findFirstUnique(arr);
        System.out.println("First Non repeating element in the array : " + uniqueFirst);

    }

    public static int findFirstUnique(int[] arr) {

        //Inside Inner Loop Check Each index of outerLoop If it's repeated in array
        //If it's not repeated then return this as first unique Integer


        boolean isRepeated = false;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr.length ; j++) {

                if(i != j && arr[i] == arr[j] ){

                    isRepeated = true;
                    break;
                }
            }// end of inner loop

            if(isRepeated == false){
                return arr[i];

            }else{
                isRepeated = false;
            }
        } // end of outer loop


        return - 1;
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

