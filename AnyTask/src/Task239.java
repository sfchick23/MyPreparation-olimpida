import java.util.Scanner;

public class Task239 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(toBinary(sc.nextInt()));
        //максимальное число не превышающие 344
        System.out.println(toBinary(27));
    }

    private static int toBinary(int n) {
        String sixDecimal = Integer.toString(n, 6);
        String sumNum = sixDecimal + Integer.parseInt(sixDecimal) % 10;
        int decimal = Integer.parseInt(sumNum, 6);
        String binaryDecimal = Integer.toBinaryString(decimal);
        binaryDecimal = binaryDecimal + Integer.parseInt(binaryDecimal) % 10;

        return Integer.parseInt(binaryDecimal, 2);

    }
}
