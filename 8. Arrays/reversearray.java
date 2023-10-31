public class reversearray {
    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        int first = 0, last = array.length-1;
        int temp;
        System.out.println("Normal Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

        while (first < last) {
            temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            last--;
            first++;
        }
        System.out.println();
        System.out.println("Reversed Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
