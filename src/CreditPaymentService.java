public class CreditPaymentService {
    public int calculate (int summaCredit, int numberMonth, double yearStavka) {
        double procStavka = (double) (yearStavka / numberMonth / 100);
        double kof = (double)(procStavka * (Math.pow(1 + procStavka, numberMonth)) / ((Math.pow(1 + procStavka, numberMonth)) - 1));
        int itog = (int) (kof * summaCredit);
        return itog;
    }
}
