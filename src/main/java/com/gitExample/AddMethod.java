package com.gitExample;

public class AddMethod {
    public int addMethod(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        AddMethod add = new AddMethod();
        int a = 20;
        int b= 50;
        int res = add.addMethod(a,b);
        System.out.println(res);

    }
}
