public class CreditPaymentService {
    public int calculate(int monthlyPercentage) {
        int creditAmount = 1_000_000; // сумма кредита
        int months = 12;
        double percentage = 9.99;
        double monthlyPercent = percentage / months / 100;
        double x = monthlyPercent * Math.pow((1 + 0.008325), 12);
        double y = Math.pow((1 + 0.008325), 12) - 1;
        double end = x / y;
        int creditPayment = 0;
        int result = creditPayment;
        result = (int) (creditAmount * (double) end);
        return result;

    }
}