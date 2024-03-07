/* ******************************* Package ******************************* */
package PaqueteCalculadora;

/* ******************************* Import ******************************** */
import java.util.Scanner;

/* ******************************* Class ********************************* */
/** Clase que sera el nucleo del programa */
public class Main{
  /* ****************************** Constant ******************************* */
  /** 
   * Instancia de la clase scanner para introducir informacion al programa
   * por entrada estandar.
   */
  public static Scanner scan = new Scanner(System.in);

  /* ******************************* Methods ******************************* */
  /**
   * Metodo main principal del programa.
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
   * @param c Objeto de tipo calculadora para realziar los calculos.
   */
  public static void menu(Calculadora c){
    /* Local variables */
    String entrada;

    /* Local code */
    do{ // Repetir mientras el usuario no intrduzca un 0 (Salir)
      do{ // Repetir mientras la entrada sea vacia
        /* Imprimir menu principal */
        System.out.println("Menu");
        System.out.println("1. - Sumar.");
        System.out.println("2. - Restar.");
        System.out.println("3. - Multiplicar.");
        System.out.println("4. - Dividir.");
        System.out.println("0. - Salir.");
        
        /* Pedir al usuario opcion por entrada estandar */
        System.out.print("\nIntroduzca la opcion que desea realizar (0 a 4): ");
        entrada = scan.nextLine();

        /* Si la entrada es vacia, informar al usuario */
        if(entrada.isEmpty())
          System.out.println("Error. La entrada no puede ser vacia.");
      }while(entrada.isEmpty());
    }while(!entrada.equals("0"));

    /* Filtrar la opcion introducida entre todas las posibles, 
     * validas o invalidas */
    switch(entrada){
      case "0": // Salir
        System.out.println("Adios.\n");
        break;

      case "1": // Sumar
        System.out.println(c.sumar(pedirNumero(), pedirNumero()));
        break;

      case "2": // Restar
        System.out.println(c.restar(pedirNumero(), pedirNumero()));
        break;

      case "3": // Multiplicar
        System.out.println(c.multiplicar(pedirNumero(), pedirNumero()));
        break;

      case "4": // Dividir
        System.out.println(c.dividir(pedirNumero(), pedirNumero()));
        break;

      default: // Opciones invalidas
        System.out.println("Error. La entrada \""+entrada+"\" no es una opcion valida.");
        break;
    } // End switch
  } // End menu

  /* *********************************************************************** */
  /**
   * Metodo que pedira un numero al usuario por entrada estandar y comprobara su validez.
   * @return Un numero entero valido para el programa.
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
        System.out.println("Introduzca el "+orden+" numero entero: ");
        entrada = scan.nextLine();

        /* Si la entrada es vacia, informar al usuario */
        if(entrada.isEmpty())
          System.out.println("Error. La entrada no puede ser vacia");
      }while(entrada.isEmpty());
      
      /* Comprobacion de que la entrada introducida es un numero entero */
      try{
        num = Integer.parseInt(entrada);
      }catch(Exception e){
        System.out.println("Error. La entrada \""+entrada+"\" no es un numero entero.\n");
        valido = false;
      } // End try-catch
    }while(!valido);

    // Devolver numero
    return num;
  } // End pedirNumero
} // End class
