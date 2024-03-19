import java.util.*;

public class StckOperation {
    public static void main (String args[]){

        Stack<Integer> st=new Stack<>();

        //add

        st.push(5);
        st.push(10);
        st.push(12);
        st.push(3);
        st.push(54);
        st.push(5);

        //peek

        System.out.println(st.peek());

        //remove

        System.out.println(st.pop());

        //peek

        System.out.println(st.peek());

        //size 

        System.out.println(st.size());
    }
}
