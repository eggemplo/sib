/**
 * Proyecto Sib - SI BEMOL, LENGUAJE DE PROGRAMACION MUSICAL
 * 
 * @author Antonio Blanco Oliva
 * @class TablaSimbolos
 * @version 1.0
 * 
 */

package sib.models.nonterminal;

import java.util.HashMap;
import java.util.Map.Entry;

import sib.controllers.ViewsController;

public class TablaSimbolos {

	HashMap<String,Variable> vars;

	public TablaSimbolos() {
		vars = new HashMap<String,Variable>();
	}

	public void addVariable( Variable v ) {
		vars.put( v.name, v );
	}

	public void updateVariable(Variable v ) {
		vars.put( v.name, v );
	}

	public Variable getVariable( String nombre ) {
		return vars.get( nombre );
	}

	public void print( ViewsController vc ) {
		for ( Entry<String, Variable> v : vars.entrySet()) {
			String key = v.getKey();
			Variable value = v.getValue();
			vc.printLog( "\n TablaSimbolos(Variables)-->:" + key + ":" + value );
		}
	}

}
