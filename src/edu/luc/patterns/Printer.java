package edu.luc.patterns;

/* A visitor for printing expressions */

public class Printer implements ExprVisitor<String> {

	@Override
	public String visit(Plus plus) {
		StringBuilder result = new StringBuilder();
		result.append("(");
		result.append( plus.getLeft().accept(this));
		result.append(" + ");
		result.append( plus.getRight().accept(this));
		result.append( ")");
		return result.toString();
		
	}

	@Override
	public String visit(Minus minus) {
		StringBuilder result = new StringBuilder();
		result.append("(");
		result.append( minus.getLeft().accept(this));
		result.append(" - ");
		result.append( minus.getRight().accept(this));
		result.append( ")");
		return result.toString();
		
	}

	@Override
	public String visit(Times times) {
		StringBuilder result = new StringBuilder();
		result.append("(");
		result.append( times.getLeft().accept(this));
		result.append(" * ");
		result.append( times.getRight().accept(this));
		result.append( ")");
		return result.toString();		
	}

	@Override
	public String visit(Div div) {
		StringBuilder result = new StringBuilder();
		result.append("(");
		result.append( div.getLeft().accept(this));
		result.append(" / ");
		result.append( div.getRight().accept(this));
		result.append( ")");
		return result.toString();		
	}

	@Override
	public String visit(Mod mod) {
		StringBuilder result = new StringBuilder();
		result.append("(");
		result.append( mod.getLeft().accept(this));
		result.append(" % ");
		result.append( mod.getRight().accept(this));
		result.append( ")");
		return result.toString();
		
	}

	@Override
	public String visit(UMinus uminus) {
		StringBuilder result = new StringBuilder();
		result.append("(");
		result.append(" - ");
		result.append( uminus.getValue().accept(this));
		result.append( ")");
		return result.toString();
	}

	@Override
	public String visit(Constant constant) {
		return Integer.toString(constant.getNumber());
		
	}

}
