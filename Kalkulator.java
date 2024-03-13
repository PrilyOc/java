import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan operasi (+, -, *, /): ");
        char operator = input.next().charAt(0);
        System.out.print("Masukan bilangan pertama: ");
        double bilangan1 = input.nextDouble();
        System.out.print("Masukan bilangan kedua: ");
        double bilangan2 = input.nextDouble();

        double hasil;

        switch (operator) {
            case '+':
                hasil = bilangan1 + bilangan2;
                break;
            case '-':
                hasil = bilangan1 - bilangan2;
                break;
            case '*':
                hasil = bilangan1 * bilangan2;
                break;
            case '/':
                hasil = bilangan1 / bilangan2;
                break;
            default:
                System.out.println("Operasi tidak valid");
                return;
        }

        System.out.print("Hasil: " + hasil);
    }
}