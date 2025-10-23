public class Arrays {
    public static void main(String[] args) {
        int number = 10;  // примитивный тип данных, коробка с числом [10]
        int[] numbers = new int[5];   // ссылочный тип данных, переменная numbers ссылается на коробку [массив]
                                    // numbers - типа пульт дист.управления, который ссылается на массив.
                    //при создании массива ячейки инициализируются автоматически
        System.out.println(numbers[2]); // 0 1 2 3 4 отсчёт идёт с нуля
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {  // способ1 создания массива (без инициализации)
            numbers[i] = i*10; //инициализация каждого эл-та массива
        }
        for (int i = 0; i < numbers.length; i++) {  //вывод на экран всех элементов массива
            System.out.println(numbers[i]); //вывод на экран эл-та массива под индексом i
        }
        System.out.println();
        int[] numbers2 = {1,2,3};      // способ2 создания массива - сразу инициализация! если заранее знаем числа для массива
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
     }
}
