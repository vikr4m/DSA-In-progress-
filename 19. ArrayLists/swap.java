import java.util.ArrayList;
public class swap{
    public static void swapping(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        //index of the elements to be swapped are 1 and 3
        System.out.println("Before swapping of 1 and 3 index\n"+list);

        int idx1 = 1,idx2 = 3;
        swapping(list,idx1,idx2);
        System.out.println("After swapping of 1 and 3 index\n"+list);

    }
}