public class stu{
    public static void main(String[] args) {
        // Student s1 = new Student("vikram");
        // Student s2 = new Student(101);      //Parametirised constructor
        // Student s3 = new Student();                //non parameterised
        
    }
}
class Student{
    int roll;
    String name;

    Student(){
        System.out.println("Constructor is called");
    }

    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}