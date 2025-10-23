public class Classes_Objects_Methods {
    public static void main(String[] args) {
        Person person1 = new Person();  //создали 2 объекта класса Person
        person1.name = "Женя";
        person1.age = 40;
        person1.speak(); // вызов метода для person1 (чтобы метод выполнить, нужно его вызвать)
        person1.speak();
        person1.sayHello();
        System.out.println("Меня зовут "+person1.name+ ","+" мне "+person1.age+ " лет");
        Person person2 = new Person();   //создали 2 объекта класса Person
        person2.name = "Денис";
        person2.age = 9;
        person2.speak();  //вызов метода для person2
        person2.speak();
        person1.sayHello();
        System.out.println("Меня зовут "+person2.name+ ","+" мне "+person2.age+ " лет");
    }
}

class Person {                   // класс с 2 полями
    String name;
    int age;

    void speak(){
        for (int i = 0; i<3; i++){
        System.out.println("My name is "+name+",my age is "+age);}  // теперь у каждого объекта класса Person есть метод speak (поведение)
                                                                    // Потому что мы поместили его в класс, теперь не надо это писать для каждого объекта
                                                                    // Этот метод использует поля класса, поэтому для каждого объекта будут выходить свои данные
    }
    void sayHello(){
        System.out.println("Привет");                                // Этот метод не использует поля класса
    }

}