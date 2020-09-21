package com.hcl.example12;

import java.util.List;

public class CallLog {

	private String caller_name;
	private String number;
	private String duration;

	public CallLog() {

	}

	public CallLog(String caller_name, String number, String duration) {
		super();
		this.caller_name = caller_name;
		this.number = number;
		this.duration = duration;
	}

	public String getcaller_name() {
		return caller_name;
	}

	public void setcaller_name(String caller_name) {
		this.caller_name = caller_name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String toString(CallLog user) {

		return user.getcaller_name() + " (+91-" + user.getNumber() + ")\t\t" + user.getDuration() + " Seconds";
	}

	public static void display(List<CallLog> a) {
		
		a.sort((p, q) -> Integer.parseInt(p.getDuration()) - Integer.parseInt(q.getDuration()));
		System.out.println("Call-logs: ");
		System.out.println("Caller caller_name 		 	Duration");
		for (CallLog user : a) {
			System.out.println(user.toString(user));
		}
	}

}
