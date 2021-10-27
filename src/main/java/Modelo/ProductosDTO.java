
package Modelo;


public class ProductosDTO {
    
    private Long Codigo_Producto;
    private Double Iva_Compra_Producto;
    private Long Nit_Proveedor_Producto;
    private String Nombre_Producto;
    private Double Precio_Compra_Producto;
    private Double Precio_Venta_Producto;

    public ProductosDTO(Long Codigo_Producto, Double Iva_Compra_Producto, Long Nit_Proveedor_Producto, String Nombre_Producto, Double Precio_Compra_Producto, Double Precio_Venta_Producto) {
        this.Codigo_Producto = Codigo_Producto;
        this.Iva_Compra_Producto = Iva_Compra_Producto;
        this.Nit_Proveedor_Producto = Nit_Proveedor_Producto;
        this.Nombre_Producto = Nombre_Producto;
        this.Precio_Compra_Producto = Precio_Compra_Producto;
        this.Precio_Venta_Producto = Precio_Venta_Producto;
    }

    public Long getCodigo_Producto() {
        return Codigo_Producto;
    }

    public void setCodigo_Producto(Long Codigo_Producto) {
        this.Codigo_Producto = Codigo_Producto;
    }

    public Double getIva_Compra_Producto() {
        return Iva_Compra_Producto;
    }

    public void setIva_Compra_Producto(Double Iva_Compra_Producto) {
        this.Iva_Compra_Producto = Iva_Compra_Producto;
    }

    public Long getNit_Proveedor_Producto() {
        return Nit_Proveedor_Producto;
    }

    public void setNit_Proveedor_Producto(Long Nit_Proveedor_Producto) {
        this.Nit_Proveedor_Producto = Nit_Proveedor_Producto;
    }

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }

    public Double getPrecio_Compra_Producto() {
        return Precio_Compra_Producto;
    }

    public void setPrecio_Compra_Producto(Double Precio_Compra_Producto) {
        this.Precio_Compra_Producto = Precio_Compra_Producto;
    }

    public Double getPrecio_Venta_Producto() {
        return Precio_Venta_Producto;
    }

    public void setPrecio_Venta_Producto(Double Precio_Venta_Producto) {
        this.Precio_Venta_Producto = Precio_Venta_Producto;
    }
    
    
}
