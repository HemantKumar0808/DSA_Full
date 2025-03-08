package NGE_PGE_NSE_PSE;

import java.util.Stack;

public class NGEMethod1 {
    public static void main(String[] args) {
        int[] arr = {8,6,4,7,4,9,10,8,12};

        int[] ans = NGEM1(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] NGEM1(int[] arr){
        int[] res = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            res[i] =-1;
//            if(st.isEmpty()){
//                st.push(i);
//            }else{
                while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                    res[st.peek()] =  arr[i];
                    st.pop();
                }
                st.push(i);
//            }
        }
        return res;
    }
}
