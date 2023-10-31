import java.util.ArrayList;
public class intro {
    public static void main(String[] args) {
    //ClassName obectname = new classname();
    ArrayList<Integer> list = new ArrayList<>();        //to create arraylist

    list.add(5);        // to add elements to arraylist
    list.add(10);
    list.add(15);
    list.add(20);
    System.out.println(list);

    int element = list.get(2);      //to get an element using index
    System.out.println(element);

    list.remove(2);         //to remove element from arraylist using index
    System.out.println(list);

    list.set(2, 25);        //to set/change value using index
    System.out.println(list);

    System.out.println(list.contains(25));      //to check whether an element exist in an arraylist or not
    System.out.println(list.contains(12));

    list.add(1,45);     //to add an element on a particular index
    System.out.println(list);

    System.out.println(list.size());    //to print size

    for(int i=0; i< list.size(); i++){      //to print arraylist without the arrylist list format
        System.out.print(list.get(i)+" ");
    }

    }
}
