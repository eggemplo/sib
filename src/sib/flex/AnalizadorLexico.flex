/**
 * Proyecto Sib - SI BEMOL, LENGUAJE DE PROGRAMACION MUSICAL
 * 
 * @author Antonio Blanco Oliva
 * @class Fichero flex generador del analizador lexico.
 * @version 1.0
 * 
 */
package sib.flex;

import sib.cup.*;

%%
// Clase pública
%public

%class AnalizadorLexico
%unicode
%column
%line
%cup

%{
 
 /* Código personalizado */

	// Se agregó una propiedad para verificar si existen tokens pendientes
	private boolean _existenTokens = false;

	// Contiene las cadenas entre comillas
	StringBuilder string = new StringBuilder();

	public boolean existenTokens(){
		return this._existenTokens;
	}

	public int getLine() {
		return yyline;
	}

	public int getColumn() {
		return yycolumn;
	}

%}

/* Devolvemos objetos del tipo Token */
%type Token

%init{
 	/* Código que se ejecutará en el constructor de la clase */
%init}
 
%eof{
 
 /* Código a ejecutar al finalizar el análisis, en este caso cambiaremos el valor de una variable bandera */
 this._existenTokens = false;
 
%eof}

%yylexthrow Exception

/* Inicio de Expresiones regulares */
ComentarioSimple = "//"[^\n|\r|\r\n]*
ComentarioCompuesto = "/*" ~"*/"
Comentarios = {ComentarioSimple} | {ComentarioCompuesto}

Package = PACKAGE
Import = IMPORT
Begin = BEGIN
End = END
If = IF
Endif = ENDIF
Else = ELSE
While = WHILE
Endwhile = ENDWHILE

Tipo = "int" | "float" | frac | nfrac | string | step | clef | object | array | note | partiture

Trans = "trans"

/* Funciones */
Play = "play"
PlayPartiture = "playPartiture"
Read = "read"
ReadPartiture = "readPartiture"

Punto = "."
Coma = ","
Punto_y_coma = ";"
Igual_simple = "="
Abre_parentesis = "("
Cierra_parentesis = ")"
Mas = "+"
Menos = "-"
Div = "/"
Mult = "*"
Mod = "%"

Simbolo = "#"|"@"|"b"|";"|"."|","|"{"|"}"|"["|"]"|"\""|"'"

Comparador = "<"|">"|"=="|"!="|">="|"<="

Variable = "$"{Str_ident}
Propiedad = {Variable}"."{Str_ident}

Operador_nota = "_#"|"_##"|"_b"|"_bb"|"_@"|"_."|"_.."|"_..."|"__"

Step = A | B | C | D | E | F | G | S

Clef_value = G[2]? | F[3-4] | C[1-4]

Articulation_value = "staccato" | "tenuto" | "accent" | \"\"

Digito = [0-9]
Numeros = {Digito}{Digito}*
Letra = [A-Za-z]
LetraNumero = [A-Za-z0-9]
Str_ident = {Letra}{LetraNumero}*

SaltoDeLinea = \n|\r|\r\n
Espacio = [ \t\f]

// Tipo numeros
Numero_entero = [-]?{Numeros}
Numero_real = {Numero_entero}"."{Numeros}
Numero_nfrac = {Fraccion}
Numero_frac = [-]?{Fraccion}
				| [-]?{Numero_entero}{Espacio}+{Fraccion}
Fraccion = {Numero_entero}"/"{Numero_entero}

/* Finaliza expresiones regulares */

/* Estados */
%state CADENA

%%
/* Finaliza la sección de declaraciones de JFlex */
 
/* Inicia sección de reglas */
<CADENA>	{
	// @todo falta mejorar el String, en el fichero java.flex hay un ejemplo completo
	\"	{ 	Token t = new Token( sym.CADENA, yycolumn, yyline+1, -1, string.toString(), Token.STRING );
				this._existenTokens = true;
				yybegin( YYINITIAL );
				return t;
			}
	(\\\")	{
				string.append( "\"" );
			}
	[^\r\n\"\\] {
	 			string.append( yytext() );
	 			}
	
 }

