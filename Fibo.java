import java.util.Scanner;

public class Fibo {
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Порядковый номер числа Фибоначчи: ");
        n = scan.nextInt();

        int x =   fibonacci(n);
        System.out.println("Это число: " +x);
    }

    static int fibonacci(int n) {
        int f1, f2, f_n;
        f_n = 0;
        if (n == 1 )
            f_n = 1;
        f1 = 0;
        f2 = 1;
        for (int i = 2; i <= n; i++) {
                f_n = f1 + f2;
                f1 = f2;
                f2 = f_n;
        }

        return f_n;
    }
}
