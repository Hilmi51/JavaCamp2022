public class stringsdemo {
    public static void main(String[] args) {
        String message = "Bugun hava cok guzel";
        String newMessage = message.replace(" ", "-");
        char[] chracters = new char[5];

        System.out.println(message);
        System.out.println("Eleman sayisi : " + message.length());
        System.out.println("5. eleman : " + message.charAt(4));
        System.out.println(message.concat(" yasasin!"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));

        message.getChars(0, 5, chracters, 0);

        System.out.println(chracters);
        System.out.println(message.indexOf("av"));
        System.out.println(message.lastIndexOf('a'));
        System.out.println(newMessage);
        System.out.println(message);
        System.out.println(message.substring(2, 5));

        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}
