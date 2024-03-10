package PaqueteCalculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
  /* Local variables */
  private final Calculadora c = new Calculadora();
  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  /**
   * Metodo parametrizado para comprobar el correcto funcionamiento del metodo
   * sumar de la clase Calculadora
   * @param n1 Primero de los sumandos.
   * @param n2 Segundo de los sumandos.
   * @param res Resultado esperado de la operacion.
   */
  @ParameterizedTest(name = "El resultado de la suma de {0} y {1} es {2}")
  @CsvSource({"0,1,1", "100,-500, -400","485, 15, 500"})
  public void sumarTest(int n1, int n2, int res){
    assertEquals(res, c.sumar(n1,n2));
  } // End sumarTest

  /**
   * Metodo parametrizado para comprobar el correcto funcionamiento del metodo
   * restar de la clase Calculadora
   * @param n1 Primero de los operandos.
   * @param n2 Segundo de los operandos.
   * @param res Resultado esperado de la operacion.
   */
  @ParameterizedTest(name = "El resultado de la resta de {0} y {1} es {2}")
  @CsvSource({"0,1,-1", "100,-500, 600","485, 15, 470"})
  public void restarTest(int n1, int n2, int res){
    assertEquals(res, c.restar(n1,n2));
  } // End sumarTest

  /**
   * Metodo parametrizado para comprobar el correcto funcionamiento del metodo
   * multiplicar de la clase Calculadora
   * @param n1 Primero de los operandos.
   * @param n2 Segundo de los operandos.
   * @param res Resultado esperado de la operacion.
   */
  @ParameterizedTest(name = "El resultado de la multiplicacion de {0} y {1} es {2}")
  @CsvSource({"0,1,0", "100,-500, -50000","485, 15, 7275"})
  public void multiplicarTest(int n1, int n2, int res){
    assertEquals(res, c.multiplicar(n1,n2));
  } // End sumarTest

  /**
   * Metodo parametrizado para comprobar el correcto funcionamiento del metodo
   * dividir de la clase Calculadora
   * @param n1 Primero de los operandos.
   * @param n2 Segundo de los operandos.
   * @param res Resultado esperado de la operacion.
   */
  @ParameterizedTest(name = "El resultado de la division de {0} y {1} es {2}")
  @CsvSource({"0,1,0", "100,-500, -0.2","485, 15, 32.33", "2,0,0"})
  public void dividirTest(int n1, int n2, double res){
    assertEquals(res, c.dividir(n1,n2), 0.1);
  } // End sumarTest

} // End Class Calculadora Test