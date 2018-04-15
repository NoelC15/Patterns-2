package edu.luc.patterns.composite;

import edu.luc.patterns.visitor.ExprVisitor;

/*
 * Composite
 */

public class UMinus implements Expr {
	private Expr value;

	public UMinus(Expr value) {
		this.value = value;
	}

	public Expr getValue() {
		return this.value;
	}

	@Override
	public <T> T accept(ExprVisitor<T> visitor) {
		return visitor.visit(this);
	}
}
