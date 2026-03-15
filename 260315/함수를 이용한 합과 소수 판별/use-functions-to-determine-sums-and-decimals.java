import java.util.Scanner;
public class Main {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void result(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i) == true && digitSum(i) == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        result(a, b);
    }
}