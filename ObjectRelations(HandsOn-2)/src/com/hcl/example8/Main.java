package com.hcl.example8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String film_details;

		System.out.println("Enter Film Details :(id,name)");
		int n;
		film_details = br.readLine();
		String[] filmArray = film_details.split(",");
		System.out.println("How many Actors are there in " + filmArray[1]);
		n = Integer.parseInt(br.readLine());
		Actor[] actors_array = new Actor[n];
		for (int i = 0; i < n; i++) {
			String actor_details;
			System.out.println("Enetr Actor details: (id,name)");
			actor_details = br.readLine();
			String[] details_array = actor_details.split(",");
			Actor a = new Actor();
			a.setId(Integer.parseInt(details_array[0]));
			a.setName(details_array[1]);
			actors_array[i] = a;
		}
		Film f = new Film();
		f.setFilmName(filmArray[1]);
		f.setActors(actors_array);
		System.out.println();
		System.out.println("Film Details: ");
		System.out.println("Film name: " + f.getFilmName());
		System.out.println("\nActors are: ");
		for (Actor a : f.getActors()) {
			System.out.println(a.getName());
		}
	}

}
