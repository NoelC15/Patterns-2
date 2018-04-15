package edu.luc.patterns.composite;

import edu.luc.patterns.visitor.ExprVisitor;

/*
 * Composite
 */

public class Plus implements Expr {
	private Expr left;
	private Expr right;

	public Plus(Expr left, Expr right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public <T> T accept(ExprVisitor<T> visitor) {
		return visitor.visit(this);
	}

	public Expr getLeft() {
		return this.left;
	}

	public Expr getRight() {
		return this.right;
	}
}