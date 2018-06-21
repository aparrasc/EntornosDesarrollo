import java.util.Date;
import java.util.Vector;

public class Pedido {

  public String Producto;

  public Integer Cantidad;

  public Date FechaF;

  public Double CosteTotal;

    /**
   * 
   * @element-type Productos
   */
    /**
   * 
   * @element-type FormaPago
   */
  public Vector  tiene;
    public Estado tiene_e; //Lo he cambiado para que no de errores.
    public Clientes hace;

  public void calcularCoste(double Precio_i,int  Cantidad,double  Impuestos) {
  }

}