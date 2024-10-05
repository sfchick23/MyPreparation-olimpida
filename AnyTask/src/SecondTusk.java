import java.util.Scanner;

public class SecondTusk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;

        while (true){
            num = sc.nextLine();

            if (isNaturalNumber(num)){
                int res = countOddDigits(num);
                System.out.println("В числе " + num + " - " + res + " нечетных цифры");
                break;
            }else{
                System.out.println("Число не натуральное");
            }
        }
   }

    private static int countOddDigits(String num) {
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) % 2 != 0){
                count++;
            }
        }
        return count;
    }

    private static boolean isNaturalNumber(String num) {
        for (char c : num.toCharArray()) {
            if (c == '0') return false;
        }
        return Character.isDigit(num.charAt(0));
    }
}
