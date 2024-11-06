import java.util.Scanner;

public class Task240 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(findOriginalNumber(sc.nextInt()));
        //число N при котором результат 151
        System.out.println(findOriginalNumber(68));
    }

    private static int findOriginalNumber(int n) {
        String numAsString = String.valueOf(n);

        int firstDigit = Character.getNumericValue(numAsString.charAt(0));
        int secondDigit = n % 10;

        String sumBinary = toBinary(firstDigit) + toBinary(secondDigit);
        char[] arr = sumBinary.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                arr[i] = '1';
            }else if (arr[i] == '1') {
                arr[i] = '0';
            }
        }

        sumBinary = String.copyValueOf(arr);

        return Integer.parseInt(sumBinary, 2);
    }

    private static String toBinary(int n) {
        String binaryString = Integer.toBinaryString(n);

        while (binaryString.length() < 4) {
            binaryString = "0" + binaryString;
        }

        return binaryString;
    }
}
