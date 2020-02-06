import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        System.out.println(ad.add(1));
        ad.add(2);
        ad.add(3);
        System.out.println(ad.offer(4));
        System.out.println(ad);
        System.out.println(ad.poll());
        System.out.println(ad.peek());
        System.out.println(ad.remove());
        System.out.println(ad);
        for (int i = 0; i <10_000 ; i++) {

            ad.add(i);

        }

        System.out.println(ad);
        ad.clear();
        System.out.println(ad);

    }
}
