package pobj.expr;
/**
 * Interface définissant une expression.
 * @author Enorovan + [REDACTED]
 */
public interface Expression {
    /**
     * Calcule le résultat de l'Addition et de la Multiplication ou renvoie la valeur de la Constante.
     * @return le résultat de l'Addition et de la Multiplication ou renvoie la valeur de la Constante.
     */
	int eval();
	/**
	 * Prend un visiteur de type IVisitor en argument, et renvoie une valeur de type T.

	 * @param <T>, le type de retour.
	 * @param v, l'instance de visiteur.
	 * @return une valeur de type T.
	 */
	<T> T accept(IVisitor<T> v);
}
