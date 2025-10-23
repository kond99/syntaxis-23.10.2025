import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Scanner temp =  new Scanner(System.in);
        System.out.print("Введите значение температуры по Фаренгейту: ");
        double farenheit = temp.nextDouble();
        double celsius = ((5.0/9.0)*(farenheit - 32));
        System.out.println(farenheit + " градусов по Фаренгейту соответствует " + celsius + " градусов по Цельсию");
        System.out.println();

        System.out.println("Задача 2");
        Scanner inch =  new Scanner(System.in);
        System.out.print("Введите значение в дюймах: ");
        double A = inch.nextDouble();
        double B = A*0.0254;
        System.out.println(A + " дюймов - это " + B + " метров");
        System.out.println();

        System.out.println("Задача 3");
        Scanner round =  new Scanner(System.in);
        System.out.print("Введите целое число от 0 до 1000: ");
        int number = round.nextInt();
        int firstDigit = number % 10;
        int restNumber = number / 10;
        int SecondDigit = restNumber % 10;
        restNumber = restNumber / 10;
        int thirdDigit = restNumber % 10;
        restNumber = restNumber / 10;
        int fourthDigit = restNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("Сумма всех цифр числа " + number + " составит " + sum);
        System.out.println();

        System.out.println("Задача 4");
        double minutesInYear = 365*24*60;
        Scanner minutesQuantity =  new Scanner(System.in);
        System.out.print("Введите количество минут: ");
        double min = minutesQuantity.nextDouble();
        long yearsQuantity = (long) (min/minutesInYear);
        int daysQuantity = (int)((min/60/24) % 365);
        System.out.println((int) min + " минут - это примерно " + yearsQuantity + " лет и " + daysQuantity + " дней.");
        System.out.println();

        System.out.println("Задача 5");
        Scanner input = new Scanner(System.in);
        System.out.print("Введите смещение часового пояса относительно GMT: ");
        long timeZoneChange = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + timeZoneChange) % 24);
        System.out.println("Текущее время " + currentHour + ":" + currentMinute + ":" + currentSecond);

    }
}
