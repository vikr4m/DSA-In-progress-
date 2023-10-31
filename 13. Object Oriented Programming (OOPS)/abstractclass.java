public class abstractclass {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.walk();
        // h.eat();
        // // System.out.println(h.color);
        // // // Chicken c = new Chicken();
        // // c.walk();
        // // c.eat();
        //Mustang myhorse = new Mustang();        //animal -> horse -> mustang
    }
    
}

abstract class Animal {
    String color;

    Animal(){
        System.out.println("Animal class called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse class called");
    }

    void changecolor(){
        color = "Dark Brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
    void changecolor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
