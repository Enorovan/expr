package pobj.expr;

import java.util.HashMap;
import java.util.Map;
/**
 * Classe définissant les environnements pour la question 8.
 * @author Enorovan + [REDACTED]
 */
public class Question8 {
	/**
	 * Renvoie l'environnement correspondant à env1, l'environnement vide.
	 * @return l'environnement correspondant à env1, l'environnement vide.
	 */
	public static Map<String,Integer> env1() {
		return new HashMap<String,Integer>();
	}
	/**
	 * Renvoie l'environnement correspondant à env2, qui associe 10 à la variable "x" et 20 à "y".
	 * @return l'environnement correspondant à env2, qui associe 10 à la variable "x" et 20 à "y".
	 */
	public static Map<String, Integer> env2() {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("x", 10);
		map.put("y", 20);
		return map;
	}
	/**
	 * Renvoie l'environnement correspondant à env2, qui associe 9 à la variable "z".
	 * @return l'environnement correspondant à env2, qui associe 9 à la variable "z".
	 */
	public static Map<String, Integer> env3() {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("z", 9);
		return map;
	}
}
