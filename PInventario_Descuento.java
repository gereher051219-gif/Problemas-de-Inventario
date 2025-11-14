import java.util.Scanner;
public class PInventario_Descuento {
    public static void main(String[] args) {
        Scanner ingresarDatos = new Scanner(System.in);
        //pedir al usario que ingrese los datos
        System.out.println("Ingrese el costo del pedido: ");
        double k = ingresarDatos.nextDouble();
        System.out.println("Ingrese el valor de la demanda: ");
        double d = ingresarDatos.nextDouble();

        //que el usuario indique cuantos valores va a meter para el cosoto unitario
        System.out.println("Indique cuantos valores dara para el costo unitario: ");
        double numDatos = ingresarDatos.nextDouble();
        double costoUnitario[] = new double[(int)(numDatos)];
        for(int i = 0; i< numDatos; i++){
            System.out.println("Ingrese el valor de costo unitario " + (i+1) + ":");
            costoUnitario[i] = ingresarDatos.nextInt();
        }       

        System.out.println("ingrese el porcentaje de descuento: ");
        double iPorcentaje = ingresarDatos.nextDouble();

        //solucion de h
        int i;
        double hAlmacenar[]=new double[(int)(numDatos)]; 
        for(i=0; i< numDatos; i++){
            System.out.println("El valor de Costo de almacenamiento es: " + (iPorcentaje*costoUnitario[i]));
            hAlmacenar[i] = iPorcentaje*costoUnitario[i];
        }
        //solucion de y*
        double yAlmacenar[]= new double[(int)(numDatos)];
        for(i =0; i < numDatos; i++){
            yAlmacenar[i]=Math.sqrt((2*k*d)/hAlmacenar[i]);
            System.out.println("La cantidad de pedido (y*) es: " + yAlmacenar[i]);
        }
        //solucion de CTU
        double ctu[]=new double[(int)(numDatos)];
        for(i =0; i < numDatos; i++){
            double cc, co, cm;
            cc = d*costoUnitario[i];
            co = (d*k)/yAlmacenar[i];
            cm = (hAlmacenar[i]*yAlmacenar[i])/2;
            ctu[i] = cc+co+cm;
            System.out.println("El valor de CTU es: " + ctu[i]);
        }
        
    }
}
