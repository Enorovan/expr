package pobj.expr;
/**
 * Classe de représentation d'une multiplication.
 * @author Enorovan + [REDACTED]
 */
public class Mult extends BinOp implements Expression {
	/**
	 * Construit une multiplication à partir de deux opérandes.
	 * @param fg, l'opérande gauche.
	 * @param fd, l'opérande droit.
	 */
	public Mult(Expression fg, Expression fd) {
		left = fg;
		right = fd;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append(left+" * "+right);
		return sb.toString();
	}

	@Override
	public int eval() {
		return left.eval() * right.eval();
	}

	@Override
	public <T> T accept(IVisitor<T> v) {
		return v.visit(this);
	}
}
