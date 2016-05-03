package main;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice_I {
	static String text, text1, text2, text3;
	static int[] numbers;
	
public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	System.out.println("Hi, please enter your text, text1,text2 and then your text3 ");
	text = 		sc.nextLine();
	text1 = 	sc.nextLine();
	text2 = 	sc.nextLine();
	text3 = 	sc.nextLine();
	
	reverse(text);
	System.out.println("The best word in an alphabetical order is : " + alphabetical(text1, text2, text3));
	System.out.println("The sorted test is : " + sorted(numbers));}

public static void reverse(String text) {
	int i = text.length() - 1;
	while (i >= 0) {
		System.out.println(text.charAt(i));
		i--;
	}
}
	
public static boolean sorted(int[] numbers) {
	int[] testing = (numbers);
	String values = Arrays.toString(testing);
	
	Arrays.sort(numbers);
	String test = Arrays.toString(numbers);
	
	if (values.equals(test)) 	{return true ;}
	else 						{return false;}
}

public static String alphabetical(String text1, String text2, String text3) {	
	char[] array = {text1.charAt(0), text2.charAt(0), text3.charAt(0)};
	Arrays.sort(array);
	String[] test = {text1, text2, text3};
	Arrays.sort(test);
	String sort = Arrays.toString(array);
	String sorted = Character.toString(sort.charAt(1));
	
	String val1 = Character.toString(text1.charAt(0));
	String val2 = Character.toString(text2.charAt(0));
	if (sorted.equals(val1)) 
	{ 	return text1;	}
	
	else if (sorted.equals(val2)) 
	{ 	return text2;	}
	
	else 
	{	return text3;	}	
}


}