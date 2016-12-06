public class NumberConverter {
    public static String arabicToRoman(int arabic) {
        StringBuilder builder = new StringBuilder();

        int remaining = arabic;
       // remaining = appendSymbols(remaining, 50, "L", builder);
       // remaining = appendSymbols(remaining, 40, "XL", builder);
        remaining = appendSymbols(remaining, 10, "X", builder);
        remaining = appendSymbols(remaining, 9, "IX", builder);
        remaining = appendSymbols(remaining, 5, "V", builder);
        remaining = appendSymbols(remaining, 4, "IV", builder);

        while (remaining >=1) {
            builder.append("I");
            remaining-=1;
        }
        return builder.toString();
    }

    public static int appendSymbols(int remaining, int number, String symbol, StringBuilder builder) {
        if(remaining >= number){
            builder.append(symbol);
            remaining -= number;
        }
        return remaining;
    }
}