public class ArraysExample {
    public static void main(String[] args) {
        // object header 12 bytes , 64 bit compressed oops
        // int[] length 4 bytes
        //3*4 bytes for values
        // 12+4+12 = 28 bytes ~ 32 bytes
        //O(n)
        int[] values ={1,2,3};
        // object header 12 bytes , 64 bit compressed oops
        // int[] length 4 bytes
        //1000*4 bytes for values
        // 12+4+4000 = 4016 bytes ~ 4016 bytes
        //O(n)
        int[] larger = new int[1000];

        short[] smaller ;// 2 bytes per entry
        byte[] bytes ; // 1 byte per entry

        String[] names = {"John", "Dane","Dora"};
        String[] newNames = new String[names.length + 1];
        System.arraycopy(names,0,newNames,0,names.length);
        newNames[3] = "Pankaj";

    }


}
