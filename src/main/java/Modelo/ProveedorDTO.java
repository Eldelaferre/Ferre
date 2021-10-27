
package Modelo;


public class ProveedorDTO {
    
    private Long Nit_Proveedor;
    private String Ciudad_Proveedor;
    private String Direccion_Proveedor;
    private String Nombre_Proveedor;
    private String Telefono_Proveedor;

    public ProveedorDTO(Long Nit_Proveedor, String Ciudad_Proveedor, String Direccion_Proveedor, String Nombre_Proveedor, String Telefono_Proveedor) {
        this.Nit_Proveedor = Nit_Proveedor;
        this.Ciudad_Proveedor = Ciudad_Proveedor;
        this.Direccion_Proveedor = Direccion_Proveedor;
        this.Nombre_Proveedor = Nombre_Proveedor;
        this.Telefono_Proveedor = Telefono_Proveedor;
    }

    public Long getNit_Proveedor() {
        return Nit_Proveedor;
    }

    public void setNit_Proveedor(Long Nit_Proveedor) {
        this.Nit_Proveedor = Nit_Proveedor;
    }

    public String getCiudad_Proveedor() {
        return Ciudad_Proveedor;
    }

    public void setCiudad_Proveedor(String Ciudad_Proveedor) {
        this.Ciudad_Proveedor = Ciudad_Proveedor;
    }

    public String getDireccion_Proveedor() {
        return Direccion_Proveedor;
    }

    public void setDireccion_Proveedor(String Direccion_Proveedor) {
        this.Direccion_Proveedor = Direccion_Proveedor;
    }

    public String getNombre_Proveedor() {
        return Nombre_Proveedor;
    }

    public void setNombre_Proveedor(String Nombre_Proveedor) {
        this.Nombre_Proveedor = Nombre_Proveedor;
    }

    public String getTelefono_Proveedor() {
        return Telefono_Proveedor;
    }

    public void setTelefono_Proveedor(String Telefono_Proveedor) {
        this.Telefono_Proveedor = Telefono_Proveedor;
    }
    
    
}
