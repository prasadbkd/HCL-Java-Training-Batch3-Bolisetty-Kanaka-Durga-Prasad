package com.hcl.example3;

import java.io.IOException;

public class TestMedicine {

	public static void main(String[] args) throws IOException {

		Medicine[] medArray = Medicine.getDetails();
		for(int i=0;i<medArray.length;i++) {
			System.out.println(medArray[i]);
			medArray[i].getLable();
		}
		
	}

}
