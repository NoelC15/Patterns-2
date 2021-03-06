package edu.luc.patterns.visitor;

import edu.luc.patterns.composite.Constant;
import edu.luc.patterns.composite.Div;
import edu.luc.patterns.composite.Minus;
import edu.luc.patterns.composite.Mod;
import edu.luc.patterns.composite.Plus;
import edu.luc.patterns.composite.Times;
import edu.luc.patterns.composite.UMinus;

/* A visitor for evaluating numeric expressions (current implementation work with int ) */
public class Evaluator implements ExprVisitor<Integer> {

	@Override
	public Integer visit(Plus plus) {
		int lval = plus.getLeft().accept(this);
		int rval = plus.getRight().accept(this);
		return lval + rval;
	}

	@Override
	public Integer visit(Minus minus) {
		int lval = minus.getLeft().accept(this);
		int rval = minus.getRight().accept(this);
		return lval - rval;
	}

	@Override
	public Integer visit(Times times) {
		int lval = times.getLeft().accept(this);
		int rval = times.getRight().accept(this);
		return lval * rval;
	}

	@Override
	public Integer visit(Div div) {
		int lval = div.getLeft().accept(this);
		int rval = div.getRight().accept(this);
		return lval / rval;
	}

	@Override
	public Integer visit(Mod mod) {
		int lval = mod.getLeft().accept(this);
		int rval = mod.getRight().accept(this);
		return lval % rval;
	}

	@Override
	public Integer visit(UMinus uminus) {
		int val = uminus.getValue().accept(this);
		return (-val);
	}

	@Override
	public Integer visit(Constant constant) {
		int val = constant.getNumber();
		return val;
	}

}
