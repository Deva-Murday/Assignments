package main;

import java.util.ArrayList;
import java.util.List;

//import java.util.Scanner;

public class Good {
	static List<String> names = new ArrayList<String>();
	static List<Double> prices = new ArrayList<Double>();
	static List<Integer> numbers = new ArrayList<Integer>();
	
public static void main(String[] args) {
	set();
	System.out.println(get(1)); 
	System.out.println(vat(prices)); 
	System.out.println(cheaper(1,names, prices)); 
	}

public static String get(int id) {
	int item_number = numbers.get(id);
	String item_name = names.get(id);
	double item_price = prices.get(id);
	String item = item_name + " ; " + item_price + " ; " + item_number;
	return item;}

public static void set() {	
	names.add("item1");
	prices.add(9.99);
	numbers.add(1);
	names.add("item2");
	prices.add(19.99);
	numbers.add(2);
	numbers.add(1);
	names.add("item3");
	prices.add(99.99);
	numbers.add(2);
	}

public static double vat(List<Double> prices) {
	double vat = prices.get(0) * 0.2;
	return vat;
}

public static String cheaper(int id,List<String> names,List<Double> prices) {
	double price1 = prices.get(id);
	double price2 = prices.get(id+1);
	if (price1 < price2 ) {return names.get(id);}
	else {return names.get(id+1); }
}
}