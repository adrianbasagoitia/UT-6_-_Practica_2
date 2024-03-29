/* ******************************* Package ******************************* */
package PaqueteCalculadora;

/* ******************************* Import ******************************** */


/* ******************************* Class ********************************* */
/**
 * Clase que simula el funcionamiento de una calculadora, con las operaciones
 * basicas de suma, resta, multiplicacion y division.
 * @author Adrian
 */
public class Calculadora{
  /* ****************************** Constant ******************************* */

  /* ****************************** Attributes ***************************** */

  /* ****************************** Builder ******************************** */
  /** Constructor por defecto */
  public Calculadora(){
    // Constructor por defecto, la clase no tiene atributos.
  } // End builder

  /* ***************************** Get & Set ******************************* */

  /* ******************************* Methods ******************************* */
  /**
   * Metodo que suma dos numeros enteros.
   * @param n1 El primero de los sumandos.
   * @param n2 El segundo de los sumandos.
   * @return El resultado de la suma de los dos sumandos.
   */
  public int sumar(int n1, int n2){
    return n1+n2;
  } // End metodo sumar

  /* *********************************************************************** */
  /**
   * Metodo que resta dos numeros enteros.
   * @param n1 El primero de los operandos.
   * @param n2 El segundo de los operandos.
   * @return El resultado de la resta de los dos operandos.
   */
  public int restar(int n1, int n2){
    return n1-n2;
  } // End metodo restar

  /* *********************************************************************** */
  /**
   * Metodo que multiplica dos numeros enteros.
   * @param n1 El primero de los operandos.
   * @param n2 El segundo de los operandos.
   * @return El resultado de la multiplicacion de los dos operandos.
   */
  public int multiplicar(int n1, int n2){
    return n1*n2;
  } // End metodo multiplicacion

  /* *********************************************************************** */
  /**
   * Metodo que divide dos numeros enteros.
   * @param n1 El primero de los operandos.
   * @param n2 El segundo de los operandos.
   * @return El resultado de la division de los dos operandos. Si el segundo operando es 0,
   * el metodo devuelve 0.
   */
  public double dividir(int n1, int n2){
    if(n2 == 0)
      return 0;
    else
      return (double)n1/(double)n2;
  } // End metodo dividir
} // End class