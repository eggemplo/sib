/**
 * Proyecto Sib - SI BEMOL, LENGUAJE DE PROGRAMACION MUSICAL
 * 
 * @author Antonio Blanco Oliva
 * @class NoteType
 * @version 1.0
 * 
 */

package sib.models.datatype;

import sib.models.nonterminal.TipoNumero;
import sib.models.nonterminal.ValorAsignacion;
import sib.models.nonterminal.Variable;


public class NoteType extends DataType {

	public static final String ACCIDENTAL_NONE = "";
	public static final String ACCIDENTAL_NATURAL = "natural";
	public static final String ACCIDENTAL_FLAT = "flat";
	public static final String ACCIDENTAL_DOUBLE_FLAT = "flat-flat";
	public static final String ACCIDENTAL_SHARP = "sharp";
	public static final String ACCIDENTAL_DOUBLE_SHARP = "double-sharp";

	public StepType value;
	public TipoNumero duration;
	public int octave;
	public int dots;
	public String articulation;
	public String accidental;
	public int alter;

	public NoteType() {
		value = new StepType( "C" );
		duration = new TipoNumero( "1/4", TipoNumero.TYPE_NFRAC );
		octave = 4;
		dots = 0;
		articulation = "";
		accidental = NoteType.ACCIDENTAL_NONE;
		alter = 0;
	}

	@Override
	public String getType() {
		return DataType.TYPE_NOTE;
	}

	@Override
	public ValorAsignacion getValue() {
		return this;
	}

	public String getStringValue() {
		return value.getStringValue();
	}

	@Override
	public ValorAsignacion evalua() {
		return this;
	}

	@Override
	public void trans( Float ntones ) {

		// Octavas
		octave = octave + numOctaves( ntones );

		// Semitonos?
		int semitones = semitonesExtra( ntones );
		if ( semitones > 0 ) {
			applySharp( semitones );
		}
		if ( semitones < 0 ) {
			applyFlat( Math.abs( semitones ) );
		}

		// Actualizamos step
		this.value.trans( ntones );

	}

	private int numOctaves(Float ntones) {
		int octaves = 0;
		boolean negative = false;
		if ( ntones < 0 ) {
			negative = true;
		}
		float tonos = Math.abs( ntones );
		int current = this.value.stepValues.indexOf( this.value.value );
		// caso especial si inicialmente current = 0
		if ( negative && ( current == 0 ) ) {
			octaves--;
		}
		while ( tonos > 0 ) {
			if ( negative ) {
				int temp =( current - 1 ) % 7;
				if ( temp < 0 ) {
					temp = temp + 7;
				}
				tonos = ( tonos - this.value.tonesValues[temp] );
			} else {
				tonos = ( tonos - this.value.tonesValues[current] );
			}
			if ( tonos >= 0 ) {  // por si hay exceso
				if ( negative ) {
					current = ( current - 1 ) % 7;
					if ( current < 0 ) {
						current = current + 7;
					}
				} else {
					current = ( current + 1 ) % 7;
				}
				if ( current == 0 ) {
					if ( negative ) {
						octaves--;
					} else {
						octaves++;
					}
				}
			}
		}
		return octaves;
	}

	private int semitonesExtra(Float ntones) {
		int semi = 0;
		boolean negative = false;
		if ( ntones < 0 ) {
			negative = true;
		}
		float tonos = Math.abs( ntones );
		int current = this.value.stepValues.indexOf( this.value.value );
		while ( tonos > 0 ) {
			if ( negative ) {
				int temp =( current - 1 ) % 7;
				if ( temp < 0 ) {
					temp = temp + 7;
				}
				tonos = ( tonos - this.value.tonesValues[temp] );
			} else {
				tonos = ( tonos - this.value.tonesValues[current] );
			}

			if ( tonos >= 0 ) {  // por si hay exceso
				if ( negative ) {
					current = ( current - 1 ) % 7;
					if ( current < 0 ) {
						current = current + 7;
					}
				} else {
					current = ( current + 1 ) % 7;
				}
			}
		}
		if ( tonos < 0 ) {
			if ( negative ) {
				semi--;
			} else {
				semi++;
			}
		}
		return semi;
	}

