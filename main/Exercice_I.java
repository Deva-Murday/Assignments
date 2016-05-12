package main;

import java.util.Arrays;

public class Exercice_I {
	static String text, text2, text3;
	static String[] text1;
	static int[] numbers;
	
public static String reverse(String text) {
	int i =  text.length() - 1;
	String reverse = "";
	while (i >= 0) {
		String current = Character.toString(text.charAt(i));
		reverse = reverse + current;	
		i--;}
	return reverse;
}
	
public static boolean sorted(int[] numbers) {
	int[] testing = (numbers);
	String values = Arrays.toString(testing);
	Arrays.sort(numbers);
	String test = Arrays.toString(numbers);
	int nb = values.compareTo(test);
	if (nb == 0) 	{return true ;}
	else 			{return false;}
}


public static String alphabetical(String text1, String text2, String text3) {	
	String[] array = {text1 , text2, text3};
	String[] test = {text1, text2, text3};
	Arrays.sort(test);
	String initial = Arrays.toString(array);
	String sorted = Arrays.toString(test);
	
	int nb = initial.compareTo(sorted);
	if (nb == 0) 
	{ 	return text1;	}
	else if (nb > 0)
	{ 	return text2;	}
	
	else 	{	return text3;	}
}

}