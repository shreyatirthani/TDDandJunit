package org.example;

import java.util.Scanner;

public class Remove {
    public String removeA(String input){
        String result = input;

        if(input.length()<=2 && input.contains("A") ){
            result = result.replace("A","");
        }
        else if(input.length()<=2)
        {
            return result;
        }
        else{
            String two = input.substring(0,2);
            String rest = input.substring(2,input.length());
            result = two.replace("A","") + rest;
        }

        return result;

    }
}