	@Override
	public ValorAsignacion clone() {
		NoteType n = new NoteType();
		n.value = (StepType)value.clone();
		n.articulation = articulation;
		n.dots = dots;
		n.duration = duration.clone();
		n.octave = octave;
		n.accidental = accidental;
		return n;
	}

	@Override
	public boolean igualQue(ValorAsignacion oper2) {
		ValorAsignacion op2 = oper2;
		if ( op2.getClass() == Variable.class ) {
			op2 = oper2.getValue();
		}
		float hashop1 = octave + value.toInt() + accidental.hashCode() + duration.toFloat() + dots + articulation.hashCode();
		float hashop2 = ((NoteType)op2).octave + ((NoteType)op2).value.toInt() + ((NoteType)op2).accidental.hashCode() + ((NoteType)op2).duration.toFloat() + ((NoteType)op2).dots + ((NoteType)op2).articulation.hashCode();
		return ( hashop1 == hashop2 );
	}

	@Override
	public boolean distintoQue(ValorAsignacion op2) {
		return !igualQue( op2 );
	}

	@Override
	public boolean menorQue(ValorAsignacion oper2) {
		ValorAsignacion op2 = oper2;
		if ( op2.getClass() == Variable.class ) {
			op2 = oper2.getValue();
		}
		float hashop1 = octave + value.toInt() + accidental.hashCode() + duration.toFloat() + dots + articulation.hashCode();
		float hashop2 = ((NoteType)op2).octave + ((NoteType)op2).value.toInt() + ((NoteType)op2).accidental.hashCode() + ((NoteType)op2).duration.toFloat() + ((NoteType)op2).dots + ((NoteType)op2).articulation.hashCode();
		return ( hashop1 < hashop2 );
	}

	@Override
	public boolean menorIgualQue(ValorAsignacion op2) {
		return menorQue( op2 ) || igualQue( op2 );
	}

	@Override
	public boolean mayorQue(ValorAsignacion op2) {
		return !menorQue( op2 ) && !igualQue( op2 );
	}

	@Override
	public boolean mayorIgualQue(ValorAsignacion op2) {
		return !menorQue( op2 );
	}

	/**
	 * Aplica un operador nota.
	 *
	 * @param op String
	 */
	public void applyOperator(String op) {
		switch ( op ) {
			case "_.":
				dots ++;
				break;
			case "_..":
				dots = dots + 2;
				break;
			case "_...":
				dots = dots + 3;
				break;
			case "_#":
				applySharp( 1 );
				break;
			case "_##":
				applySharp( 2 );
				break;
			case "_b":
				applyFlat( 1 );
				break;
			case "_bb":
				applyFlat( 2 );
				break;
			case "_@":
				accidental = NoteType.ACCIDENTAL_NATURAL;
				break;
			case "__":
				accidental = NoteType.ACCIDENTAL_NONE;
				break;
		}
	}

	private void applyFlat(int i) {
		if ( i == 1 ) {
			switch ( accidental ) {
				case NoteType.ACCIDENTAL_NONE:
				case NoteType.ACCIDENTAL_NATURAL:
					accidental = NoteType.ACCIDENTAL_FLAT;
					break;
				case NoteType.ACCIDENTAL_FLAT:
					accidental = NoteType.ACCIDENTAL_DOUBLE_FLAT;
					break;
				case NoteType.ACCIDENTAL_DOUBLE_FLAT:
					accidental = NoteType.ACCIDENTAL_DOUBLE_FLAT;
					break;
				case NoteType.ACCIDENTAL_SHARP:
					accidental = NoteType.ACCIDENTAL_NATURAL;
					break;
				case NoteType.ACCIDENTAL_DOUBLE_SHARP:
					accidental = NoteType.ACCIDENTAL_SHARP;
					break;
			}
			alter = Math.max( alter - 1, -2 );
		} else if ( i == 2 ) {
			switch ( accidental ) {
				case NoteType.ACCIDENTAL_NONE:
				case NoteType.ACCIDENTAL_NATURAL:
					accidental = NoteType.ACCIDENTAL_DOUBLE_FLAT;
					break;
				case NoteType.ACCIDENTAL_FLAT:
					accidental = NoteType.ACCIDENTAL_DOUBLE_FLAT;
					break;
				case NoteType.ACCIDENTAL_DOUBLE_FLAT:
					accidental = NoteType.ACCIDENTAL_DOUBLE_FLAT;
					break;
				case NoteType.ACCIDENTAL_SHARP:
					accidental = NoteType.ACCIDENTAL_FLAT;
					break;
				case NoteType.ACCIDENTAL_DOUBLE_SHARP:
					accidental = NoteType.ACCIDENTAL_NATURAL;
					break;
			}
			alter = Math.max( alter - 2, -2 );
		}
	}

