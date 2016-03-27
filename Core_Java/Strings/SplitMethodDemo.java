package com.eintern.session3;


public class SplitMethodDemo {
	
    public static void  main(String[] args) {
    	
        // Creating String week with days separated by "-"
        String week = "Sun-Mon-Tue-Wed-Thu-Fri-Sat";
        
        // Getting String array by splitting string based on "-" delimiter
        String[] days = week.split("-");

        // Iterating over days array and printing all elements
        for(int i=0; i<days.length; i++) {
            System.out.println(days[i]);
        }
        
    }
}
