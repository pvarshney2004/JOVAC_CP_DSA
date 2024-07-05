package Assignment03_R_B;

import java.util.Stack;

public class Reverse_Stack_Recursion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        int x = st.pop();
        reverse(st);
        insert(st,x);
    }
    public static void insert(Stack<Integer>st, int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        int x = st.pop();
        insert(st,item);
        st.push(x);
    }
}
