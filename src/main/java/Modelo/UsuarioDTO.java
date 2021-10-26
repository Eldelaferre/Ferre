
package Modelo;

import java.math.BigInteger;


public class UsuarioDTO {
     
    private Long Cedula_Usuario;
    private String Email_Usuario;
    private String Nombre_Usuario;
    private String Password;
    private String Usuario;

    public UsuarioDTO(Long Cedula_Usuario, String Email_Usuario, String Nombre_Usuario, String Password, String Usuario) {
        this.Cedula_Usuario = Cedula_Usuario;
        this.Email_Usuario = Email_Usuario;
        this.Nombre_Usuario = Nombre_Usuario;
        this.Password = Password;
        this.Usuario = Usuario;
    }

    public Long getCedula_Usuario() {
        return Cedula_Usuario;
    }

    public void setCedula_Usuario(Long Cedula_Usuario) {
        this.Cedula_Usuario = Cedula_Usuario;
    }

    public String getEmail_Usuario() {
        return Email_Usuario;
    }

    public void setEmail_Usuario(String Email_Usuario) {
        this.Email_Usuario = Email_Usuario;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String Nombre_Usuario) {
        this.Nombre_Usuario = Nombre_Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
    
     
}
