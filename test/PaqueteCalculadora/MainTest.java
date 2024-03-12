/* ******************************* Package ******************************* */
package PaqueteCalculadora;

/* ******************************* Import ******************************** */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

/* ******************************* Class ********************************* */
/**
 * Clase principal para las pruebas de la clase Main
 * @author Adrian
 */
class MainTest {
  /* Local Methods */
  /**
   * Metodo de prueba que comprobara la validez del metodo pedirNumero
   * de la clase Main.
   */
  @Test
  void pedirNumero() {
    /* Local variables */
    String numTexto = "-4";

    /* Local code */
    /* Hacer un mock de la clase Scanner a traves de System.in
     * con un Input Stream */
    InputStream in = new ByteArrayInputStream(numTexto.getBytes());
    System.setIn(in);

    /* Llamar al metodo de prueba */
    int num = Main.pedirNumero("Primero");

    /* Comprobar el resultado */
    assertEquals(Integer.parseInt(numTexto), num);
  } // End pedirNumero
} // End class MainTest