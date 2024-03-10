package PaqueteCalculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
  Calculadora c = new Calculadora();
  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

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
} // End Class Calculadora Test
