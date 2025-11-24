public class Day78_BerbagaiMethodString {
    public static void main(String[] args) {
        String teks1 = "Nama Saya Habib";
        String teks2 = "nama saya habib";

        System.out.println(teks1.length());
        System.out.println(teks1.toUpperCase());
        System.out.println(teks1.toLowerCase());
        System.out.println(teks1.equals(teks2));
        System.out.println(teks1.equalsIgnoreCase(teks2));
        System.out.println(teks1.contains("Saya"));
        System.out.println(teks1.isEmpty());
        System.out.println(teks1.substring(2,4));
        System.out.println(teks1.replace("Nama", "Hay"));
    }
}
