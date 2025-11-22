public class Day76_MethodString2 {
    public static void main(String[] args) {
        String teks1 = "Saya Adalah Habib";
        String teks2 = "saya adalah habib";

        System.out.println(teks1.equals(teks2));
        System.out.println(teks1.equalsIgnoreCase(teks2));
        System.out.println(teks1.contains("Habib"));
        System.out.println(teks1.isEmpty());
    }
}
