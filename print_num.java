import java.util.Scanner;

public class print_num {
    public static void main(String[] args) {
        System.out.println("Enter the n number" );
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=1;
        while(a<=n)
        {
            System.out.println(a);
            a++;
        }
    }
}
