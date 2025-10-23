public class Variables {
    public static void main(String[] args) {
        int myInt1;
        myInt1 = 10;
        int x = 11;
        short myShort = 13574;
        long myLong = 146793;

        double myDouble = 146793.345;
        float myFloat = 146793.345f;

        char c = 'a';
        boolean b = true;

        byte myByte = 100; // -128...+127
        System.out.println((myInt1) + (x));

        String s = "Hello";
        String space = " ";
        String name = "Bob";
        System.out.println(s+space+name);
        System.out.println("Hello"+" "+"Bob");
        System.out.println("My number is "+myInt1);

        String str1 = "Java";
        String str2 = new String(); // пустая строка
        String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[] {'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 5, 2);//3 -начальный индекс, 4 -кол-во символов

        System.out.println(str1); // Java
        System.out.println(str2); //
        System.out.println(str3); // hello
        System.out.println(str4); // come

        String str5 = "Java1";
        System.out.println(str5.length());

        String str6 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        char[] helloArray = str6.toCharArray();

        String s7 = "";   // пустая строка
        if(s7.length() == 0) System.out.println("String is empty7");
        else System.out.println("String is not empty7");

        String s8 = "";    // пустая строка
        if(s8.isEmpty()) System.out.println("String is empty8");

        String s9 = null;   // строка не указывает на объект
        if(s9 == null) System.out.println("String is null9");

        String s10 = null;   // строка не указывает на объект
        if(s10==null || s.length()==0) System.out.println("String is empty10");

        String s11 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        char[] helloArray1 = s11.toLowerCase().toCharArray();
        System.out.println(helloArray1);

        String string1 = "Всё получится!"; // Создаётся новая строка в пуле строк.
        String string2 = "Всё получится!";  /* Строка с таким значением уже есть в пуле, поэтому вместо создания
                                              новой строки, возвращается ссылка на существующую строку string1 и
                                              присваивается переменной string2 */
        System.out.println("Сравнение ссылок string1 и string2: " + (string1 == string2)); //одна ссылка

        String string3 = new String("Всё получится!" );
        System.out.println("\nСравнение ссылок string1 и string3: " + (string1 == string3));  //разные ссылки
        System.out.println("\nСравнение значений string1 и string3: " + string1.equals(string3)); // значения одинаковые

        System.out.println("\nСравнение ссылок string1 и интернированной string3: " + (string1 == string3.intern()));

        boolean t = 5==5;
        System.out.println(t);


    }
}
