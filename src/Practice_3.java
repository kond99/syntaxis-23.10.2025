import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int A1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int B1 = in.nextInt();
        System.out.print("Введите третье число: ");
        int C1 = in.nextInt();
        System.out.print("Наименьшее из трёх чисел будет: " + smallest(A1, B1, C1) + "\n");
        System.out.println();

        System.out.println("Задача 2");
        System.out.print("Введите первое число: ");
        double A2 = in.nextDouble();
        System.out.print("Введите второе число: ");
        double B2 = in.nextDouble();
        System.out.print("Введите третье число: ");
        double C2 = in.nextDouble();
        System.out.print("Cреднее арифметическое трёх чисел будет: " + average(A2, B2, C2) + "\n");
        System.out.println();

        in.nextLine();

        System.out.println("Задача 3");
        System.out.print("Введите слово: ");
        String str1 = in.nextLine();
        System.out.println("Средний символ в слове будет: " + middle(str1) + "\n");
        System.out.println();

        System.out.println("Задача 4");
        System.out.print("Введите слово: ");
        String str2 = in.nextLine();
        System.out.println("Количество гласных в слове: " + countVowels(str2) + "\n");
        System.out.println();

        System.out.println("Задача 5");
        System.out.print("Введите предложение: ");
        String str3 = in.nextLine();
        System.out.println("Количество слов в этом предложении: " + countWords(str3) + "\n");
    }

    public static int smallest(int A1, int B1, int C1) {
        return Math.min(Math.min(A1, B1), C1);
    }

    public static double average(double A2, double B2, double C2) {
        return (A2 + B2 + C2) / 3;
    }

    public static String middle(String str1) {
        int position;
        int length;
        if (str1.length() % 2 == 0) {
            position = str1.length() / 2 - 1;
            length = 2;
        } else {
            position = str1.length() / 2;
            length = 1;
        }
        return str1.substring(position, position + length);
    }

    public static int countVowels(String str2) {
        int count = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i'
                    || str2.charAt(i) == 'o' || str2.charAt(i) == 'u'|| str2.charAt(i) == 'а'|| str2.charAt(i) == 'ы'|| str2.charAt(i) == 'о'
                    || str2.charAt(i) == 'э'|| str2.charAt(i) == 'я'|| str2.charAt(i) == 'и'|| str2.charAt(i) == 'ю'
                    || str2.charAt(i) == 'у'|| str2.charAt(i) == 'е') {
                count++;
            }
        }
        return count;
    }
    public static int countWords(String str2) {
        int count = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == ' ') {
                count++;
            }
        }
        return count+1;
        }
}




