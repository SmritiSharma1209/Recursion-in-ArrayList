package Recursion_in_arrayList;
import java.util.Scanner;
import java.util.ArrayList;


public class get_subsequence {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		String str=s.next();
		ArrayList<String>list=gss(str);
		System.out.println(list);
		
}
	
	public static ArrayList gss(String str) {
		
		if(str.length()==0) {
			ArrayList<String> bres=new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		char ch=str.charAt(0);   //a
		String ros= str.substring(1);   //bc
		ArrayList<String> res= gss(ros);   //[--, b-, -c, bc]
		
		ArrayList<String> mes=new ArrayList<>();
		for(String rstr: res) {
			mes.add(""+rstr);
			mes.add(ch+rstr);
		}
		return mes;
		
		
		
	}

}
