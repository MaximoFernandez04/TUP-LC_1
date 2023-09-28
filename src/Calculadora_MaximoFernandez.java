import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Calculadora_MaximoFernandez {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("CALCULADORA");

        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

        while(condition){
            System.out.println("Ingrese el primer número: ");
            float num_1 = scanner.nextFloat();

            System.out.println("Ingrese la operacion que desea realizar:(0:SALIR 1:SUMA 2:RESTA 3:MULTIPLICACIÓN 4:DIVISION) ");
            String option = scanner.next();

            System.out.println("Ingrese el segundo número: ");
            float num_2 = scanner.nextFloat();

            switch (option){
                case "0": //Si la opción seleccionada por el usuario es 0
                    break;
                case "1": //Si la opción seleccionada por el usuario es 1
                    System.out.println("SUMA");
                    float suma = num_1 + num_2;
                    System.out.println(num_1+" + "+num_2+" = "+suma);
                    break;
                case "2": //Si la opción seleccionada por el usuario es 2
                    System.out.println("RESTA");
                    float resta = num_1 - num_2;
                    System.out.println(num_1+" - "+num_2+" = "+resta);
                    break;
                case "3": //Si la opción seleccionada por el usuario es 3
                    System.out.println("MULTIPLICACIÓN");
                    float mult = num_1 * num_2;
                    System.out.println(num_1+" x "+num_2+" = "+mult);
                    break;
                case "4": //Si la opción seleccionada por el usuario es 4
                    System.out.println("DIVISIÓN");

                    if (num_2 != 0 ){ //Se evalua si el divisor es distinto de 0
                        float div = num_1 / num_2;
                        System.out.println(num_1+" / "+num_2+" = "+div);
                    }else{
                        System.out.println("El divisor debe ser distinto de 0");
                    }
                    break;
                default:
                    System.out.println("La opcion ingresada no es válida");
            }
            System.out.println("Desea realizar otra operación: (y/n) ");
            String opc_cont = scanner.next().toUpperCase();
            boolean cond_sal = opc_cont.equals("Y");
            if (cond_sal) {
                condition = true;
            }else{
                condition = false;
                System.out.println("Operaciones finalizadas");
            }
        }

    }
}