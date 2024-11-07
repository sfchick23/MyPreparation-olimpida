import java.util.Scanner;

public class Task278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumNumbers(sc.nextInt()));

    }

    private static int sumNumbers(int n) {
        String s = Integer.toString(n) + "0";
        char[] arr = s.toCharArray();
        //нечетные
        int sumOddNum = 0;
        //нечетные по индексу
        int sumOddIndex = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int digit = Character.getNumericValue(arr[i]);
            if (digit % 2 != 0)
                sumOddNum += digit;

            if (arr[i+1] % 2 != 0)
                sumOddIndex += digit;
        }

        return Math.abs(sumOddIndex - sumOddNum);
    }
}
