public class Program {
    public static void main(String[] args) {

      //  int a;
      //  System.out.println(a);

        int b = 100; // создание и иниц. переменной
        // создание объекта класс
        Car bmw = new Car();
        Car opel = new Car("Opel Corsa",100);
        opel.setName("Opel Vectra");
        String str = opel.getName();
        System.out.println(opel);

        Car tesla = new ECar("Tesla", 200, 8);
        System.out.println(tesla.getPower());

        // ПРимеры полиморфизма: override(переопределение), overload(перегрузка)

        // public, private, protected, default (не пишем)

    }
}