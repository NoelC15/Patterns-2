package edu.luc.patterns;

public class Client {
	public static void main(String[] args) {
//		expr =  (-4 * 2) + (20 % 6) = - 6
		Expr expr = new Plus(
							new Times(
								new UMinus(
											new Constant(4)
										  ),
								new Constant(2)
							),
							new Mod(
									new Constant(20),
									new Constant(6)
							)
					);
								
//		TODO Try with multiple different expressions 
		ExprVisitor<String> prettyPrinter = new Printer();
		String PrintingResult = (String) expr.accept(prettyPrinter);
		System.out.print("The expression " + PrintingResult);
		
		ExprVisitor<Integer> accurateEvaluator = new Evaluator();
		Integer evaluationResult = (Integer) expr.accept(accurateEvaluator);
		System.out.println(" evaluates to " + evaluationResult);
	}
}
