package com.hcl.example7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String args[]) throws NumberFormatException, IOException {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many films??");
		n = Integer.parseInt(br.readLine());
		Film[] filmArray = new Film[n];
		List <Songs> songList  = new ArrayList<>();
 		for(int i=0;i<n;i++) {
			System.out.println("Enther the film details :");//id,name
			String film = br.readLine();
			String[] s = film.split(",");
			filmArray[i] = new Film(Integer.parseInt(s[0]),s[1]);
			System.out.println("How many songs in "+filmArray[i].getName());
			int ns;
			ns= Integer.parseInt(br.readLine());
			System.out.println("Enter the songs details: ");//id:name:singer
			for(int j=0;j<ns;j++) {
				String song = br.readLine();
				String[] ss = song.split(":");
				songList.add(new Songs(Integer.parseInt(ss[0]),ss[1],ss[2],filmArray[i].getId()));				
			}	
		}
 		System.out.println("Enter the film name: ");
 		String film_name = br.readLine();
 		for(Film f: filmArray) {
 			if(f.getName().equals(film_name)) {
 				int fid = f.getId();
 				for(Songs s : songList) {
 					if(fid == s.getFilm_id()) {
 						System.out.println("Song Name: "+s.getName());
 						System.out.println("Singer: "+s.getSinger());
 					}
 				}
 			}
 		}
 		
	}
}
