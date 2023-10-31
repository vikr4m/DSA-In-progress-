public class superuse {
    public static void main(String[] args) {
       // Horse h = new Horse();
    }
}

class Animal{
    Animal(){
        System.out.println("Animal Constructor Called");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse Constructor Called");
    }
}