import java.util.Scanner;

public class armstrong_num {
    public static void main(String[] args) {
        System.out.println("enter the number" );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n;
        boolean flag = true;
        while (n != 0) {
            if (n % 10 == sq % 10) {
                n = n / 10;
                sq = sq / 10;

            } else {
                flag = false;
                break;
            }
        }
        if (flag == true)
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");
    }
}