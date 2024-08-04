import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        String number = scanner.nextLine();

        String result = calculateSumOfDigits(number);
        System.out.println(result);
    }

    public static String calculateSumOfDigits(String number) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            sum += digit;
            sb.append(digit);

            if (i < number.length() - 1) {
                sb.append(" + ");
            }
        }
        sb.append(" = ").append(sum);
        return sb.toString();
    }
}
