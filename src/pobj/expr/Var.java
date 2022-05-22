package pobj.expr;
/**
 * Classe de représentation d'une variable.
 * @author Enorovan + [REDACTED]
 */
public class Var implements Expression {
	/** Nom de la variable. */
	private final String nom;
	
	/**
	 * Construit une variable partir d'un nom donnée.
	 * @param nom, le nom donné.
	 */
	public Var(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Renvoie l'attribut du nom.
	 * @return l'attribut du nom.
	 */
	public String getName() {
		return nom;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (!(o instanceof Var)) return false;
		Var other = (Var) o;
		return this.nom == other.nom;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append(nom);
		return sb.toString();
	}

	@Override
	public int eval() {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T accept(IVisitor<T> v) {
		return v.visit(this);
	}
}
