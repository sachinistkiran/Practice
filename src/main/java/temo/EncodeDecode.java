package temo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EncodeDecode {
    // Encodes a list of strings to a single string.
    public  String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        String formula = "!@#";
        System.out.println(formula);
        for (String s : strs) {
            sb.append(s + formula);
        }
        return sb.toString();
    }
    // Decodes a single string to a list of strings.
    public  List<String> decode(String s) {
        List<String> dec = new ArrayList<>();
        String[] temp = s.split("!@#");
        dec.addAll(Arrays.asList(temp));
        return dec;
    }
    public static void main(String args[]){
        EncodeDecode encodeDecode = new EncodeDecode();


        System.out.println(encodeDecode.encode(Arrays.asList(new String[]{"test1", "test2", "test3"})));
        System.out.println(encodeDecode.decode(encodeDecode.encode(Arrays.asList(new String[]{"test1", "test2", "test3"}))));
    }

    //public anyone can use
    //protected class + children
    //private only class

    //static keyword : method/variable keeps in static memory, we can use var/method without instationg the object

    //return type : what is return type of function,

    // format of static func : access-modifier static return-type function-name(arguments)
    // format of normal func : access-modifier  return-type function-name(arguments)

    //method overloading ..... method overriding
    //oops : multilevel inhertitance

    //array vs list
    /*
    array : can be declared statically but not dynamically and vice versa is list

    initializtions of array and lists and string
     */




}

