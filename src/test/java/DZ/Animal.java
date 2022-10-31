package DZ;

public class Animal {
    protected String name;

    protected int age;

    protected double weight;

    protected String color;

    public double getWeight() {return weight;}

    public void setWeight(double weight) {this.weight = weight;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say (){
        System.out.println("Я говорю");}

    public void go (){
        System.out.println("Я иду");}

    public void drink (){
        System.out.println("Я пью");}

    public void eat (){
        System.out.println("Я ем");}

    public static void main(String[] args) {
        Animal bobic=new Animal();
        bobic.setName("Sharik");
        bobic.setAge(15);
        bobic.setColor("black");
        bobic.setWeight(50.2);
        bobic.toString();

    }


    @Override
    public String toString () {
        return "Привет! меня зовут "+name+", мне "+age+" лет, я вешу - "+weight+" кг, мой цвет - "+color+"";



    }





}
