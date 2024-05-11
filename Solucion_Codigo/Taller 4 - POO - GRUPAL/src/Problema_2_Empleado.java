public class Problema_2_Empleado {
    public String nombre;
    private double salario;
    private int edad;
    
    public Problema_2_Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }
    
    public void calcularAumentoSalario(int porcAumentoSalarial, double promedioSalarios){
        this.salario += (this.salario < promedioSalarios) ? (this.salario * porcAumentoSalarial/100) : 0 ;
    }
    
    @Override
    public String toString() {
        return "Problema_2_Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", edad=" + edad + '}';
    }
}
