package com.bbs.ControlStatement;

public class SwitchStatement {
	public static void main(String[] args) {
		int day = 3;
		String dayName;
		switch (day) {
		case 1:
			dayName = "MONDAY";
			break;
		case 2:
			dayName = "TUESDAY";
			break;
		case 3:
			dayName = "WEDNESDAY";
			break;
		case 4:
			dayName = "THURSDAY";
			break;
		case 5:
			dayName = "FRIDAY";
			break;
		case 6:
			dayName = "SATURDAY";
			break;
		case 7:
			dayName = "SUNDAY";
			break;
		default:
			dayName = "invalid day";
			break;
		}
		System.out.println(dayName);
	}
}
