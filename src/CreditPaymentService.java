public class CreditPaymentService {
    public int calculate(int creditAmount, int monthsYear, double percentage) {
        double monthlyPercentage = percentage / 12 / 100;
        double monthlyPayment = monthlyPercentage * Math.pow((1 + monthlyPercentage), monthsYear) / (Math.pow((1 + monthlyPercentage), monthsYear) - 1);
        int result = (int) (creditAmount * monthlyPayment);
        return result;
    }
        }