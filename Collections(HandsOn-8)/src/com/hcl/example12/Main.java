package com.hcl.example12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		String file = "callog.txt";
		List<CallLog> c = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = "";

			while ((line = br.readLine()) != null) {
				String[] l1 = line.split(",");
				CallLog c1 = new CallLog(l1[0], l1[1], l1[2]);
				c.add(c1);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		CallLog.display(c);
	}

}