	private void applySharp(int i) {
		if ( i == 1 ) {
			switch ( accidental ) {
				case NoteType.ACCIDENTAL_NONE:
				case NoteType.ACCIDENTAL_NATURAL:
						accidental = NoteType.ACCIDENTAL_SHARP;
					break;
				case NoteType.ACCIDENTAL_FLAT:
					accidental = NoteType.ACCIDENTAL_NATURAL;
					break;
				case NoteType.ACCIDENTAL_DOUBLE_FLAT:
					accidental = NoteType.ACCIDENTAL_FLAT;
					break;
				case NoteType.ACCIDENTAL_SHARP:
					accidental = NoteType.ACCIDENTAL_DOUBLE_SHARP;
					break;
				case NoteType.ACCIDENTAL_DOUBLE_SHARP:
					accidental = NoteType.ACCIDENTAL_DOUBLE_SHARP;
					break;
			}
			alter = Math.min( alter + 1, 2 );
		} else if ( i == 2 ) {
			switch ( accidental ) {
				case NoteType.ACCIDENTAL_NONE:
				case NoteType.ACCIDENTAL_NATURAL:
					accidental = NoteType.ACCIDENTAL_DOUBLE_SHARP;
					break;
				case NoteType.ACCIDENTAL_FLAT:
					accidental = NoteType.ACCIDENTAL_SHARP;
					break;
				case NoteType.ACCIDENTAL_DOUBLE_FLAT:
					accidental = NoteType.ACCIDENTAL_NATURAL;
					break;
				case NoteType.ACCIDENTAL_SHARP:
					accidental = NoteType.ACCIDENTAL_DOUBLE_SHARP;
					break;
				case NoteType.ACCIDENTAL_DOUBLE_SHARP:
					accidental = NoteType.ACCIDENTAL_DOUBLE_SHARP;
					break;
			}
			alter = Math.min( alter + 2, 2 );
		}
	}

	public void setPropertyValue( String prop, ValorAsignacion v ) {
		try {
			switch ( prop ) {
				case "step":
					value = new StepType( v.getStringValue() );
					break;
				case "duration":
					if ( duration != null ) {
						duration.setValue( v.getStringValue() );
					} else {
						duration = new TipoNumero( v.getStringValue(), TipoNumero.TYPE_NFRAC );
					}
					break;
				case "octave":
					octave = new Float( v.getStringValue() ).intValue();
					break;
				case "dots":
					dots = new Float( v.getStringValue() ).intValue();
					break;
				case "articulation":
					articulation = v.getStringValue();
					break;
				case "accidental":
					accidental = v.getStringValue();
					break;
				default:
					throw new Exception( "Nombre de propiedad no existe: " + prop );
			}
		} catch ( Exception e ) {
			System.err.println( "ERROR en NoteType->setPropertyValue():" + v.getStringValue() );
			e.printStackTrace();
		}
	}

	public ValorAsignacion getProperty (String prop) {
		ValorAsignacion result = null;
		try {
			switch ( prop ) {
				case "step":
					result = value;
					break;
				case "duration":
					result = duration;
					break;
				case "octave":
					result = new TipoNumero( String.valueOf( octave ), TipoNumero.TYPE_INT );
					break;
				case "dots":
					result = new TipoNumero( String.valueOf( dots ), TipoNumero.TYPE_INT );
					break;
				case "articulation":
					result = new StringType( articulation );
					break;
				case "accidental":
					result = new StringType( articulation );
					break;
				default:
					throw new Exception( "Nombre de propiedad no existe: " + prop );
			}
		} catch ( Exception e ) {
			System.err.println( "ERROR en NoteType->getProperty():" + prop + " no existe como propiedad." );
		}
		return result;
	}

}
