public class Main {
    public static void main(String[] args) {

        {
        CreditPaymentService service = new CreditPaymentService();
        int monthlyPercentage = 1;
        int creditPayment = service.calculate(monthlyPercentage);
        System.out.println(creditPayment);
    }

        System.out.println();

        {
            CreditPaymentTwoYears service = new CreditPaymentTwoYears();
            int monthlyPercent = 1;
            int creditPaymentTwoYears = service.calculate(monthlyPercent);
            System.out.println(creditPaymentTwoYears);
        }

        System.out.println();git add 

        {
            CreditPaymentThreeYears service = new CreditPaymentThreeYears();
            int monthlyPercent = 1;
            int creditPaymentThreeYears = service.calculate(monthlyPercent);
            System.out.println(creditPaymentThreeYears);
        }

    }
}
