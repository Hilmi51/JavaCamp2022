public class sesliharfler {
    public static void main(String[] args) {
        char harf = 'I';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(harf + " Kalin Sesli Harf");
                break;
            default:
                System.out.println(harf + " Ince Sesli Harf");

        }
    }
}
