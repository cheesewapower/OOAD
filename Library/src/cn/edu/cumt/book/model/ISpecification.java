package cn.edu.cumt.book.model;

public interface ISpecification<T> {
	boolean IsSatisfiedBy(T entity);
}
