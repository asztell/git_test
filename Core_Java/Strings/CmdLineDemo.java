package com.eintern.session3;



// Make sure to select project and main class in "Run Configurations" wizard
public class CmdLineDemo {

	
    // Provide program arguments through "Run Configurations" wizard
    public static void  main(String[] args) {
    	
        // Iterating over args array and printing all arguments
        for(int i=0; i<args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
