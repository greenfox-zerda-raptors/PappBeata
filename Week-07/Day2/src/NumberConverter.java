public class NumberConverter {

    public static String arabicToRoman(int i) {
        String out = "";
        if (i == 4) {
            out = "IV";
            for (int j = 0; j < i; j++) {
                out += "I";
            }
        }
        return out;
    }
}