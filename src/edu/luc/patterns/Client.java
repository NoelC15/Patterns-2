package edu.luc.patterns;

public class Client {
	public static void main(String[] args) {

		Expr p = 
				new Plus(
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
	    Expr q =
	            new Mod(
	              new Minus(
	                new Plus(
	                  new Constant(1),
	                  new Constant(2)
	                ),
	                new Times(
	                  new UMinus(
	                    new Constant(3)
	                  ),
	                  new Constant(4)
	                )
	              ),
	              new Constant(5)
	            );
	    Expr complex = new Plus(p, q);
								
		ExprVisitor<String> prettyPrinter = new Printer();
		String PrintingResult = (String) complex.accept(prettyPrinter);
		System.out.print("The expression " + PrintingResult);
		
		ExprVisitor<Integer> accurateEvaluator = new Evaluator();
		Integer evaluationResult = (Integer) complex.accept(accurateEvaluator);
		System.out.println(" evaluates to " + evaluationResult);
		
		
	}
}
