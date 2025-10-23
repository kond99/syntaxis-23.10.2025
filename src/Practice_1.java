import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println("Привет\nЕвгений Кондратьев");
        System.out.println();

        System.out.println("Задача 2");
        System.out.println(74+36);
        System.out.println();

        System.out.println("Задача 3");
        System.out.println(50/3);
        System.out.println();

        System.out.println("Задача 4");
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8%3);
        System.out.println();

        System.out.println("Задача 5");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.println(num1 + "x" + num2 + " = " + num1*num2);
        System.out.println();

        System.out.println("Задача 6");
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num3 = in1.nextInt();
        System.out.print("Введите второе число: ");
        int num4 = in.nextInt();
        System.out.println(num3 + "+" + num4 + " = " + (num3+num4));
        System.out.println(num3 + "-" + num4 + " = " + (num3-num4));
        System.out.println(num3 + "x" + num4 + " = " + num3*num4);
        System.out.println(num3 + "/" + num4 + " = " + num3/num4);
        System.out.println(num3 + "mod" + num4 + " = " + num3 % num4);
        System.out.println();

        System.out.println("Задача 7");
        Scanner in3 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num5 = in3.nextInt();
        for (int i = 1; i <= 10; i++ ) {
            System.out.println(num5 + "x" + i + " = " + num5*i);
        }
        System.out.println();

        System.out.println("Задача 8");
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
        System.out.println();

        System.out.println("Задача 9");
        double A = ((25.5*3.5-3.5*3.5)/(40.5-4.5));
        System.out.println(A);
        System.out.println();

        System.out.println("Задача 10");
        double B = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(B);
    }
}
