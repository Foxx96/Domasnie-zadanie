package DZ;

import java.util.ArrayList;
import java.util.Scanner;

public class My {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            String chose = menu();
            if (chose.equals("add")) {
                add(animals,in);
            }else if (chose.equals("list")){
                list(animals);
            }else if(chose.equals("exit")){
                return;
            }
        }







    }
            public static String menu () {
                System.out.println("Введите команды");
                System.out.println("add");
                System.out.println("list");
                System.out.println("exit");
                Scanner in = new Scanner(System.in);
                return in.nextLine();

            }

            public  static void add(ArrayList animals,Scanner in){

                System.out.println("Какое животное вы хотите создать(cat/dog/duck)");
                String animal = in.nextLine();
                System.out.println("Какое имя?");
                String name = in.nextLine();
                System.out.println("Какой вес?");
                String weight = in.nextLine();
                System.out.println("Какой цвет?");
                String color = in.nextLine();

                Animal sima = new Animal();
                if (animal.equalsIgnoreCase("cat")) {
                    sima = new Cat();
                } else if (animal.equalsIgnoreCase("dog")) {
                    sima = new Dog();
                } else if (animal.equalsIgnoreCase("duck")) {
                    sima = new Duck();
                }
                sima.setName(name);

                sima.setWeight(Double.parseDouble(weight));

                sima.setColor(color);

                sima.say();
                animals.add(sima);
            }
        public static void list (ArrayList<Animal> animals){
            for (int i=0; i<animals.size();i++)
            {
                System.out.println(animals.get(i));

                
            }



        }

}