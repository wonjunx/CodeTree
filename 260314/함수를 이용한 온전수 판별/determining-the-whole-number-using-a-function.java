import java.util.Scanner;
public class Main {
    public static void count(int a, int b) {
        int count = 0;
        for (int i = a; i <=b; i++) {
            if (num(i) == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean num(int n) {
        if (n % 2 == 0) {
            return false;
        }
        else if (n % 10 == 5) {
            return false;
        }
        else if (n % 3 == 0 && n % 9 != 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        count(a, b);
    }
}