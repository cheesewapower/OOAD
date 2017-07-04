package cn.edu.cumt.book.model;

public class LoanOnlyOneSpecification implements ISpecification<Member>{
	private Book wantBook;
	public LoanOnlyOneSpecification(Book Book){
		this.wantBook = Book;
	}

	@Override
	public boolean IsSatisfiedBy(Member member) {
		return member.getLoans().stream()
				.filter(loan -> loan.hasNotBeenReturned() && wantBook.getISBN().equals(loan.getBook().getISBN()))
				.count()==0;
	}

	public Book getWantBook() {
		return wantBook;
	}

	public void setWantBook(Book wantBook) {
		this.wantBook = wantBook;
	}
}
