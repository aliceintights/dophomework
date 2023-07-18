public class CreditPaymentService {
    public int calculate(int monthlyPercentage) {
        int creditAmount = 1_000_000; // сумма кредита
        int monthsYear = 12;
        int months = 10;

        if (months < 12){
            System.out.println(months = 12);
            int resultM = 12;
        } else if (months < 24) {
            System.out.println(months = 24);
            int resultM = 24;
        } else if (months < 36) {
            System.out.println(months = 36);
            int resultM = 36;
        }

        int resultM = months;
        double percentage = 9.99;
        double monthlyPercent = percentage / monthsYear / 100;
        double x = monthlyPercent * Math.pow((1 + 0.008325), resultM);
        double y = Math.pow((1 + 0.008325), resultM) - 1;
        double end = x / y;
        int creditPayment = 1;
        int result = creditPayment;
        result = (int) (creditAmount * (double) end);
        return result;
    }
}
