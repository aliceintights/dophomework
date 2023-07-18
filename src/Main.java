public class Main {
    public static void main(String[] args) {

        {
            CreditPaymentService service = new CreditPaymentService();
            int monthlyPercentage = 1;
            int creditPayment = service.calculate(monthlyPercentage);
            System.out.println(creditPayment);
        }
    }
}
