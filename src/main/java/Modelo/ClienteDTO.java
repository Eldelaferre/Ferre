
package Modelo;



public class ClienteDTO {
    
    private Long Cedula_Cliente;
    private String Direccion_Cliente;
    private String Email_Cliente;
    private String Nombre_Cliente;
    private String Telefono_Cliente;

    public ClienteDTO(Long Cedula_Cliente, String Direccion_Cliente, String Email_Cliente, String Nombre_Cliente, String Telefono_Cliente) {
        this.Cedula_Cliente = Cedula_Cliente;
        this.Direccion_Cliente = Direccion_Cliente;
        this.Email_Cliente = Email_Cliente;
        this.Nombre_Cliente = Nombre_Cliente;
        this.Telefono_Cliente = Telefono_Cliente;
    }

    public Long getCedula_Cliente() {
        return Cedula_Cliente;
    }

    public void setCedula_Cliente(Long Cedula_Cliente) {
        this.Cedula_Cliente = Cedula_Cliente;
    }

    public String getDireccion_Cliente() {
        return Direccion_Cliente;
    }

    public void setDireccion_Cliente(String Direccion_Cliente) {
        this.Direccion_Cliente = Direccion_Cliente;
    }

    public String getEmail_Cliente() {
        return Email_Cliente;
    }

    public void setEmail_Cliente(String Email_Cliente) {
        this.Email_Cliente = Email_Cliente;
    }

    public String getNombre_Cliente() {
        return Nombre_Cliente;
    }

    public void setNombre_Cliente(String Nombre_Cliente) {
        this.Nombre_Cliente = Nombre_Cliente;
    }

    public String getTelefono_Cliente() {
        return Telefono_Cliente;
    }

    public void setTelefono_Cliente(String Telefono_Cliente) {
        this.Telefono_Cliente = Telefono_Cliente;
    }
    
    
}
