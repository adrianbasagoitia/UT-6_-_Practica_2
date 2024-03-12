/* ******************************* Package ******************************* */
package PaqueteCalculadora;

/* ******************************* Import ******************************** */
import java.util.Scanner;

/* ******************************* Class ********************************* */
/**
 * Clase que sera el nucleo del programa
 * @author Adrian
 */
public class Main{
  /* ****************************** Constant ******************************* */
  /** 
   * Instancia de la clase scanner para introducir informacion al programa
   * por entrada estandar.
   */
  private static Scanner scan = new Scanner(System.in);
  /** Constante utilizada para la llamada a los metodos de la clase calculadora */
  private static final String C1 = "Primer";
  /** Constante utilizada para la llamada a los metodos de la clase calculadora */
  private static final String C2 = "Segundo";

  /* ******************************* Methods ******************************* */
  /**
   * Metodo main principal del programa. Crea una instancia de la clase calculadora,
   * y llama al metodo menu de esta misma clase.
   * @param args Argumentos del metodo.
   */
  public static void main(String[]args){
    /* Local variables */
    Calculadora c = new Calculadora();

    /* local code */
    menu(c);
  } // End Main

  /* *********************************************************************** */
  /**
   * Metodo que simulara un menu, y sera la principal interfaz con el usuario.
   * @param c Objeto de tipo calculadora para realizar los calculos.
   */
  public static void menu(Calculadora c){
    /* Local variables */
    String entrada;
    int num1, num2, res;
    double resD;

    /* Local code */
    do{ // Repetir mientras el usuario no introduzca un 0 (Salir)
      do{ // Repetir mientras la entrada sea vacia
        /* Imprimir menu principal */
        System.out.println("\nMenu");
        System.out.println("1. - Sumar.");
        System.out.println("2. - Restar.");
        System.out.println("3. - Multiplicar.");
        System.out.println("4. - Dividir.");
        System.out.println("0. - Salir.");
        
        /* Pedir al usuario la opcion por entrada estandar */
        System.out.print("\nIntroduzca la opcion que desea realizar (0 a 4): ");
        entrada = scan.nextLine();

        /* Si la entrada es vacia, informar al usuario */
        if(entrada.isEmpty())
          System.out.println("Error. La entrada no puede ser vacia.\n");
      }while(entrada.isEmpty());

      /* Filtrar la opcion introducida entre todas las posibles,
       * validas o invalidas */
      switch(entrada){
        case "0": // Salir
          System.out.println("Adios.\n");
          break;

        case "1": // Sumar
          num1 = pedirNumero(C1);
          num2 = pedirNumero(C2);
          res = c.sumar(num1, num2);
          System.out.println(num1+" + "+num2+" = "+res);
          break;

        case "2": // Restar
          num1 = pedirNumero(C1);
          num2 = pedirNumero(C2);
          res = c.restar(num1, num2);
          System.out.println(num1+" - "+num2+" = "+res);
          break;

        case "3": // Multiplicar
          num1 = pedirNumero(C1);
          num2 = pedirNumero(C2);
          res = c.multiplicar(num1, num2);
          System.out.println(num1+" * "+num2+" = "+res);
          break;

        case "4": // Dividir
          num1 = pedirNumero(C1);
          num2 = pedirNumero(C2);
          resD = c.dividir(num1, num2);
          System.out.printf("%.3f",resD);
          System.out.println();
          break;

        default: // Opciones invalidas
          System.out.println("Error. La entrada \""+entrada+"\" no es una opcion valida.\n");
          break;
      } // End switch
    }while(!entrada.equals("0"));
  } // End menu

  /* *********************************************************************** */
  /**
   * Metodo que pedira un numero al usuario por entrada estandar y comprobara su validez.
   * @return Un numero entero valido para el programa.
   * @throws NumberFormatException En caso de que la cadena de caracteres
   * pedida al usuario, no contenga un numero entero valido.
   */
  public static int pedirNumero(String orden){
    /* Local variables */
    boolean valido;
    String entrada;
    int num = -1;

    /* Local code */
    do{ // Repetir mientras no se obtenga un numero entero valido
      valido = true; // Refrescar el valor de la variable.
      do{ // Repetir mientra la entrada sea vacia
        /* Pedir un numero al usuario por entrada estandar */
        System.out.print("\nIntroduzca el "+orden+" numero entero: ");
        entrada = scan.nextLine();

        /* Si la entrada es vacia, informar al usuario */
        if(entrada.isEmpty())
          System.out.println("Error. La entrada no puede ser vacia.\n");
      }while(entrada.isEmpty());
      
      /* Comprobacion de que la entrada introducida es un numero entero */
      try{
        num = Integer.parseInt(entrada);
      }catch(NumberFormatException e){
        System.out.println("Error. La entrada \""+entrada+"\" no es un numero entero.\n");
        valido = false;
      } // End try-catch
    }while(!valido);

    // Devolver numero
    return num;

  } // End pedirNumero

} // End class
