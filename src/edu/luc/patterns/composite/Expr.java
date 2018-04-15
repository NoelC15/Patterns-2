package edu.luc.patterns.composite;

import edu.luc.patterns.visitor.ExprVisitor;

/*
 * Component
 */
public interface Expr {
	<T> T accept(ExprVisitor<T> v);
}
