import java.util.Scanner;

public class Task277 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumNumbers(sc.nextInt()));

    }

    private static int sumNumbers(int n) {
        String s = Integer.toString(n);
        char[] arr = s.toCharArray();
        //нечетные
        int sumOddNum = 0;
        //четные
        int sumEvenNum = 0;
        for (int i = 0; i < arr.length; i++) {
            int digit = Character.getNumericValue(arr[i]);
            if (digit % 2 != 0)
                sumOddNum += digit;

            if (arr[i] % 2 == 0)
                sumEvenNum += digit;
        }

        return Math.abs(sumEvenNum - sumOddNum);
    }
}
