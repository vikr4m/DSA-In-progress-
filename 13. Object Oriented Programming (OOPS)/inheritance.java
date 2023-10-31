public class inheritance{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.legs=4;
        System.out.println(d1.legs);
    }
}
class Animal{                   //Base class
    String color;
    void eat(){
        System.out.println("Eats");
    }

    void breathes(){
        System.out.println("Breathes");
    }
}

class mammals extends Animal{
    int legs;
    
}

class Dog extends mammals{
    String breed;
}

// class Fish extends Animal{      //Derived class or Subclass
//     int fins;

//     void swim(){
//         System.out.println("Swims");
//     }
// }