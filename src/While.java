public class While {                             // Цикл с предусловием.
    public static void main(String[] args) {
        int value = 4;
        while(value<=5){
            System.out.println("Hello " + value);    // Печатай Hello ДО ТЕХ ПОР, ПОКА value не станет = 5.
            value = value+1                          // Каждый раз добавляется +1 к значению
            ;
        }


    }
}
