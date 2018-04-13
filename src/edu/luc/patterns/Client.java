package edu.luc.patterns;

public class Client {
	public static void main(String[] args) {
		Expr expr = new Plus(new Constant(1), new Minus(new Constant(3), new UMinus(new Constant(12))));
//		TODO Try with multiple different expressions 
		ExprVisitor<String> prettyPrinter = new Printer();
		String PrintingResult = (String) expr.accept(prettyPrinter);
		System.out.print("The expression " + PrintingResult);
		
		ExprVisitor<Integer> accurateEvaluator = new Evaluator();
		Integer evaluationResult = (Integer) expr.accept(accurateEvaluator);
		System.out.println(" evaluates to " + evaluationResult);
	}
}
