/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogot� - Colombia)
 * Programa de Ingenier�a de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Desarrollo de Software - Gu�a 2 - Actividad 2
 * Ejercicio: tienda
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package mundo;

/**
 * Producto de la tienda.
 */
public class Producto {

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Nombre del producto.
     */
    private String nombre;

    /**
     * Tipo del producto.
     */
    private String tipo;

    /**
     * Valor unitario del producto.
     */
    private double valorUnitario;

    /**
     * Cantidad de unidades en la bodega del producto.
     */
    private int cantidadBodega;

    /**
     * Cantidad de unidades m�nima que debe haber en bodega para poder hacer un pedido.
     */
    private int cantidadMinima;

    /**
     * Cantidad de unidades vendidas del producto.
     */
    private int cantidadUnidadesVendidas;

    /**
     * Ruta de la imagen del producto.
     */
    private final String rutaImagen;

    //IVA
    private final static double IVA_PAPELERIA = 0.16;
    private final static double IVA_SUPERMERCADO = 0.04;
    private final static double IVA_DROGUERIA = 0.12;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea un producto con los valores dados por par�metro. <br>
     * <b> post: </b> El tipo, nombre, valor unitario, cantidad en bodega, cantidad m�nima y ruta imagen fueron inicializados con los valores dado por par�metro.
     *
     * @param pTipo           Tipo del producto. pTipo != null.
     * @param pNombre         Nombre del producto. pNombre != null && pNombre != "".
     * @param pValorUnitario  Valor unitario del producto. pValorUnitario >= 0.
     * @param pCantidadBodega Cantidad inicial en la bodega. pCantidadBodega >= 0.
     * @param pCantidadMinima Cantidad m�nima que debe haber en bodega. pCantidadMinima >= 0.
     * @param pRutaImagen     Ruta de la imagen del producto. pRutaImagen != null && pRutaImagen != "".
     */
    public Producto(String pTipo, String pNombre, double pValorUnitario, int pCantidadBodega, int pCantidadMinima, String pRutaImagen) {
        tipo = pTipo.toLowerCase();
        nombre = pNombre;
        valorUnitario = pValorUnitario;
        cantidadBodega = pCantidadBodega;
        cantidadMinima = pCantidadMinima;
        rutaImagen = pRutaImagen;
        cantidadUnidadesVendidas = 0;
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el nombre del producto.
     *
     * @return Nombre del producto.
     */
    public String darNombre() {
        return nombre;
    }

    /**
     * Retorna el tipo del producto.
     *
     * @return Tipo de producto.
     */
    public String darTipo() {
        return tipo.toLowerCase();
    }

    /**
     * Retorna el valor unitario del producto.
     *
     * @return Valor unitario del producto.
     */
    public double darValorUnitario() {
        return valorUnitario;
    }

    /**
     * Retorna la cantidad en bodega del producto.
     *
     * @return Cantidad en bodega del producto.
     */
    public int darCantidadBodega() {
        return cantidadBodega;
    }

    /**
     * Retorna la cantidad m�nima del producto.
     *
     * @return Cantidad m�nima del producto.
     */
    public int darCantidadMinima() {
        return cantidadMinima;
    }

    /**
     * Retorna la cantidad total de unidades vendidas.
     *
     * @return Cantidad de unidades vendidas.
     */
    public int darCantidadUnidadesVendidas() {
        return cantidadUnidadesVendidas;
    }

    /**
     * Retorna la ruta de la imagen del producto.
     *
     * @return Ruta de la imagen del producto.
     */
    public String darRutaImagen() {
        return rutaImagen;
    }

    /**
     * Cambia el nombre del producto.
     *
     * @param nuevoNombre
     */
    public void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
        // TODO: Cambiar el nombre del producto
    }

    /**
     * Cambia el tipo del producto
     */
    public void cambiarTipo(String nuevoTipo) {
        this.tipo = nuevoTipo.toLowerCase();
    }

