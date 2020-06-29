package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        Remove r = new Remove();
        System.out.println("Enter string : ");
        String string = sc.next();
        System.out.println("Result string : " + r.removeA(string));
    }
}
