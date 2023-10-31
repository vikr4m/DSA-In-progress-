public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();     //Pen obeject p1
        p1.setColor("blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class BankAccount{
    
}

class Pen{
    //properties
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int che, int mat){
        percentage = (phy + mat + che)/ 3;

    
    }
}
