package com.eintern.session3;

public class StringMethodsDemo {
	
    public static void  main(String[] args) {
        
    	// Create by variable instantiation
    	String string1 = "Hello";
        System.out.println("Length: " + string1.length());
        System.out.println("Upper Case: " + string1.toUpperCase());
        System.out.println("Lower Case: " + string1.toLowerCase());
        System.out.println("Index of l: " + string1.indexOf('l'));
        System.out.println("Last index of l: " + string1.lastIndexOf('l'));
        System.out.println("Char at index 4: " + string1.charAt(4));

        // Create by object instantiation
        String string2 = new String("hello");
        System.out.println("Equals: " + string1.equals(string2));
        System.out.println("Equals Ignore Case: " + string1.equalsIgnoreCase(string2));
        
    }
}
