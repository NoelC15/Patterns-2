
class Plus implements Expr {
	private Expr left;
	private Expr right;
	
	public Plus(Expr left, Expr right) {
		this.left = left;
		this.right =  right;
	}
	
	@Override
	public String toString() {
		return "Plus Node";
	}

	@Override
	public void accept(ExprVisitor visitor) {
		visitor.visit(this);
		
	}

	public Expr getLeft() {
		return left;
	}

	public Expr getRight() {
		return right;
	}
}


class Minus implements Expr {
	private Expr left;
	private Expr right;
	
	public Minus(Expr left, Expr right) {
		this.left = left;
		this.right =  right;
	}

	@Override
	public void accept(ExprVisitor visitor) {
		visitor.visit(this);
		
	}
}


class Times implements Expr {
	private Expr left;
	private Expr right;
	
	public Times(Expr left, Expr right) {
		this.left = left;
		this.right =  right;
	}

	@Override
	public void accept(ExprVisitor visitor) {
		visitor.visit(this);
		
	}
}


class Div implements Expr {
	private Expr left;
	private Expr right;
	
	public Div(Expr left, Expr right) {
		this.left = left;
		this.right =  right;
	}

	@Override
	public void accept(ExprVisitor visitor) {
		visitor.visit(this);
		
	}
}


class Mod implements Expr {
	private Expr left;
	private Expr right;
	
	public Mod(Expr left, Expr right) {
		this.left = left;
		this.right =  right;
	}

	@Override
	public void accept(ExprVisitor visitor) {
		visitor.visit(this);
		
	}
}


class UMinus implements Expr {
	private Expr value;
	
	public UMinus(Expr value) {
		this.value = value;
	}

	@Override
	public void accept(ExprVisitor visitor) {
		visitor.visit(this);
		
	}
	
}

class Constant implements Expr{
	private int number;
	
	public Constant(int aNumber) {
		this.number = aNumber;
	}

	@Override
	public void accept(ExprVisitor visitor) {
		visitor.visit(this);
		
	}
}

