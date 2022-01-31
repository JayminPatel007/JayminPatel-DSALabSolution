package com.company.Question1;

import java.util.Scanner;
import java.util.Stack;

public class Impl {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String");
        String str = sc.nextLine();
        boolean isStringBalanced = checkIsStringBalanced(str);
        if (isStringBalanced) {
            System.out.println("The entered Strings contain Balanced Brackets");
        } else {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
    }

    public static boolean checkIsStringBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch =='{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                switch (ch) {
                    case ')':
                        char poppedChar = stack.pop();
                        if (poppedChar == '{' || poppedChar == '[') {
                            return false;
                        }
                        break;
                    case '}':
                        poppedChar = stack.pop();
                        if (poppedChar == '(' || poppedChar == '[') {
                            return false;
                        }
                        break;
                    case ']':
                        poppedChar = stack.pop();
                        if (poppedChar == '(' || poppedChar == '{') {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
