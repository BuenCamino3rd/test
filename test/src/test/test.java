package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("EE MMM d y H:m:s ZZZ");
		String dateString = formatter.format(new Date());
		System.out.println(dateString);
		
	}

}
