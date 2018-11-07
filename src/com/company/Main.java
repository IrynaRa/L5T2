package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	ArrayList<String>name1=new ArrayList<>();

	    name1.add("Oksana");
	    name1.add("Olena");
        name1.add("Davyd");
        name1.add("Petro");
        name1.add("Pavlo");

        ArrayList<String>name=new ArrayList<>();
         name.add("Oleg");
        name.add("Taras");
        name.add("Lilia");
        name.add("Ira");
        name.add("Valera");
        name.add("Oleg");

        name1.addAll(name);
        System.out.println(name1);
        System.out.println("size:" + name1.size());
        System.out.println("Oleg's first index: " + name.indexOf("Oleg"));
        System.out.println("Oleg's last index: " + name.lastIndexOf("Oleg"));




    }
}
