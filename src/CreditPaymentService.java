public class CreditPaymentService {
    public int calculate (int amountCredit, int numberMonth, double yearRate) {
        double interestRate = (double) (yearRate / 12 / 100);
        double annuityRat = (double)(interestRate * (Math.pow(1 + interestRate, numberMonth)) / ((Math.pow(1 + interestRate, numberMonth)) - 1));
        int monthPay = (int) (annuityRat * amountCredit);
        return monthPay;
    }
}
