package com.eintern.session3;


// Don't use existing Java class names for your class name
public class StringDemo {
	
    public static void  main(String[] args) {
    	
        // Creating String in variable style
        String string1 = "Hello";
        
        // Creating String in object style
        String string2 = new String("Hello");

        // There won’t be any difference, regardless of the way the string was created 
        System.out.println("String1: " + string1);
        System.out.println("String2: " + string2);
    }
}
