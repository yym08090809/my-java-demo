package com.lcx.leetCode;

import java.util.HashMap;
import java.util.Stack;

public class Demo20 {
    private HashMap<Character, Character> map;

    public Demo20() {
        this.map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (this.map.containsKey(c)) {
                //获取栈中的栈顶元素，若栈顶元素为空则设置为‘#’
                char topElement = stack.empty() ? '#' : stack.pop();

                if (topElement != this.map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(new Demo20().isValid(s));
    }
}
