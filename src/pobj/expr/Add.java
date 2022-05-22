package pobj.expr;
/**
 * Classe de représentation d'une addition.
 * @author Enorovan + [REDACTED]
 */
public class Add extends BinOp {
	/**
	 * Construit une addition à partir de deux opérandes.
	 * @param fg, l'opérande gauche.
	 * @param fd, l'opérande droit.
	 */
	public Add(Expression fg, Expression fd) {
		left = fg;
		right = fd;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append("( "+left+" + "+right+" )");
		return sb.toString();
	}

	@Override
	public int eval() {
		return left.eval() + right.eval();
	}

	@Override
	public <T> T accept(IVisitor<T> v) {
		return v.visit(this);
	}
}
