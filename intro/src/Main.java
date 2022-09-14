public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        // Degisken isimlendirmeleri java'da camelCase yazılır.
        String ortaMentin = "Ilginizi Cekebilir";
        String altMetin = "Vade Süreli";
        // System.out.println(ortaMentin);

        // Integer
        int vade = 12;
        double dolarDun = 18.25;
        double dolarBugun = 18.30;
        boolean dolarDustuMu = false;
        String okYonu = "";

        if (dolarBugun < dolarDun) {
            okYonu = "down.png";
            // System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu = "up.png";
            // System.out.println(okYonu);
        } else {
            okYonu = "equal.png";
            // System.out.println(okYonu);
        }

        // Array
        String[] krediler = {"Hizli Kredi", "Maasini Halkbanktan", "Mutlu Emekli"};
        /*
        System.out.println(krediler[0]);
        System.out.println(krediler[1]);
        System.out.println(krediler[2]);
        */
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }
}