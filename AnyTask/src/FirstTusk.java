import java.util.Scanner;

class FirstTusk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        if (x < 0 && y < 0){
            x = Math.abs(x);
            y = Math.abs(y);
            System.out.println("X=" + x + " Y=" + y);
        }else if (x < 0 || y < 0){
            x += 0.5;
            y += 0.5;
            System.out.println("X=" + x + " Y=" + y);
        }else if (x >= 0.5 && x <= 2.0 || y >= 0.5 && y <= 2.0 ) {
            System.out.println("X=" + x + " Y=" + y);
        }else{
            x /= 10;
            y /= 10;
            System.out.println("X=" + x + " Y=" + y);
        }
    }
}