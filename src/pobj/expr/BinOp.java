package pobj.expr;
/**
 * Classe de représentation abstraite d'une opération binaire.
 * @author Enorovan + [REDACTED]
 */
public abstract class BinOp implements Expression {
	/** L'opérande gauche. */
	protected Expression left;
	/** L'opérande droit. */
	protected Expression right;
	/**
	 * Accède à l'attribut de l'opérande gauche.
	 * @return l'attribut de l'opérande gauche.
	 */
	public Expression getLeft() {
		return left;
	}
	/**
	 * Accède à l'attribut de l'opérande droit.
	 * @return l'attribut de l'opérande droit.
	 */
	public Expression getRight() {
		return right;
	}
	
	
}
