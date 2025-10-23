import java.util.Scanner;

import static java.lang.System.in;

public class Practice_2 {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int A = (101 + 0) / 3;
        double B = 3.0e-6 * 10000000.1;
        boolean C = true && true;
        boolean D = false && true;
        boolean E = (false && false) || (true && true);
        boolean F = (false || false) && (true && true);

        System.out.println("(101 + 0) / 3) = " + A);
        System.out.println("(3.0e-6 * 10000000.1) = " + B);
        System.out.println("(true && true) = " + C);
        System.out.println("(false && true) = " + D);
        System.out.println("((false && false) || (true && true)) = " + E);
        System.out.println("(false || false) && (true && true) = " + F);
        System.out.println();

        System.out.println("Задача 2");
        Scanner in1 = new Scanner(in);
        System.out.print("Введите первое число: ");
        int G = in1.nextInt();
        Scanner in2 = new Scanner(in);
        System.out.print("Введите второе число: ");
        int H = in2.nextInt();
        Scanner in3 = new Scanner(in);
        System.out.print("Введите третье число: ");
        int I = in3.nextInt();
        Scanner in4 = new Scanner(in);
        System.out.print("Введите четвёртое число: ");
        int J = in4.nextInt();
        if (G==H && H==I && I==J){
            System.out.println("Равно");
        }else {
            System.out.println("Не равно");
        }
        System.out.println();

        System.out.println("Задача 3");
        Scanner in5 = new Scanner(in);
        System.out.print("Введите первое число: ");
        double K = in5.nextInt();
        Scanner in6 = new Scanner(in);
        System.out.print("Введите второе число: ");
        double L = in6.nextInt();
        if (K<=1 && K>=0 && L<=1 && L>=0){
            System.out.println(true);}
        else {
            System.out.println(false);
        }
        System.out.println();

        System.out.println("Задача 4");
        boolean[][]array = {{true, false, true},
                            {false, true, false}};
        int rowsLength = array.length;
        int colsLength = array[0].length;

        for (int i = 0; i < rowsLength; i++) {
            for (int j = 0; j < colsLength; j++) {
                if (array[i][j]) {
                    System.out.print(" t ");
                } else {
                    System.out.print(" f ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Задача 5");
        int[][] array2 = {
                {10, 20, 30},
                {40, 50, 60}
        };

        System.out.print("Исходный массив:\n ");
        print_array(array2);

        System.out.print("Изменённый массив:\n ");
        transpose(array2);
    }

    private static void transpose(int[][] array2) {
        int[][] array3 = new int[array2[0].length][array2.length];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                array3[j][i] = array2[i][j];
            }
        }
        print_array(array3);       // Printing the transposed array
    }

    private static void print_array(int[][] array2) {         // Method to print the elements of a 2D array
        for (int i = 0; i < array2.length; i++) {                   // Looping through the array and printing its elements
            for (int j = 0; j < array2[0].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }






    }


