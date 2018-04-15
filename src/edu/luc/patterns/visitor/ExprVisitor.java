package edu.luc.patterns.visitor;

import edu.luc.patterns.composite.Constant;
import edu.luc.patterns.composite.Div;
import edu.luc.patterns.composite.Minus;
import edu.luc.patterns.composite.Mod;
import edu.luc.patterns.composite.Plus;
import edu.luc.patterns.composite.Times;
import edu.luc.patterns.composite.UMinus;

public interface ExprVisitor<T> {
	public T visit(Plus plus);

	public T visit(Minus minus);

	public T visit(Times times);

	public T visit(Div div);

	public T visit(Mod mod);

	public T visit(UMinus uminus);

	public T visit(Constant constant);
}