<YYINITIAL> {
	[\"]	{
	 		string.setLength(0);
			yybegin( CADENA );
	}

	{Comentarios}	{ /* ignore */ }

	{Package}	{
		//Token t = new Token( sym.PACKAGE, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		//return t;
	}
	{Import}	{
		//Token t = new Token( sym.IMPORT, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		//return t;
	}
	{Begin}	{
		Token t = new Token( sym.BEGIN, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		return t;
	}
	{End}	{
		Token t = new Token( sym.END, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		return t;
	}
	{If}	{
		Token t = new Token( sym.IF, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		return t;
	}
	{Else}	{
		Token t = new Token( sym.ELSE, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		return t;
	}
	{Endif}	{
		Token t = new Token( sym.ENDIF, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		return t;
	}
	{While}	{
		Token t = new Token( sym.WHILE, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		return t;
	}
	{Endwhile}	{
		Token t = new Token( sym.ENDWHILE, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		return t;
	}

	{Comparador} {
		Token t = new Token( sym.COMPARADOR, yycolumn, yyline+1, -1, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
	}

	{Punto}	{
		//Token t = new Token( sym.PUNTO, yycolumn, yyline+1, -1, yytext(), Token.CARACTER );
		this._existenTokens = true;
		//return t;
	}
	{Coma}	{
		Token t = new Token( sym.COMA, yycolumn, yyline+1, -1, yytext(), Token.CARACTER );
		this._existenTokens = true;
		return t;
	}
	{Punto_y_coma}	{
		Token t = new Token( sym.PUNTO_Y_COMA, yycolumn, yyline+1, -1, yytext(), Token.CARACTER );
		this._existenTokens = true;
		return t;
	}
	{Igual_simple}	{
		Token t = new Token( sym.IGUAL_SIMPLE, yycolumn, yyline+1, -1, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
	}
	
	{Abre_parentesis}	{
		Token t = new Token( sym.LPAREN, yycolumn, yyline+1, -1, yytext(), Token.CARACTER );
		this._existenTokens = true;
		return t;
	}
	
	{Cierra_parentesis}	{
		Token t = new Token( sym.RPAREN, yycolumn, yyline+1, -1, yytext(), Token.CARACTER );
		this._existenTokens = true;
		return t;
	}
	
	{Tipo}	{
		Token t = new Token( sym.TIPO, yycolumn, yyline+1, 0, yytext(), Token.TIPO);
		this._existenTokens = true;
		return t;
	}
	
	{Step}	{
		Token t = new Token( sym.STEP, yycolumn, yyline+1, 0, yytext(), Token.STEP );
		this._existenTokens = true;
		return t;
	}
	
	{Clef_value} {
		Token t = new Token( sym.CLEF_VALUE, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
	}
	
	{Articulation_value}	{
		Token t = new Token( sym.ARTICULATION_VALUE, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
	}

	{Mas}	{
		Token t = new Token( sym.MAS, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
	}
	{Menos}	{
		Token t = new Token( sym.MENOS, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
	}
	{Div}	{
		Token t = new Token( sym.DIV, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
	}
	{Mult}	{
		Token t = new Token( sym.MULT, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
	}
	{Mod}	{
		Token t = new Token( sym.MOD, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
	}

	{Trans} {
		Token t = new Token( sym.TRANS, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
	}

	{Play} {
		Token t = new Token( sym.PLAY, yycolumn, yyline+1, 0, yytext(), Token.FUNCTION );
		this._existenTokens = true;
		return t;
	}

	{PlayPartiture} {
		Token t = new Token( sym.PLAYPARTITURE, yycolumn, yyline+1, 0, yytext(), Token.FUNCTION );
		this._existenTokens = true;
		return t;
	}

	{Read} {
		Token t = new Token( sym.READ, yycolumn, yyline+1, 0, yytext(), Token.FUNCTION );
		this._existenTokens = true;
		return t;
	}

	{ReadPartiture} {
		Token t = new Token( sym.READPARTITURE, yycolumn, yyline+1, 0, yytext(), Token.FUNCTION );
		this._existenTokens = true;
		return t;
	}

	{Simbolo}	{
		//Token t = new Token( 0, yycolumn, yyline+1, 0, yytext(), "SIMBOLO");
		this._existenTokens = true;
		//return t;
	}
	
	{Variable}	{
		Token t = new Token( sym.VARIABLE, yycolumn, yyline+1, 0, yytext(), Token.VARIABLE );
		this._existenTokens = true;
		return t;
	}
	
	{Propiedad}	{
		Token t = new Token( sym.PROPIEDAD, yycolumn, yyline+1, 0, yytext(), Token.VARIABLE );
		this._existenTokens = true;
		return t;
	}
	
	{Operador_nota}	{
		Token t = new Token( sym.OPERADOR_NOTA, yycolumn, yyline+1, 0, yytext(), Token.OPERADOR_NOTA);
		this._existenTokens = true;
		return t;
	}
	
	{Numero_entero} {
		Token t = new Token( sym.NUMERO_ENTERO, yycolumn, yyline+1, 0, yytext(), Token.TIPO );
		this._existenTokens = true;
		return t;
	}
	{Numero_real} {
		Token t = new Token( sym.NUMERO_REAL, yycolumn, yyline+1, 0, yytext(), Token.TIPO );
		this._existenTokens = true;
		return t;
	}
	{Numero_nfrac} {
		Token t = new Token( sym.NUMERO_NFRAC, yycolumn, yyline+1, 0, yytext(), Token.TIPO );
		this._existenTokens = true;
		return t;
	}
	{Numero_frac} {
		Token t = new Token( sym.NUMERO_FRAC, yycolumn, yyline+1, 0, yytext(), Token.TIPO );
		this._existenTokens = true;
		return t;
	}

	{Str_ident} {
		Token t = new Token( sym.IDENTIFICADOR, yycolumn, yyline+1, 0, yytext(), Token.STR_IDENT );
		this._existenTokens = true;
		return t;
	}
}

{Espacio} {
	// Ignorar cuando se ingrese un espacio
	//Token t = new Token( 0, yycolumn, yyline+1, 0, "Espacio", "ESPACIO");
	//this._existenTokens = true;
	//return t;
}

{SaltoDeLinea} {
	// Quizás este token no proceda y simplemente haya que limpiar los saltos
	//Token t = new Token( 0, yycolumn, yyline+1, 0, "Enter", "NUEVA_LINEA");
	//this._existenTokens = true;
	//return t;
}
// Todo lo demás ...
.	{ 
	//throw new Exception();
}
<<EOF>> { return new Token( sym.EOF, yycolumn, yyline+1, -1, yytext(), "FIN" ); }
