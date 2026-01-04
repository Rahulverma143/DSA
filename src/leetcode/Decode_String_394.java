package leetcode;

import java.util.Stack;

public class Decode_String_394 {

    public static void main(String[] args) {
        String s = "3[a2[c]]"; 
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                count = count * 10 + (c - '0'); 
            } else if (c == '[') {
                counts.push(count);      
                resultStack.push(sb);    
                sb = new StringBuilder(); 
                count = 0;                
            } else if (c == ']') {
                StringBuilder temp = sb;
                sb = resultStack.pop(); 
                int repeat = counts.pop();
                for (int j = 0; j < repeat; j++) {
                    sb.append(temp);
                }
            } else {
                sb.append(c);             }
        }

        System.out.println("Decoded string: " + sb.toString());
    }
}
