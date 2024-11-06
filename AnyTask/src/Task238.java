import java.util.Scanner;

public class Task238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(toBinary(sc.nextInt()));
        //минимальное число чтобы результат превышал 413
        System.out.println(toBinary(21));

    }

    private static int toBinary(int n) {
        int lastSymbol = n % 10;

        String strLastSymbol = String.valueOf(lastSymbol);
        String sumNum = n + strLastSymbol;
        String res = Integer.toBinaryString(Integer.parseInt(sumNum)) + 0;

        int count = 0;
        char[] charArray = res.toCharArray();
        for (int i = 0; i < res.length(); i++) {
            char c;
            if (charArray[i] == '1') {
                count += 1;
            }
        }

        if (count % 2 == 0) {
            charArray[res.length()-1] = '0';
        }else
            charArray[res.length()-1] = '1';

        res = String.copyValueOf(charArray);


        return Integer.parseInt(res, 2);
    }
}
