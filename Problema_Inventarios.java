import java.util.Scanner;

public class Problema_Inventarios {

    public static void main(String[] args) {
        Scanner ingresarDatos = new Scanner(System.in);
        //pedir al usuario que ingrese los daots correspondientes
        System.out.println("Ingrese la demandaa diaria: ");
        float demandaD = ingresarDatos.nextFloat();
        System.out.println("Ingrese el costo de pedido: ");
        float k = ingresarDatos.nextFloat();
        System.out.println("Ingrese el costo de almacenamiento: ");
        float h = ingresarDatos.nextFloat();
        System.out.println("Ingrese el tiempo de entrega del pedido: ");
        float L = ingresarDatos.nextFloat();

        //solucion de y*
        double y;
        y = Math.sqrt((2*k*demandaD/h));
        System.out.println("La cantidad de pedido es: " + y);
        //solucion de t0
        float t0, n, Le;
        t0 = (float) (y / demandaD);
        //L/t0
        n = (float)Math.floor(L/t0);          
        //Le              
        Le = L - (n * t0);
        System.out.println("Le es: " + Le); 
        Le = Le * demandaD;
        System.out.println("El punto de reorden: " + Le);

    }
}