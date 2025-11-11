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
        //solucion de t0
        double t0, n, Le;
        t0 = Math.floor((y / demandaD)*100)/100;
        System.out.println("(t0): Pedir cada: " + t0 + " dias");
        //L/t0
        n = Math.floor(L/t0);          
        //Le              
        Le = L - (n * t0);
        double puntoR = Le * demandaD;
        System.out.println("Reordenar cuando el inventario llegue a: " + puntoR);

        //tcu Costo toatl de inventario
        double tcu;
        tcu = k / (y/demandaD) + h * y/2;
        System.out.println("El costo total de inventario es de: " + tcu + " pesos" );

    }
}