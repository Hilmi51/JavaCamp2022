public class miniProjeAsalSayi {
    public static void main(String[] args) {
        int number = 11;
        boolean asalMi = true;

        for (int i = 2; i < number; i++) {
            int control = number % i;
            if (control == 0) {
                asalMi = false;
            }
        }

        if (number == 1) {
            System.out.println(number + " sayi asal degildir.");
        } else if (number < 1) {
            System.out.println(number + " gecersiz sayi");
        }

        if (asalMi) {
            System.out.println(number + " asal sayidir.");
        } else {
            System.out.println(number + " asal sayi degildir.");
        }
    }
}
