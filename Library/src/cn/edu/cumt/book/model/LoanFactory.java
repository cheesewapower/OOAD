package cn.edu.cumt.book.model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LoanFactory {
	public static Loan CreateLoan(Book book, Member member) {
		Date date = new Date();
		Date dateForReturn=new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(calendar.DATE, 10);// 把日期往后增加一天.整数往后推,负数往前移动
		dateForReturn = calendar.getTime(); // 这个时间就是日期往后推十天的结果
		Loan loan = new Loan(null, date, dateForReturn, null, book, member);
		return loan;
	}
}
