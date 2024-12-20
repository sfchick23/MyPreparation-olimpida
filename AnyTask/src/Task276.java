import java.util.Scanner;

public class Task276 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumNumbers(sc.nextInt()));
        //ответ 90909
        System.out.println(sumNumbers(90909));
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
            if (digit % 2 == 0) {
                sumEvenNum += digit;
            }else{
                sumOddNum += digit;
            }
        }

        return Math.abs(sumOddNum - sumEvenNum);
    }
}
