
package examen1;

import java.util.ArrayList;


public class Usuario {
    /*
    El programa contendrá Usuarios los cuales cuentan con Nombre completo, 
    edad, correo electrónico, nombre de usuario (único), contraseña y una 
    lista de clases.
    */
    
    private String nc;
    private String edad;
    private String email;
    private String user;
    private String contra;
    private ArrayList<String> al;

    public Usuario() {
    }

    public Usuario(String nc, String edad, String email, String user, String contra, ArrayList<String> al) {
        this.nc = nc;
        this.edad = edad;
        this.email = email;
        this.user = user;
        this.contra = contra;
        this.al = al;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList<String> getAl() {
        return al;
    }

    public void setAl(ArrayList<String> al) {
        this.al = al;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre completo =" + nc + ", edad=" + edad + ", email=" + email + ", usuario=" + user + ", contra=" + contra + ", clases=" + al + '}';
    }
    
    
    
    
}
