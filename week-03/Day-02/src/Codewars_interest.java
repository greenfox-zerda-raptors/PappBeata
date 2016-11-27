/**
 * Created by Papp Beata Andrea on 27.11.2016.
 */
public class Codewars_interest {
    public static class Money {
        public static int calculateYears(double principal, double interest,  double tax, double desired) {
            int Y = 0;
            while (1 < desired / principal) {
                principal *= 1 + (1 - tax) * interest;
                Y++;
            }
            return Y;
        }
    }
}
