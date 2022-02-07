package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		
		SimpleDateFormat nowtime = new SimpleDateFormat("y-MM-dd HH:mm:ss");
		String dateString = nowtime.format(new Date());
		System.out.println(dateString);
		
		String dueDate = nowtime.format(new Date(System.currentTimeMillis() + 3600000));
		System.out.println(dueDate); // 만료시간(실제로 보낼 것)
		
		
	}
}
