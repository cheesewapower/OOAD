package cn.edu.cumt.book.test;

import cn.edu.cumt.book.model.Book;
import cn.edu.cumt.book.model.Loan;
import cn.edu.cumt.book.model.Member;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class BookTest {
	private static Member member=null;
	private static Book book=null;

	@Before
	public void generateData(){
		//构造人员
		member=new Member("09143688","李珂",new ArrayList<Loan>());
		//构造书籍
		book=new Book(1,"0001","java程序设计",null);
	}
	@Test
	public void testLoan() {
		//借书
		if(member.CanLoan(book)){
			Loan loan=member.Loan(book);
			System.out.println("借书成功！");
		}
		
	}

	@Test
	public void testBack() {
		//还书
		member.Return(book);
	}

}
