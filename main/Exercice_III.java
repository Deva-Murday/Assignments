package main;

import java.util.Arrays;


public class Exercice_III {
	static int [] number = {1,2,3,4,5,6,1,3,6,5,4,1,2,3,6};
	
	public static void main(String[] args) {
		System.out.println(howmany(number));
		System.out.println("The average is : " + average(number));
	}
	public static String howmany(int[] number) {
		int[] testing = (number);
		String values = Arrays.toString(testing);
		int i = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		while ( i < values.length() -1 ) {	i++;
		if (Character.toString(values.charAt(i)).equals("1")) 	{	one++;}
		if (Character.toString(values.charAt(i)).equals("2")) 	{	two++;}
		if (Character.toString(values.charAt(i)).equals("3")) 	{	three++;}
		if (Character.toString(values.charAt(i)).equals("4")) 	{	four++;}
		if (Character.toString(values.charAt(i)).equals("5")) 	{	five++;}
		if (Character.toString(values.charAt(i)).equals("6")) 	{	six++;}
		}
		int[] result = {one, two , three, four, five, six};
		String output = Arrays.toString(result);
		return output;
	}
public static float average(int[] number) {
	int[] testing = (number);
	String values = Arrays.toString(testing);
	float result = 0;
	int i = 0;
	int howmany = 0;
	while ( i < values.length() -1 ) 
	{	if (Character.toString(values.charAt(i)).equals("1") || 
			Character.toString(values.charAt(i)).equals("2") || 
			Character.toString(values.charAt(i)).equals("3") ||
			Character.toString(values.charAt(i)).equals("4") ||
			Character.toString(values.charAt(i)).equals("5") ||
			Character.toString(values.charAt(i)).equals("6")) 
		{	result = result + Integer.parseInt(Character.toString(values.charAt(i))); howmany++;	}
		i++;
	}
	result = result / howmany;
	return result;
	
}}





