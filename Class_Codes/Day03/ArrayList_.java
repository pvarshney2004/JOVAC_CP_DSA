package Class_Codes.Day03;

import java.util.ArrayList;
public class ArrayList_ {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = i+1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1 , 5);

        arr[2] = 10;
        list.set(2, 10);

//        get element at particular index
        System.out.println(arr[2]);
        System.out.println(list.get(2));

    }
}