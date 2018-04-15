package edu.luc.patterns.composite;

import edu.luc.patterns.visitor.ExprVisitor;

/*
 * Composite
 */

public class Times implements Expr {
	private Expr left;
	private Expr right;

	public Times(Expr left, Expr right) {
		this.left = left;
		this.right = right;
	}

	public Expr getLeft() {
		return this.left;
	}

	public Expr getRight() {
		return this.right;
	}

	@Override
	public <T> T accept(ExprVisitor<T> visitor) {
		return visitor.visit(this);
	}

}