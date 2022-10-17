/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.signingcloud.restapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author MohdArifDzainalAbidi
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class DataStructure {

    public static void main(String[] args) throws Exception {
        // I want you to  print the value of the "data" map below
        // the expected result is "welcome to experian"
        final Map<String, String> data = new HashMap<>();

        data.put("third", "Experian");
        data.put("second", "to");
        data.put("first", "Welcome");

        // System.out.println(data.values());

        for (Object obj : data.entrySet()) {
            Map.Entry<String, String> entry = (Map.Entry) obj;
//            System.out.print("Key: " + entry.getKey());
            System.out.print(" " + entry.getValue());
            
//            if (entry.getKey().("first")) {
//            
//            }
        }

        // I want you print only the unique city from the list below.
        // I expect it to be only 6 unique cities instead of 9.
        // i.e.: Kuala Lumpur, New Delhi, Bangalore, Munich, Jakarta, Los Angeles.
        // NOTE: ordering doesn't matter.
        final List<String> cities = Arrays.asList(
                "Kuala Lumpur",
                "Kuala Lumpur",
                "New Delhi",
                "Bangalore",
                "Munich",
                "Jakarta",
                "Los Angeles",
                "Jakarta",
                "Bangalore"
        );

        List<String> newCity = new ArrayList<>();

        for (String i : cities) {
            if (!newCity.contains(i)) {
                newCity.add(i);
            }
        }

        System.out.println(newCity);
        
        //System.out.println("Hello World");
		
//        int x = 10;
//        
//        try {
//            System.out.println("Hello");
//            throw new IllegalStateException("Oh no yo");
////            throw new Exception("no no no ");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println(x);
//        }
    }
}
