package cn.edu.cumt.book.model;

public class HasReachMaxSpecification implements ISpecification<Member> {

	@Override
	public boolean IsSatisfiedBy(Member member) {
		return member.getLoans().stream().filter(loan -> loan.hasNotBeenReturned()).count()<3;
	}
}
