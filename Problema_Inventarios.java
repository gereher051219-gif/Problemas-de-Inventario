import java.util.Scanner;

public class Problema_Inventarios {

    public static void main(String[] args) {
        Scanner ingresarDatos = new Scanner(System.in);
        //pedir al usuario que ingrese los daots correspondientes
        System.out.println("Ingrese la demandaa diaria: ");
        double demandaD = ingresarDatos.nextDouble();
        System.out.println("Ingrese el costo de pedido: ");
        double k = ingresarDatos.nextDouble();
        System.out.println("Ingrese el costo de almacenamiento: ");
        double h = ingresarDatos.nextDouble();
        System.out.println("Ingrese el tiempo de entrega del pedido: ");
        double L = ingresarDatos.nextDouble();

        //solucion de y*
        double y;
        y = Math.sqrt((2*k*demandaD/h));
        System.out.println("La cantidad de pedido es: " + y);

    }
}