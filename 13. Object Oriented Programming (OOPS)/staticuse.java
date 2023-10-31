public class staticuse {
    public static void main(String[] args) {
      //  Student s = new Student();
    //     s.schoolname = "VC";

    //     Student s1 = new Student();
    //     System.out.println(s1.schoolname); 

    //     Student s2 = new Student();
    //     s2.schoolname="IB";
    //     System.out.println(s2.schoolname); 
    // }
    }
}

class Student{
    String name;
    int rollno;
    static String schoolname;

    void setname(String name){
        this.name = name;
    }

    String  getname(){
        return this.name;
    } 
}
