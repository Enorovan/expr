package pobj.expr;
/**
 * Classe de représentation d'un visiteur de simplificateur d'Expression.
 * @author Enorovan + [REDACTED]
 */
public class VisitorDerive implements IVisitor<Expression> {
	/** Une variable. */
	private Var var;
	
	/**
	 * Construit un VisitorDerive à partir d'une variable donnée.
	 * @param var, la variable donnée.
	 */
	public VisitorDerive(Var var) {
		this.var = var;
	}
	
	@Override
	public Expression visit(Constant c) {
		return new Constant(0);
	}
	@Override
	public Expression visit(Add e) {
		return new Add(e.left.accept(this),e.right.accept(this));
	}
	@Override
	public Expression visit(Mult e) {
		return new Add(new Mult(e.left.accept(this),e.right),new Mult(e.left,e.right.accept(this)));
	}
	@Override
	public Expression visit(Var v) {
		if (v.equals(var)) return new Constant(1);
		return new Constant(0);
	}

}
