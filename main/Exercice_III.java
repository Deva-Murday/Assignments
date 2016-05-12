package main;

import java.util.Arrays;


public class Exercice_III {
	static int [] number = {1,2,3,4,5,6,1,3,6,5,4,1,6,2,3,6};
	
	public static void main(String[] args) {
		System.out.println(best(number));
		System.out.println(findthesix(number));
			}
	public static String howmany(int[] number) {
		String values = Arrays.toString(number);
		int i = 0;
		int one = 0;		int two = 0;
		int three = 0;		int four = 0;
		int five = 0;		int six = 0;
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
	String values = Arrays.toString(number);
	float result = 0;
	int i = 0;
	int howmany = 0;
	
	while ( i < values.length() -1 ) 
	{	String cases = Character.toString(values.charAt(i));
		if (cases.equals("1") || 
			cases.equals("2") || 
			cases.equals("3") || 
			cases.equals("4") || 
			cases.equals("5") || 
			cases.equals("6")  )
		{	result = result + Integer.parseInt(cases); howmany++;	}
		i++;
	}
	result = result / howmany;
	return result;
	
}

public static int findthesix(int[] number) {
	String values = Arrays.toString(number);
	int place = 1;
	String cases = "";
	int i = 0;
	while (i < number.length) {
	cases = Character.toString(values.charAt(i));
	if (cases.equals("1") || cases.equals("2") || cases.equals("3") || cases.equals("4") || cases.equals("5")) {
		place++;i++; 	}
	else if (!cases.equals("6")) {i++;}}
	return place;	
}


public static int best(int[] number) {
	String values = Exercice_III.howmany(number);
	int i = 0;
	int current;
	int best = 0;
	while (i < values.length()) {
		String cases = Character.toString(values.charAt(i));
		if (cases.equals("1") || cases.equals("2") || cases.equals("3") || cases.equals("4") || cases.equals("5") || cases.equals("6")) {
			current = Integer.parseInt(cases);
			if (current > best) {	best = current;	}
			i++;	}
		else {i++;	}
	}
	return best;
	}
}




