package Recursion_in_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class get_maze_paths_with_jump {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int sr=1;              //intial position
		int sc=1;
		int dr=n;
		int dc=m;
		ArrayList<String>list= getMazePaths(sr,sc,dr,dc);
		System.out.println(list);

	}
	
	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
		if(sr==dr && sc==dc) {
			ArrayList<String> bres=new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		
		ArrayList<String> finalPath= new ArrayList<>();
		
		for(int ms=1; ms<=dc-sc; ++ms) {
		 ArrayList<String> hpaths=getMazePaths(sr,sc+ms, dr,dc);
		 for(String hpath:hpaths) {
				
				finalPath.add("h"+ ms + hpath);
				
			}
		}
		
		
		for(int ms=1; ms<=dr-sr;++ms) {
			ArrayList <String> vpaths=getMazePaths(sr+ms, sc, dr,dc);
			for(String vpath:vpaths) {
				finalPath.add("v"+ ms + vpath);
			}
			
		}
		
		for(int ms=1; ms<=dr-sr && ms<=dc-sc; ++ms) {
			ArrayList <String> dpaths=getMazePaths(sr+1,sc+1,dr,dc);

			for(String dpath:dpaths) {
				finalPath.add("d" + ms + dpath);      //sr==sc
				
			}
		}
		
		
		return finalPath;
		
	}

}
