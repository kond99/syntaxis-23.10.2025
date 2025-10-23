public class Strings {
    public static void main(String[] args) {

        String s = "Hello";
        String space = " ";
        String name = "Bob";
        System.out.println(s+space+name);
        System.out.println("Hello"+" "+"Bob");  // Конкатенация строк - ОБЪЕДИНЕНИЕ

        int myInt1 = 10;
        System.out.println("My number is "+ myInt1);  // преобразование числа в строку при их сложении!

        String str1 = "Java";
        String str2 = new String(); // пустая строка - создание объекта через конструктор
        String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'}); // создание строки из символов массива
        String str4 = new String(new char[] {'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 5, 2);//3 -начальный индекс, 4 -кол-во символов

        System.out.println(str1); // Java
        System.out.println(str2); //
        System.out.println(str3); // hello
        System.out.println(str4); // come

        String str5 = "Java1";
        System.out.println(str5.length()); // вывод длины строки, количества символов

        String str6 = new String(new char[] {'h', 'e', 'l', 'l', 's'}); // создание нового объекта строки из символов, конструктор принимает массив символов и создаёт строку
        char[] helloArray = str6.toCharArray();      /*создаёт новый массив типа char[], элементы которого представляют каждый символ строки str6 в том же порядке.
                                                        Длина массива равна длине строки.*/
        System.out.println(str6);
        System.out.println(helloArray);

        String s7 = "";   // пустая строка
        if(s7.length() == 0) System.out.println("String is empty7"); // метод length() возвращает длину строки (кол-во символов)
        else System.out.println("String is not empty7");   // length() безопасно использовать для уже инициализированных строк, иначе будет NullPointerException

        String s8 = "";    // Метод isEmpty() в классе String в Java используется для проверки, является ли строка пустой — то есть содержит ли она 0 символов.
        if(s8.isEmpty()) System.out.println("String is empty8");

        String s9 = null;   // строка не указывает на объект, отсутствие ссылки на объект
        if(s9 == null) System.out.println("String is null9"); // вызов методов для такой переменной вызвал бы NullPointerException.

        String s10 = null;   // строка не указывает на объект
        if(s10==null || s.length()==0) System.out.println("String is empty10");
        /*попытка проверки. условие s10 == null проверяет, указывает ли переменная на объект или нет. Если s10 равно null,
        то это означает, что переменная не ссылается ни на какой объект, и вызов метода s.length() вызовет исключение NullPointerException.*/

        String s11 = new String(new char[] {'H', 'e', 'l', 'l', 'O'});
        char[] helloArray1 = s11.toUpperCase().toCharArray(); //преобразует все символы строки в верхний регистр,
                                                             // а затем toCharArray() создаёт массив символов, содержащий эти преобразованные символы.
        System.out.println(helloArray1);

        String string1 = "Всё получится!"; // Создаётся новая строка в пуле строк.
        String string2 = "Всё получится!";  /* Строка с таким значением уже есть в пуле, поэтому вместо создания
                                              новой строки, возвращается ссылка на существующую строку string1 и
                                              присваивается переменной string2 */
        System.out.println("Сравнение ссылок string1 и string2: " + (string1 == string2)); //TRUE, одна ссылка

        String string3 = new String("Всё получится!" ); // Явно создали новый объект с новой ссылкой, но с тем же содержанием.
        System.out.println("\nСравнение ссылок string1 и string3: " + (string1 == string3));  // FALSE, разные ссылки
        System.out.println("\nСравнение значений string1 и string3: " + string1.equals(string3)); // TRUE, хоть и разные ссылки, но значения одинаковые!

        System.out.println("\nСравнение ссылок string1 и интернированной string3: " + (string1 == string3.intern())); // интернирование
    }
}
