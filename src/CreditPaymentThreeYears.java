public class CreditPaymentThreeYears {
    public int calculate(int monthlyPercent) {
        int creditAmount = 1_000_000; // сумма кредита
        int months = 12;
        double percentage = 9.99;
        double monthlyPercentage = percentage / months / 100;
        double x = monthlyPercentage * Math.pow((1 + 0.008325), 36);
        double y = Math.pow((1 + 0.008325), 36) - 1;
        double end = x / y;
        int creditPaymentThreeYears = 1;
        int result = creditPaymentThreeYears;
        result = (int) (creditAmount * (double) end);
        return result;

    }
}
