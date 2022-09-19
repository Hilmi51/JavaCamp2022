public class arraysdemo {
    public static void main(String[] args) {
        String ogrenci1 = "Hilmi";
        String ogrenci2 = "Zeynep";
        String ogrenci3 = "Engin";
        String ogrenci4 = "Burak";
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------------------------------------------------------------");

        String[] ogrenciler = new String[2];
        ogrenciler[0] = ogrenci1;
        ogrenciler[1] = ogrenci2;
        // ogrenciler[2] = ogrenci3;
        // ogrenciler[3] = ogrenci4;
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("----------------------------------------------------------------");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}