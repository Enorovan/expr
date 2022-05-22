package pobj.expr;
/**
 * Classe de représentation d'une constante.
 * @author Enorovan + [REDACTED]
 */
public class Constant implements Expression {
	/** Valeur de la constante. */
	private int valeur;
	
	/**
	 * Construit une constante à partir d'une valeur donnée.
	 * @param valeur, la valeur donnée.
	 */
	public Constant(int valeur) {
		this.valeur = valeur;
	}
	/**
	 * Construit une constante nulle.
	 */
	public Constant() {
		valeur = 0;
	}
	/**
	 * Renvoie l'attribut de la valeur.
	 * @return l'attribut de la valeur.
	 */
	public int getValue() {
		return valeur;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (!(o instanceof Constant)) return false;
		Constant other = (Constant) o;
		return this.valeur == other.valeur;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append(valeur);
		return sb.toString();
	}
	@Override
	public int eval() {
		return valeur;
	}
	@Override
	public <T> T accept(IVisitor<T> v) {
		return v.visit(this);
	}
}
