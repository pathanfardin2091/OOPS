public class OOPS{
    public static void main(String args[]){
        Bike b1 = new Bike();
        b1.bike_Name = "yamaha";
        System.out.println(b1.bike_Name);

        b1.price = 34;
        System.out.println(b1.price);

        Calculator calc = new Calculator();
        System.out.println(calc.sum(12, 2));
        System.out.println(calc.sum(4, 12, 2));
        System.out.println(calc.sum(1.2f, 2.4f));

        Chicken chk = new Chicken();
        chk.eat();
        chk.walks();

        Horse hrs = new Horse();
        hrs.eat();
        hrs.walks();


        Queen qn = new Queen();
        qn.moves();

        Beer br = new Beer();
        br.nonveg();

        Student s1 = new Student();
        s1.setName("Fardin Pathan");
        s1.getName();
        System.out.print(s1.percentage(88, 98,87));

        Student s2 = new Student();
        s2.setName("Suchita Varma");
        s2.getName();
        System.out.print(s1.percentage(80, 98,87));
    }
}

class Student{
    static String schoolName;
    String name;

    void setName(String name){
        this.name= name;
    }

    void getName(){
        System.out.println(this.name);
    }

    static int percentage(int math, int phy, int chem){
        return (math + phy + chem)/3;
    }
}

/**
 InnerOOPS
 */
interface Harbivore {
    void veg();
}

interface Carnivore{
    void nonveg();
}

class Beer implements Harbivore, Carnivore{
    public void nonveg(){
        System.out.println("Beer east Nonveg");
    }
    public void veg(){
        System.out.println("Beer east veg also");
    }
}
interface ChessPlayer {
    void moves();
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down, Left, Right");
    }
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("In All Directions");
    }
}


abstract class Animal{
    void eat(){
        System.out.println("East Everything");
    }

    abstract void walks();
}

class Chicken extends Animal{
     void eat(){
        System.out.println("Eats Everything");
    }

    void walks(){
        System.out.println("Chicken Walks on 2 Legs");
    }
}

class Horse extends Animal{
     void eat(){
        System.out.println("Eats Grass Only");
    }

    void walks(){
        System.out.println("Horse Walks on 4 Legs");
    }
}



class Calculator{ // function over loading ::::: polymorphism

    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    float sum(float a, float b){
        return a+b;
    }
}

class Bike{
    String bike_Name;
    int price;

    void setName(String name){
        bike_Name = name;
    }

    void setPrice(int price){
        price = price;
    }
}