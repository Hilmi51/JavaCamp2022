public class loopdemo {
    public static void main(String[] args) {
        //for
        for (int i = 2; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("For Dongusu Bitti");

        //while
        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While Dongusu Bitti");

        //do-while
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While Dongusu Bitti");
    }
}
