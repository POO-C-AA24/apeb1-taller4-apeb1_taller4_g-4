public class Problema_1_Venta {
    public double precioProducto;
    public int numProducto;
    public double calcularDescuento;
    public double precioFinal;

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void setNumProducto(int numProducto) {
        this.numProducto = numProducto;
    }
    public double calcularDescuento(double precioProducto, int numProducto){
        this.precioProducto = precioProducto * numProducto; 
        if (this.precioProducto >= 1000 && numProducto >= 10) {
            calcularDescuento = (this.precioProducto * 10)/100 ;
            this.precioFinal = precioProducto - calcularDescuento;
            return this.precioFinal;
        }else if (this.precioProducto < 1000) {
            calcularDescuento = (this.precioProducto * 5)/100;
            this.precioFinal = precioProducto - calcularDescuento;
        }
        return this.precioFinal;
    }
    public void calcularPrecioFinal(){
       this.precioFinal = this.precioFinal = precioProducto - calcularDescuento; 
    }

    @Override
    public String toString() {
        return "Prob1_Venta{" + "Precio del Producto sin descuento: " + precioProducto + ", Numero de Productos:" + numProducto + ", Descuento obtenido: " + calcularDescuento + ", Precio que debe pagar: " + precioFinal + '}';
    }
}
