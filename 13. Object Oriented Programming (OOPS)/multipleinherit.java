public class multipleinherit {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.type();
        b.type1();
    }

}

interface herbivore{
    public void type();
}

interface carnivore{
    public void type1();
}

class Bear implements carnivore,herbivore{
    public void type(){
        System.out.println("Grass eating");
    }
    public void type1(){
        System.out.println("Meat eating");
    }
}



