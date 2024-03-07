/* ******************************* Package ******************************* */
package PaqueteCalculadora;

/* ******************************* Import ******************************** */
import java.util.Scanner;

/* ******************************* Class ********************************* */
public class Main{
  /* ****************************** Constant ******************************* */
  public static Scanner scan = new Scanner(System.in);

  /* ******************************* Methods ******************************* */
  public static void main(String[]args){
    /* Local variables */

    /* local code */
    menu();
  } // End Main

  /* *********************************************************************** */
  public static void menu(){
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
        System.out.println();
        break;

      case "1": // Sumar
        System.out.println();
        break;

      case "2": // Restar
        System.out.println();
        break;

      case "3": // Multiplicar
        System.out.println();
        break;

      case "4": // Dividir
        System.out.println();
        break;

      default: // Opciones invalidas
        System.out.println("Error. La entrada \""+entrada+"\" no es una opcion valida.");
        break;
    } // End switch
  } // End menu
} // End class
