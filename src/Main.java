// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService annuitetPlat = new CreditPaymentService();

        System.out.println("Аннуитетный платеж на 12 месяцев");
        System.out.println(annuitetPlat.calculate(1000000, 12, 9.99));
        System.out.println();

        System.out.println("Аннуитетный платеж на 24 месяцев");
        System.out.println(annuitetPlat.calculate(1000000, 24, 9.99));
        System.out.println();

        System.out.println("Аннуитетный платеж на 36 месяцев");
        System.out.println(annuitetPlat.calculate(1000000, 36, 9.99));






        }
    }