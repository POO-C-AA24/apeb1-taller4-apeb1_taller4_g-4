import java.util.Scanner;
public class Problema_2_EmpleadoEjecutor {
    public static void main(String[] args) {
        int numEmpleados, porcAumentoSalarial;
        double promedioSalarios = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual es el numero de empleados que desea gestionar?");
        numEmpleados = teclado.nextInt();
        Problema_2_Empleado arrayEmpleados[] = new Problema_2_Empleado[numEmpleados];
        for (int i = 0; i < arrayEmpleados.length; i++) {
            System.out.println("Ingrese el Nombre del empleado junto su salario y su edad");
            arrayEmpleados[i] = new Problema_2_Empleado(teclado.next(), teclado.nextDouble(), teclado.nextInt());
            promedioSalarios += arrayEmpleados[i].getSalario();
        }
        promedioSalarios = promedioSalarios / arrayEmpleados.length;
        System.out.println("Prom Salario: "+promedioSalarios);
        System.out.println("---------------------------LISTA DE EMPLEADOS---------------------------");
        for (Problema_2_Empleado arrayEmpleado : arrayEmpleados) {
            System.out.println(arrayEmpleado);
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Ingresar porcentaje % de aumento salarial");
        porcAumentoSalarial = teclado.nextInt();
        for (Problema_2_Empleado arrayEmpleado : arrayEmpleados) {
            arrayEmpleado.calcularAumentoSalario(porcAumentoSalarial, promedioSalarios);
        }
        System.out.println("---------------------------LISTA DE EMPLEADOS---------------------------");
        for (Problema_2_Empleado arrayEmpleado : arrayEmpleados) {
            System.out.println(arrayEmpleado);
        }
        System.out.println("------------------------------------------------------------------------");
    }
}