    /**
     * Cambiar el valor unitario del producto
     */
    public void cambiarValorUnitario(double nuevoValorUnitario) {
        valorUnitario= nuevoValorUnitario;
        // TODO: Cambiar el valor unitario del producto
    }

    /**
     * Cambiar la nueva cantidad en bodega
     */
    public void cambiarCantidadBodega(int nuevaCantidadEnBodega) {
        cantidadBodega = nuevaCantidadEnBodega;
        // TODO: Cambiar la nueva cantidad en bodega
    }

    /**
     * Cambiar la cantidad m�nima en bodega del producto
     */
    public void cambiarCantidadMinima(int nuevaCantidadMinima) {
        cantidadMinima = nuevaCantidadMinima;
        // TODO: Cambiar la cantidad m�nima en bodega del producto
    }

    /**
     * Cambia la cantidad de unidades vendidas del producto
     */
    public void cambiardarCantidadUnidadesVendidas(int nuevaCantidadUnidadesVendidas) {
        cantidadUnidadesVendidas = nuevaCantidadUnidadesVendidas;
        // TODO: Cambia la cantidad de unidades vendidas del producto
    }

    /**
     * Calcula el valor final del producto, incluyendo los impuestos.
     *
     * @return Precio de venta de una unidad incluyendo el IVA.
     */
    public double calcularPrecioFinal() {
        return valorUnitario + darValorUnitario()*darIVA();
        // TODO: Calcular el valor unitario final con el IVA incluido.

    }

    /**
     * Retorna el IVA correspondiente al producto.
     *
     * @return IVA.
     */
    public double darIVA() {
        double iva = 0.0;
        switch(tipo)
        {
            case "papeleria":
                iva += IVA_PAPELERIA ;
                break;
            case "supermercado":
                iva += IVA_SUPERMERCADO ;
                break;
            case "drogueria":
                iva += IVA_DROGUERIA ;
                break;
        }

        // TODO: A partir del tipo de producto, retornar el IVA

        return iva;
    }

    /**
     * Vende la cantidad de unidades dada por par�metro. <br>
     * Es decir, disminuye la cantidad de unidades en bodega del producto.
     * Si la cantidad a vender es mayor que la cantidad en bodega se debe
     * dejar la cantidad en bodega en cero, y se debe retornar la cantidad
     * en bodega que hab�a antes.
     * En cualquier otro caso, se disminuye la cantidad en bodega en la
     * cantidad a vender. Hay que retornar esa cantidad vendida.
     *
     * @param pCantidad Cantidad de unidades a vender. pCantidad > 0.
     * @return Cantidad que realmente fue vendida, seg�n la disponibilidad en la bodega.
     */
    public int vender(int pCantidad) {
        int cantidadVendida = 0;

        // TODO: Vender la cantidad dada del producto.
        if (pCantidad > cantidadBodega){
            cantidadVendida = cantidadBodega;
            cantidadBodega = 0;
        }
        else {
            cantidadBodega -= pCantidad;
            cantidadVendida = pCantidad;

        }
        cantidadUnidadesVendidas += cantidadVendida;

        return cantidadVendida;
    }

    /**
     * Abastece la cantidad de unidades dada por par�metro. <br>
     * <b>post: </b> Aumenta la cantidad de unidades en bodega del producto.
     *
     * @param pCantidad Cantidad de unidades para abastecer. pCantidad >= 0.
     */
    public void abastecer(int pCantidad) {
        // TODO: Aumentar la cantidad en inventario
        cantidadBodega += pCantidad;
    }

    /**
     * Indica si se puede abastecer las unidades del producto.
     *
     * @return True si la cantidad en la bodega es menor que la m�nima, false en caso contrario.
     */
    public boolean puedeAbastecer() {
        // TODO: Retornar true o false si se puede abastecer o no
        return cantidadBodega < cantidadMinima;
    }
}