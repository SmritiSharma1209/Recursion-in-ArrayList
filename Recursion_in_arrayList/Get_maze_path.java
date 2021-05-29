package Recursion_in_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_maze_path {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int sr=1;      //intial position
		int sc=1;
		int dr=n;
		int dc=m;
		ArrayList<String>list= getMazePaths(sr,sc,dr,dc);
		System.out.println(list);

	}
	
	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
		
		if(sr==dr && sc==dc) {
			ArrayList<String>bres= new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		
		
		ArrayList<String> hpaths=new ArrayList<>();
		ArrayList<String>vpaths=new ArrayList<>();
		
		if(sc<dc) {                                        // agar last column pr hai toh koi horizontal move nahi chl skte
			hpaths=getMazePaths(sr,sc+1, dr, dc);
		}
		
		if(sr<dr) {                                         // agar last row pr hai toh koi vertical move nahi chl skte
			vpaths=getMazePaths(sr+1,sc, dr, dc);
		}
		
		ArrayList<String> allpaths=new ArrayList<>();
		for(String hpath:hpaths) {
			allpaths.add("h"+hpath);
			
		}
		
		for(String vpath:vpaths) {
			allpaths.add("v"+vpath);
		}
		return allpaths;
		
		
		
		
		
	}

}
