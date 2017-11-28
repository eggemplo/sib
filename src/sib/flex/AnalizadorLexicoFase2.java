/* The following code was generated by JFlex 1.6.1 */

/* Sección de declaraciones de JFlex */
package sib.flex;

import sib.cup.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/sib/flex/AnalizadorLexicoFase2.flex</tt>
 */
public class AnalizadorLexicoFase2 implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int CADENA = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\102\1\100\1\104\1\102\1\101\22\0\1\102\1\67\1\65"+
    "\1\62\1\70\1\61\1\0\1\64\1\55\1\56\1\3\1\57\1\52"+
    "\1\60\1\51\1\1\1\76\1\74\1\72\2\73\5\76\1\0\1\53"+
    "\1\66\1\54\1\66\1\0\1\63\1\5\1\17\1\6\1\21\1\11"+
    "\1\22\1\10\1\26\1\12\1\77\1\7\1\23\1\13\1\20\1\14"+
    "\1\4\1\77\1\15\1\24\1\16\2\77\1\25\3\77\1\64\1\103"+
    "\1\64\1\0\1\71\1\0\1\35\1\44\1\37\1\50\1\42\1\32"+
    "\1\41\1\77\1\27\1\45\1\77\1\33\1\75\1\30\1\34\1\43"+
    "\1\77\1\36\1\40\1\31\1\47\3\77\1\46\1\77\1\64\1\2"+
    "\1\64\7\0\1\104\u1fa2\0\1\104\1\104\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\2\5\1\4\2\5"+
    "\1\4\3\5\13\4\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\6\1\20\1\21"+
    "\3\1\1\22\1\4\2\23\1\24\1\25\1\26\1\1"+
    "\1\27\1\0\1\4\3\5\1\30\3\4\1\31\21\4"+
    "\1\21\1\0\1\32\1\33\4\34\3\0\1\4\1\35"+
    "\1\0\1\4\1\36\4\4\1\37\17\4\2\0\1\34"+
    "\1\0\1\40\1\41\1\4\1\27\3\4\1\42\10\4"+
    "\1\43\2\4\1\44\1\4\1\45\2\4\1\46\2\4"+
    "\1\47\1\50\1\51\11\4\1\52\1\32\4\4\1\53"+
    "\5\4\1\54\16\4\1\55\1\56";

  private static int [] zzUnpackAction() {
    int [] result = new int[186];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\105\0\212\0\317\0\212\0\u0114\0\u0159\0\u019e"+
    "\0\u01e3\0\u0228\0\u026d\0\u02b2\0\u02f7\0\u033c\0\u01e3\0\u0381"+
    "\0\u03c6\0\u040b\0\u0450\0\u0495\0\u04da\0\u051f\0\u0564\0\u05a9"+
    "\0\u05ee\0\u0633\0\u01e3\0\212\0\212\0\212\0\u0678\0\212"+
    "\0\212\0\212\0\u06bd\0\212\0\212\0\u0702\0\u0678\0\u0678"+
    "\0\u0747\0\u078c\0\u07d1\0\u0816\0\212\0\u085b\0\212\0\212"+
    "\0\212\0\u08a0\0\u08e5\0\u092a\0\u096f\0\u09b4\0\u09f9\0\212"+
    "\0\u01e3\0\u0a3e\0\u0a83\0\u0ac8\0\u01e3\0\u0b0d\0\u0b52\0\u0b97"+
    "\0\u0bdc\0\u0c21\0\u0c66\0\u0cab\0\u0cf0\0\u0d35\0\u0d7a\0\u0dbf"+
    "\0\u0e04\0\u0e49\0\u0e8e\0\u0ed3\0\u0f18\0\u0f5d\0\212\0\u0fa2"+
    "\0\212\0\u0fe7\0\u102c\0\u1071\0\u10b6\0\212\0\u10fb\0\u1140"+
    "\0\u1185\0\u11ca\0\212\0\u120f\0\u1254\0\u1299\0\u12de\0\u1323"+
    "\0\u1368\0\u13ad\0\u01e3\0\u13f2\0\u1437\0\u147c\0\u14c1\0\u1506"+
    "\0\u154b\0\u1590\0\u15d5\0\u161a\0\u165f\0\u16a4\0\u16e9\0\u172e"+
    "\0\u1773\0\u17b8\0\u17fd\0\u1842\0\u1887\0\u18cc\0\u18cc\0\u1140"+
    "\0\u1911\0\212\0\u1956\0\u199b\0\u19e0\0\u01e3\0\u1a25\0\u1a6a"+
    "\0\u1aaf\0\u1af4\0\u1b39\0\u1b7e\0\u1bc3\0\u1c08\0\u1c4d\0\u1c92"+
    "\0\u1cd7\0\u1d1c\0\u1d61\0\u1da6\0\u1deb\0\u1e30\0\u01e3\0\u1e75"+
    "\0\u1eba\0\u01e3\0\u01e3\0\u01e3\0\u1eff\0\u1f44\0\u1f89\0\u1fce"+
    "\0\u2013\0\u2058\0\u209d\0\u20e2\0\u2127\0\u01e3\0\u01e3\0\u216c"+
    "\0\u21b1\0\u21f6\0\u223b\0\u01e3\0\u2280\0\u22c5\0\u230a\0\u234f"+
    "\0\u2394\0\u01e3\0\u23d9\0\u241e\0\u2463\0\u24a8\0\u24ed\0\u2532"+
    "\0\u2577\0\u25bc\0\u2601\0\u2646\0\u268b\0\u26d0\0\u2715\0\u275a"+
    "\0\u01e3\0\u01e3";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[186];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\3\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\4\11\1\15\1\11\1\7\1\16"+
    "\1\11\1\17\1\20\1\11\1\21\1\22\1\23\1\24"+
    "\1\11\1\25\1\26\1\27\1\30\1\31\2\11\1\32"+
    "\1\33\4\11\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\3\45\1\46\1\47\1\50\1\51"+
    "\1\52\3\53\1\54\1\53\1\11\1\55\1\56\1\57"+
    "\1\3\1\0\65\60\1\61\12\60\1\55\1\56\1\60"+
    "\1\62\1\60\106\0\1\63\1\0\1\64\105\0\1\11"+
    "\1\65\43\11\21\0\6\11\11\0\40\11\1\66\4\11"+
    "\11\0\1\67\1\70\6\0\6\11\11\0\40\11\1\66"+
    "\4\11\11\0\1\67\1\70\6\0\3\71\3\11\11\0"+
    "\45\11\21\0\6\11\11\0\40\11\1\66\4\11\11\0"+
    "\1\67\1\70\6\0\1\71\5\11\11\0\14\11\1\72"+
    "\2\11\1\73\20\11\1\66\4\11\11\0\1\67\1\70"+
    "\6\0\6\11\11\0\7\11\1\74\6\11\1\75\26\11"+
    "\21\0\6\11\11\0\5\11\1\76\32\11\1\66\4\11"+
    "\11\0\1\67\1\70\6\0\6\11\11\0\40\11\1\66"+
    "\4\11\11\0\1\67\1\70\6\0\1\11\1\71\4\11"+
    "\11\0\22\11\1\77\22\11\21\0\6\11\11\0\24\11"+
    "\1\100\20\11\21\0\6\11\11\0\26\11\1\101\1\11"+
    "\1\102\14\11\21\0\6\11\11\0\32\11\1\103\3\11"+
    "\1\104\6\11\21\0\6\11\11\0\27\11\1\105\2\11"+
    "\1\106\12\11\21\0\6\11\11\0\40\11\1\107\4\11"+
    "\21\0\6\11\11\0\32\11\1\110\1\111\11\11\21\0"+
    "\6\11\11\0\36\11\1\112\6\11\21\0\6\11\11\0"+
    "\27\11\1\113\15\11\21\0\6\11\11\0\25\11\1\114"+
    "\17\11\21\0\6\11\11\0\27\11\1\115\1\11\1\116"+
    "\13\11\21\0\6\11\61\0\1\117\110\0\1\120\11\0"+
    "\3\53\1\0\1\53\73\0\1\121\23\0\45\122\24\0"+
    "\1\122\1\0\1\122\51\0\1\123\4\0\1\124\10\0"+
    "\1\125\1\126\22\0\1\127\47\0\1\130\20\0\3\53"+
    "\1\0\1\53\3\0\1\131\6\0\31\11\1\132\13\11"+
    "\21\0\6\11\105\0\1\55\71\0\1\133\17\0\2\63"+
    "\1\0\75\63\2\0\3\63\3\64\1\134\101\64\4\0"+
    "\2\11\1\135\42\11\21\0\6\11\11\0\40\11\1\66"+
    "\4\11\11\0\1\67\7\0\6\11\51\0\1\67\15\0"+
    "\1\67\26\0\15\11\1\136\27\11\21\0\6\11\11\0"+
    "\20\11\1\137\24\11\21\0\6\11\11\0\1\140\44\11"+
    "\21\0\6\11\11\0\4\11\1\141\40\11\21\0\6\11"+
    "\11\0\6\11\1\142\36\11\21\0\6\11\11\0\25\11"+
    "\1\143\17\11\21\0\6\11\11\0\32\11\1\106\12\11"+
    "\21\0\6\11\11\0\25\11\1\144\17\11\21\0\6\11"+
    "\11\0\31\11\1\145\13\11\21\0\6\11\11\0\24\11"+
    "\1\146\20\11\21\0\6\11\11\0\30\11\1\147\14\11"+
    "\21\0\6\11\11\0\31\11\1\150\13\11\21\0\6\11"+
    "\11\0\41\11\1\151\3\11\21\0\6\11\11\0\32\11"+
    "\1\152\12\11\21\0\6\11\11\0\33\11\1\153\11\11"+
    "\21\0\6\11\11\0\31\11\1\154\13\11\21\0\6\11"+
    "\11\0\36\11\1\155\6\11\21\0\6\11\11\0\31\11"+
    "\1\156\1\157\3\11\1\160\6\11\21\0\6\11\11\0"+
    "\31\11\1\161\13\11\21\0\6\11\11\0\32\11\1\162"+
    "\12\11\21\0\6\11\77\0\3\163\1\0\1\163\12\0"+
    "\45\122\1\164\20\0\6\122\51\0\1\126\111\0\1\165"+
    "\115\0\1\126\102\0\1\166\11\0\3\167\1\0\1\167"+
    "\100\0\3\170\1\0\1\170\66\0\1\120\11\0\3\163"+
    "\1\0\1\163\3\0\1\131\6\0\32\11\1\171\12\11"+
    "\21\0\6\11\5\0\1\64\1\172\1\64\1\134\101\64"+
    "\4\0\3\11\1\173\41\11\21\0\6\11\11\0\6\11"+
    "\1\174\12\11\1\175\23\11\21\0\6\11\11\0\5\11"+
    "\1\176\37\11\21\0\6\11\11\0\10\11\1\177\34\11"+
    "\21\0\6\11\11\0\6\11\1\200\36\11\21\0\6\11"+
    "\11\0\17\11\1\201\25\11\21\0\6\11\11\0\36\11"+
    "\1\143\6\11\21\0\6\11\11\0\24\11\1\202\20\11"+
    "\21\0\6\11\11\0\43\11\1\203\1\11\21\0\6\11"+
    "\11\0\31\11\1\100\13\11\21\0\6\11\11\0\33\11"+
    "\1\143\11\11\21\0\6\11\11\0\36\11\1\204\6\11"+
    "\21\0\6\11\11\0\31\11\1\205\13\11\21\0\6\11"+
    "\11\0\36\11\1\206\6\11\21\0\6\11\11\0\44\11"+
    "\1\207\21\0\6\11\11\0\26\11\1\143\16\11\21\0"+
    "\6\11\11\0\33\11\1\210\11\11\21\0\6\11\11\0"+
    "\23\11\1\211\21\11\21\0\6\11\11\0\37\11\1\143"+
    "\5\11\21\0\6\11\11\0\42\11\1\212\2\11\21\0"+
    "\6\11\11\0\25\11\1\213\17\11\21\0\6\11\6\0"+
    "\1\127\70\0\3\163\1\0\1\163\12\0\45\214\24\0"+
    "\1\214\1\0\1\214\56\0\1\126\125\0\3\167\1\0"+
    "\1\167\12\0\33\11\1\215\11\11\21\0\6\11\11\0"+
    "\1\11\1\216\43\11\21\0\6\11\11\0\16\11\1\217"+
    "\26\11\21\0\6\11\11\0\22\11\1\220\22\11\21\0"+
    "\6\11\11\0\11\11\1\221\33\11\21\0\6\11\11\0"+
    "\14\11\1\222\30\11\21\0\6\11\11\0\5\11\1\223"+
    "\37\11\21\0\6\11\11\0\34\11\1\224\10\11\21\0"+
    "\6\11\11\0\25\11\1\225\17\11\21\0\6\11\11\0"+
    "\33\11\1\100\11\11\21\0\6\11\11\0\42\11\1\143"+
    "\2\11\21\0\6\11\11\0\24\11\1\226\20\11\21\0"+
    "\6\11\11\0\1\227\44\11\21\0\6\11\11\0\33\11"+
    "\1\230\11\11\21\0\6\11\11\0\24\11\1\231\20\11"+
    "\21\0\6\11\11\0\1\232\44\11\21\0\6\11\11\0"+
    "\23\11\1\233\21\11\21\0\6\11\11\0\45\214\21\0"+
    "\6\214\11\0\31\11\1\203\13\11\21\0\6\11\11\0"+
    "\4\11\1\234\40\11\21\0\6\11\11\0\6\11\1\235"+
    "\36\11\21\0\6\11\11\0\12\11\1\236\32\11\21\0"+
    "\6\11\11\0\30\11\1\237\14\11\21\0\6\11\11\0"+
    "\25\11\1\237\17\11\21\0\6\11\11\0\31\11\1\240"+
    "\13\11\21\0\6\11\11\0\31\11\1\241\13\11\21\0"+
    "\6\11\11\0\35\11\1\143\7\11\21\0\6\11\11\0"+
    "\31\11\1\242\13\11\21\0\6\11\11\0\25\11\1\243"+
    "\17\11\21\0\6\11\11\0\5\11\1\244\37\11\21\0"+
    "\6\11\11\0\17\11\1\245\25\11\21\0\6\11\11\0"+
    "\32\11\1\246\12\11\21\0\6\11\11\0\25\11\1\247"+
    "\17\11\21\0\6\11\11\0\32\11\1\250\12\11\21\0"+
    "\6\11\11\0\43\11\1\251\1\11\21\0\6\11\11\0"+
    "\5\11\1\252\37\11\21\0\6\11\11\0\25\11\1\253"+
    "\17\11\21\0\6\11\11\0\23\11\1\254\4\11\1\237"+
    "\14\11\21\0\6\11\11\0\25\11\1\255\17\11\21\0"+
    "\6\11\11\0\32\11\1\144\12\11\21\0\6\11\11\0"+
    "\23\11\1\256\21\11\21\0\6\11\11\0\34\11\1\257"+
    "\10\11\21\0\6\11\11\0\23\11\1\260\21\11\21\0"+
    "\6\11\11\0\25\11\1\261\17\11\21\0\6\11\11\0"+
    "\34\11\1\262\10\11\21\0\6\11\11\0\25\11\1\263"+
    "\17\11\21\0\6\11\11\0\43\11\1\264\1\11\21\0"+
    "\6\11\11\0\23\11\1\265\21\11\21\0\6\11\11\0"+
    "\43\11\1\266\1\11\21\0\6\11\11\0\32\11\1\267"+
    "\12\11\21\0\6\11\11\0\45\11\21\0\3\11\1\225"+
    "\2\11\11\0\32\11\1\270\12\11\21\0\6\11\11\0"+
    "\36\11\1\271\6\11\21\0\6\11\11\0\36\11\1\272"+
    "\6\11\21\0\6\11\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10143];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\1\11\26\1\3\11\1\1\3\11"+
    "\1\1\2\11\7\1\1\11\1\1\3\11\2\1\1\0"+
    "\3\1\1\11\26\1\1\11\1\0\1\11\4\1\1\11"+
    "\3\0\1\1\1\11\1\0\26\1\2\0\1\1\1\0"+
    "\3\1\1\11\100\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[186];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
 
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



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexicoFase2(java.io.Reader in) {
   	/* Código que se ejecutará en el constructor de la clase */
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 226) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
     
 /* Código a ejecutar al finalizar el análisis, en este caso cambiaremos el valor de una variable bandera */
 this._existenTokens = false;
 
  yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token next_token() throws java.io.IOException, Exception {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
              {
                return new Token( sym.EOF, yycolumn, yyline+1, -1, yytext(), "FIN" );
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { //throw new Exception();
            }
          case 47: break;
          case 2: 
            { Token t = new Token( sym.DIV, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
            }
          case 48: break;
          case 3: 
            { Token t = new Token( sym.MULT, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
            }
          case 49: break;
          case 4: 
            { Token t = new Token( sym.IDENTIFICADOR, yycolumn, yyline+1, 0, yytext(), Token.STR_IDENT );
		this._existenTokens = true;
		return t;
            }
          case 50: break;
          case 5: 
            { Token t = new Token( sym.STEP, yycolumn, yyline+1, 0, yytext(), Token.STEP );
		this._existenTokens = true;
		return t;
            }
          case 51: break;
          case 6: 
            { //Token t = new Token( 0, yycolumn, yyline+1, 0, yytext(), "SIMBOLO");
		this._existenTokens = true;
		//return t;
            }
          case 52: break;
          case 7: 
            { //Token t = new Token( sym.PUNTO, yycolumn, yyline+1, -1, yytext(), Token.CARACTER );
		this._existenTokens = true;
		//return t;
            }
          case 53: break;
          case 8: 
            { Token t = new Token( sym.COMA, yycolumn, yyline+1, -1, yytext(), Token.CARACTER );
		this._existenTokens = true;
		return t;
            }
          case 54: break;
          case 9: 
            { Token t = new Token( sym.PUNTO_Y_COMA, yycolumn, yyline+1, -1, yytext(), Token.CARACTER );
		this._existenTokens = true;
		return t;
            }
          case 55: break;
          case 10: 
            { Token t = new Token( sym.IGUAL_SIMPLE, yycolumn, yyline+1, -1, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
            }
          case 56: break;
          case 11: 
            { Token t = new Token( sym.LPAREN, yycolumn, yyline+1, -1, yytext(), Token.CARACTER );
		this._existenTokens = true;
		return t;
            }
          case 57: break;
          case 12: 
            { Token t = new Token( sym.RPAREN, yycolumn, yyline+1, -1, yytext(), Token.CARACTER );
		this._existenTokens = true;
		return t;
            }
          case 58: break;
          case 13: 
            { Token t = new Token( sym.MAS, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
            }
          case 59: break;
          case 14: 
            { Token t = new Token( sym.MENOS, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
            }
          case 60: break;
          case 15: 
            { Token t = new Token( sym.MOD, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
            }
          case 61: break;
          case 16: 
            { string.setLength(0);
			yybegin( CADENA );
            }
          case 62: break;
          case 17: 
            { Token t = new Token( sym.COMPARADOR, yycolumn, yyline+1, -1, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
            }
          case 63: break;
          case 18: 
            { Token t = new Token( sym.NUMERO_ENTERO, yycolumn, yyline+1, 0, yytext(), Token.TIPO );
		this._existenTokens = true;
		return t;
            }
          case 64: break;
          case 19: 
            { // Quizás este token no proceda y simplemente haya que limpiar los saltos
	//Token t = new Token( 0, yycolumn, yyline+1, 0, "Enter", "NUEVA_LINEA");
	//this._existenTokens = true;
	//return t;
            }
          case 65: break;
          case 20: 
            { // Ignorar cuando se ingrese un espacio
	//Token t = new Token( 0, yycolumn, yyline+1, 0, "Espacio", "ESPACIO");
	//this._existenTokens = true;
	//return t;
            }
          case 66: break;
          case 21: 
            { string.append( yytext() );
            }
          case 67: break;
          case 22: 
            { Token t = new Token( sym.CADENA, yycolumn, yyline+1, -1, string.toString(), Token.STRING );
				this._existenTokens = true;
				yybegin( YYINITIAL );
				return t;
            }
          case 68: break;
          case 23: 
            { /* ignore */
            }
          case 69: break;
          case 24: 
            { Token t = new Token( sym.CLEF_VALUE, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
            }
          case 70: break;
          case 25: 
            { Token t = new Token( sym.IF, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		return t;
            }
          case 71: break;
          case 26: 
            { Token t = new Token( sym.ACCENT_VALUE, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
            }
          case 72: break;
          case 27: 
            { Token t = new Token( sym.VARIABLE, yycolumn, yyline+1, 0, yytext(), Token.VARIABLE );
		this._existenTokens = true;
		return t;
            }
          case 73: break;
          case 28: 
            { Token t = new Token( sym.OPERADOR_NOTA, yycolumn, yyline+1, 0, yytext(), Token.OPERADOR_NOTA);
		this._existenTokens = true;
		return t;
            }
          case 74: break;
          case 29: 
            { string.append( "\"" );
            }
          case 75: break;
          case 30: 
            { Token t = new Token( sym.END, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		return t;
            }
          case 76: break;
          case 31: 
            { Token t = new Token( sym.TIPO, yycolumn, yyline+1, 0, yytext(), Token.TIPO);
		this._existenTokens = true;
		return t;
            }
          case 77: break;
          case 32: 
            { Token t = new Token( sym.NUMERO_INT_FRAC, yycolumn, yyline+1, 0, yytext(), Token.TIPO );
		this._existenTokens = true;
		return t;
            }
          case 78: break;
          case 33: 
            { Token t = new Token( sym.NUMERO_REAL, yycolumn, yyline+1, 0, yytext(), Token.TIPO );
		this._existenTokens = true;
		return t;
            }
          case 79: break;
          case 34: 
            { Token t = new Token( sym.ELSE, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		return t;
            }
          case 80: break;
          case 35: 
            { //Token t = new Token( sym.READ, yycolumn, yyline+1, 0, yytext(), Token.FUNCTION );
		this._existenTokens = true;
		//return t;
            }
          case 81: break;
          case 36: 
            { //Token t = new Token( sym.PLAY, yycolumn, yyline+1, 0, yytext(), Token.FUNCTION );
		this._existenTokens = true;
		//return t;
            }
          case 82: break;
          case 37: 
            { //Token t = new Token( sym.PROPIEDAD, yycolumn, yyline+1, 0, yytext(), Token.VARIABLE );
		this._existenTokens = true;
		//return t;
            }
          case 83: break;
          case 38: 
            { Token t = new Token( sym.ENDIF, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		return t;
            }
          case 84: break;
          case 39: 
            { Token t = new Token( sym.BEGIN, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		return t;
            }
          case 85: break;
          case 40: 
            { Token t = new Token( sym.WHILE, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		return t;
            }
          case 86: break;
          case 41: 
            { Token t = new Token( sym.TRANS, yycolumn, yyline+1, 0, yytext(), Token.SIMBOLO );
		this._existenTokens = true;
		return t;
            }
          case 87: break;
          case 42: 
            { //Token t = new Token( sym.IMPORT, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		//return t;
            }
          case 88: break;
          case 43: 
            { //Token t = new Token( sym.PACKAGE, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		//return t;
            }
          case 89: break;
          case 44: 
            { Token t = new Token( sym.ENDWHILE, yycolumn, yyline+1, -1, yytext(), Token.PALABRA_RESERVADA );
		this._existenTokens = true;
		return t;
            }
          case 90: break;
          case 45: 
            { //Token t = new Token( sym.READPARTITURE, yycolumn, yyline+1, 0, yytext(), Token.FUNCTION );
		this._existenTokens = true;
		//return t;
            }
          case 91: break;
          case 46: 
            { //Token t = new Token( sym.PLAYPARTITURE, yycolumn, yyline+1, 0, yytext(), Token.FUNCTION );
		this._existenTokens = true;
		//return t;
            }
          case 92: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
