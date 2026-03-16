import java.util.Scanner;
public class Main {
    public static boolean cal(int m, int d) {
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m ==12) {
            if(d <= 31 && d > 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d <= 30 && d > 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (m == 2) {
            if (d <= 28 && d > 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        if(cal(m, d) == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}