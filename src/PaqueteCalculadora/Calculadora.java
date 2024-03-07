/* ******************************* Package ******************************* */
package PaqueteCalculadora;

/* ******************************* Import ******************************** */


/* ******************************* Class ********************************* */
public class Calculadora{
  /* ****************************** Constant ******************************* */

  /* ****************************** Attributes ***************************** */

  /* ****************************** Builder ******************************** */
  public Calculadora(){

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
    return n1+n2;
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
  } // End metodo restar

  /* *********************************************************************** */
  public double dividir(int n1, int n2){
    if(n2 == 0)
      return 0;
    else
      return n1*n2;
  } // End metodo restar
} // End class