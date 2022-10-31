package DZ;

import java.util.ArrayList;

public class My {
    public static void main(String[] args){
        System.out.println("Введите команды");
        System.out.println("add");
        System.out.println("list");
        System.out.println("exit");

        ArrayList<Animal> animals=new ArrayList<>();
        Animal cat1=new Cat();


        animals.add(new Animal());
        animals.add(cat1);
    }
}
