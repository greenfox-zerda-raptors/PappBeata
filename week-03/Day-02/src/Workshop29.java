public class Workshop29{
    public static void main(String[] args) {
        int ab = 123;
        int credits = 100;
        Boolean is_bonus = false;
        // if credits are at least 50,
        // and is_bonus is False decrement ab by 2
        // if credits are smaller than 50,
        // and is_bonus is False decrement ab by 1
        // if is_bonus is True ab should remain the same

        if (is_bonus == true) {
            } else if (credits >= 50){
            ab = ab -2;
        } else {
            ab = ab - 1;
        }

        System.out.println(ab);
    }
}
