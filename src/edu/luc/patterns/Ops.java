package edu.luc.patterns;


class Plus implements Expr {
	private Expr left;
	private Expr right;
	
	public Plus(Expr left, Expr right) {
		this.left = left;
		this.right =  right;
	}
	

	@Override
	public <T> T accept(ExprVisitor<T> visitor){
		return visitor.visit(this);
	}

	public Expr getLeft() {
		return this.left;
	}

	public Expr getRight() {
		return this.right;
	}
}


class Minus implements Expr {
	private Expr left;
	private Expr right;
	
	public Minus(Expr left, Expr right) {
		this.left = left;
		this.right =  right;
	}
	
	public Expr getLeft() {
		return this.left;
	}

	public Expr getRight() {
		return this.right;
	}

	@Override
	public <T> T accept(ExprVisitor<T> visitor){
		return visitor.visit(this);
	}

}


class Times implements Expr {
	private Expr left;
	private Expr right;
	
	public Times(Expr left, Expr right) {
		this.left = left;
		this.right =  right;
	}
	
	public Expr getLeft() {
		return this.left;
	}

	public Expr getRight() {
		return this.right;
	}

	@Override
	public <T> T accept(ExprVisitor<T> visitor){
		return visitor.visit(this);
	}

}


class Div implements Expr {
	private Expr left;
	private Expr right;
	
	public Div(Expr left, Expr right) {
		this.left = left;
		this.right =  right;
	}
	
	public Expr getLeft() {
		return this.left;
	}

	public Expr getRight() {
		return this.right;
	}

	@Override
	public <T> T accept(ExprVisitor<T> visitor){
		return visitor.visit(this);
	}

}


class Mod implements Expr {
	private Expr left;
	private Expr right;
	
	public Mod(Expr left, Expr right) {
		this.left = left;
		this.right =  right;
	}
	
	public Expr getLeft() {
		return this.left;
	}

	public Expr getRight() {
		return this.right;
	}

	@Override
	public <T> T accept(ExprVisitor<T> visitor){
		return visitor.visit(this);
	}

}


class UMinus implements Expr {
	private Expr value;
	
	public UMinus(Expr value) {
		this.value = value;
	}
	
	public Expr getValue() {
		return this.value;
	}

	@Override
	public <T> T accept(ExprVisitor<T> visitor){
		return visitor.visit(this);
	}

	
}

class Constant implements Expr{
	private int number;
	
	public Constant(int aNumber) {
		this.number = aNumber;
	}
	public int getNumber(){
		return this.number;
	}

	@Override
	public <T> T accept(ExprVisitor<T> visitor){
		return visitor.visit(this);
	}

}

