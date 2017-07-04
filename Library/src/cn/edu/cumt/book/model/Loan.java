package cn.edu.cumt.book.model;

import java.util.Date;

public class Loan {
	private String Id;
	private Date LoanDate;
	private Date DateForReturn;
	private Date ReturnDate;
	private Book Book;
	private Member Member;


	public Loan(String id, Date loanDate, Date dateForReturn, Date returnDate, cn.edu.cumt.book.model.Book book,
			cn.edu.cumt.book.model.Member member) {
		super();
		Id = id;
		LoanDate = loanDate;
		DateForReturn = dateForReturn;
		ReturnDate = returnDate;
		Book = book;
		Member = member;
	}

	public boolean HasNotBeenReturned(){
		return ReturnDate==null;
	}

	public boolean hasNotBeenReturned(){
		return ReturnDate==null;
	}

	public void MarkAsReturned(){
		ReturnDate=new Date();
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public Date getLoanDate() {
		return LoanDate;
	}
	public void setLoanDate(Date loanDate) {
		LoanDate = loanDate;
	}
	public Date getDateForReturn() {
		return DateForReturn;
	}
	public void setDateForReturn(Date dateForReturn) {
		DateForReturn = dateForReturn;
	}
	public Book getBook() {
		return Book;
	}
	public void setBook(Book book) {
		Book = book;
	}
	public Member getMember() {
		return Member;
	}
	public void setMember(Member member) {
		Member = member;
	}

	public Date getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(Date returnDate) {
		ReturnDate = returnDate;
	}
	
	
	
	
}
