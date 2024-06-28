package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {
    
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int []a = {8,5,6,7,10,2,57,6,645};
		System.out.println("Given :" + Arrays.toString(a));
		System.out.println("Enter the Key Element :");
		
		int key = sc.nextInt();
		
		String res =  linearSearch (a, key);
		System.out.println(key + " element is :" + res);
	}
	public static String linearSearch(int[] b, int key_element) {
		for (int i=0; i<b.length; i++)
		{
			if(b[i] == key_element) {
				return "Present";
			}
		}
		return "Not Present";
	}
}
