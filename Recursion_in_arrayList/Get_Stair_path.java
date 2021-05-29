package Recursion_in_arrayList;
import java.util.ArrayList;

import java.util.Scanner;

public class Get_Stair_path {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<String>list= getStairPaths(n);
		System.out.println(list);

	}
	public static ArrayList getStairPaths(int n) {               //haam stair se sirf neeche hi utar rahe hai..
		if(n==0) {    // 0 se 0 jana valid hai aur haam ja skte h ..ek rasta hai ki tum 0 floor se move hi mat karo.
			ArrayList<String> bres= new ArrayList<>();
			bres.add("");
			return bres;
		}
		else if (n<0){               //negative aya toh bhi sirf neeche jaane ka hi option hai toh haam kuch kar hi nahi skte s case mai koi rasta nahi hai
			ArrayList<String> bres= new ArrayList();
			return bres;
		
		}
		
		ArrayList<String>paths1=getStairPaths(n-1);      //faith hai ki n-1 se 0 ke saare paths dega
		ArrayList<String>paths2=getStairPaths(n-2);      //faith hai ki n-2 se 0 ke saare paths dega
		ArrayList<String>paths3=getStairPaths(n-3);       //faith hai ki n-3 se 0 ke saare paths dega
		ArrayList<String> finalpaths=new ArrayList<>();
 		
		for(String path:paths1) {                           // aab jo path n-1 se aaya hai usme 1 chipka do toh n se 0 ka path mil jayega.
			finalpaths.add(1+path);
		}
		
		for(String path:paths2) {
			finalpaths.add(2+path);
		}
		for(String path:paths3) {
			finalpaths.add(3+path);
		}
		
		return finalpaths;
	}

}
