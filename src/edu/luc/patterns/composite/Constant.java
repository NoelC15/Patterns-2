package edu.luc.patterns.composite;

import edu.luc.patterns.visitor.ExprVisitor;

/*
 * Leaf
 */

public class Constant implements Expr {
	private int number;

	public Constant(int aNumber) {
		this.number = aNumber;
	}

	public int getNumber() {
		return this.number;
	}

	@Override
	public <T> T accept(ExprVisitor<T> visitor) {
		return visitor.visit(this);
	}

}
