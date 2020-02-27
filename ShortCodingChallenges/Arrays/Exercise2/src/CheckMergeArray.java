public class CheckMergeArray {

    public static int[] mergeArrays(int[] arr1,int[] arr2){

        int i=0,j=0,k=0;
        int s1 = arr1.length;
        int s2 = arr2.length;
        int[] resultArray = new int[s1 + s2];

        while( i < s1 && j < s2 ){

            if(arr1[i]<arr2[j])
                resultArray[k++] = arr1[i++];
            else
                resultArray[k++] = arr2[j++];
        }

        while(i<s1)
            resultArray[k++] = arr1[i++];

        while (j < s2)
            resultArray[k++] = arr2[j++];

        return resultArray;

    }

    public static void main(String[] args) {

       int[] arr1 = new int[] {1, 3, 4, 5};
       int[] arr2 = new int[] {2, 6, 7, 8};

       int[] resultArr = mergeArrays(arr1,arr2);

        for (int i = 0; i < resultArr.length ; i++) {

            System.out.println(resultArr[i]);
        }
    }
}
