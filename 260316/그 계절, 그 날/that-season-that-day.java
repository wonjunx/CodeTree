import java.util.Scanner;
public class Main {
    public static boolean primeyear(int y) {
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static void cal(int y, int m, int d) {
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d <= 31 && d > 0) {
                if (m == 3 || m == 5) {
                    System.out.println("Spring");
                }
                else if (m == 7 || m == 8) {
                    System.out.println("Summer");
                }
                else if (m == 10) {
                    System.out.println("Fall");
                }
                else if (m == 12 || m == 1) {
                    System.out.println("Winter");
                }
            }
            else {
                System.out.println(-1);
            }
        }
        else if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d <= 30 && d > 0) {
                if (m == 4) {
                    System.out.println("Spring");
                }
                else if (m == 6) {
                    System.out.println("Summer");
                }
                else if (m == 9 || m == 11) {
                    System.out.println("Fall");
                }
            }
            else {
                System.out.println(-1);
            }
        }
        else if (m == 2) {
            if (primeyear(y) == true && d <= 29 && d > 0) {
                System.out.println("Winter");
            }
            else if (primeyear(y) == false && d <= 28 && d > 0) {
                System.out.println("Winter");
            }
            else {
                System.out.println(-1);
            }
        }
        else {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        cal(y, m, d);
    }
}