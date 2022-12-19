package javaInterviewTasks;

public class BiggerNum {
    public static void main(String[] args) {
        int n1 = 3, n2 = 16, n3 = 99;
        String num = (n1>n2 && n1>n3)?"n1 is biggest output":(n2>n1 && n2>n3)?"n2 is biggest output": (n3>n1 && n3>n2)?"n3 is biggest output": "Not a valid output";
        System.out.println(num);
    }
}
/*
Write a program that checks for the bigger of 3 numbers.
        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: ""n1 is bigger""
            if n2 is biggest output: ""n2 is bigger""
            if n3 is biggest output: ""n3 is bigger""

         NOTE: MUST USE TERNARY"
 */
