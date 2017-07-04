package cn.edu.cumt.book.model;

import java.util.ArrayList;

public class Member {
	private String Id;
	private String Name;
	private ArrayList<Loan> Loans;
	
	public void Return(Book book){
		Loan loan=FindCurrentLoanFor(book);
		if(loan!=null){
			loan.MarkAsReturned();
			book.setLoanTo(null);
		}
	}
	
	public boolean CanLoan(Book book){
		HasReachMaxSpecification hasReachMaxSpecification=new HasReachMaxSpecification();
		LoanOnlyOneSpecification loanOnlyOneSpecification=new LoanOnlyOneSpecification(book);

		return book.getLoanTo()==null && hasReachMaxSpecification.IsSatisfiedBy(this)&& loanOnlyOneSpecification.IsSatisfiedBy(this);
	}
	
	public Loan Loan(Book book){
		Loan loan=null;
		if(CanLoan(book)){
			loan=LoanFactory.CreateLoan(book, this);
		}
		return loan;
	}
	
	public Loan FindCurrentLoanFor(Book Book){
		return null;
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public ArrayList<Loan> getLoans() {
		return Loans;
	}
	public void setLoans(ArrayList<Loan> loans) {
		Loans = loans;
	}

	public Member(String id, String name, ArrayList<Loan> loans) {
		Id = id;
		Name = name;
		Loans = loans;
	}
}
