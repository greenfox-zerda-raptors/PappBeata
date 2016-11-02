public class Workshop19{
    public static void main(String... args){
        String proverb = "Hope for the best, but prepare for the worst.";
        // Decide if "proverb" contains the "worst" word
        if (proverb.indexOf("worst") == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Word worst found");
        }
    }
}