package com.hcl.example2;

public class AccountBO {

	public FixedAccount getAccountDetail(String detail) {
		String[] detailsArray = detail.split(",");
		FixedAccount fa = new FixedAccount(detailsArray[0], Double.parseDouble(detailsArray[1]), detailsArray[2],
				Double.parseDouble(detailsArray[3]), Integer.parseInt(detailsArray[4]));
		return fa;
	}
}
