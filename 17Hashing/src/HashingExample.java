public class HashingExample{
    public static void main(String[] args) {

        BasicHashTable<Integer,String> numbers = new BasicHashTable<>();
        
        numbers.put(1,"one");
        numbers.put(2,"two");
        numbers.put(42,"THE number");// hash=42
        numbers.put(243,"two-four-three");
        numbers.put(244,"two-four-four");// hash = 244 % 101 ~ 42

        System.out.println("numbers = " + numbers);
    }
}