package project;

import java.time.LocalDate;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfYear());
	}

}
