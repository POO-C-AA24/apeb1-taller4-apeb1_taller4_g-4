
import java.util.Scanner;

public class Ejecutor_Ventas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precioProducto;
        int numProducto;
        System.out.println("Ingrese el precio del producto: ");
        precioProducto = teclado.nextDouble();
        System.out.println("Ingrese el numero de productos: ");
        numProducto = teclado.nextInt();
        Prob1_Venta produc_1 = new Prob1_Venta();
        produc_1.setPrecioProducto(precioProducto);
        produc_1.setNumProducto(numProducto);
        produc_1.calcularDescuento(precioProducto, numProducto);
        produc_1.calcularPrecioFinal();
        System.out.println(produc_1);
        
    }
   
}
