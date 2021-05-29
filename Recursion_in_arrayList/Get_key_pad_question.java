package Recursion_in_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_key_pad_question {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.next();
		ArrayList<String>list=getKPC(str);
		System.out.println(list);

	}
	
	public static ArrayList getKPC(String str) {
		
		String arr[]= { ".;" ,"abc", "def", "ghi", "jkl" ,"mno", "pqrs", "tu", "vwx", "yz"};
		
		if(str.length()==0) {
			ArrayList<String> bres= new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		int num=str.charAt(0)-48;
		String numstr=arr[num];
		String ros=str.substring(1);
		
		ArrayList<String> half= getKPC(ros);
		ArrayList<String> result= new ArrayList<>();
		for(String rest: half) {
			for(int j=0;j<numstr.length();++j) {
				result.add( numstr.charAt(j) + rest);
			}
			
		}
		return result;
		
	  
	   
	  
	   
	}
	

}
