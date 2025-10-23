public class If {
    public static void main(String[] args) {
        int myInt = 15;
        if (myInt < 10) {  // false
            System.out.println("да, верно"); // не напишет
        } else if (myInt > 20) {                            //В работе с условным оператором if, блок else (иначе) выполняется в том случае, когда if выдал false.
            System.out.println("нет, не верно"); // не напишет
        } else {
            System.out.println("ни один из предыдущих случаев.");
        }
        int myInt1 = 5;
        if (myInt1 < 10) {
            System.out.println("да, верно");
        } else if (myInt1 < 20) {   // не дойдёт до этой строки.
            System.out.println("нет, не верно"); //Несмотря на то, что выполняются оба условия, результат будет выдан только по первому, т.к. программа работает сверху вниз.
        }
    }
}
