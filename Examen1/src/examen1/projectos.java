
package examen1;

import java.util.ArrayList;

public class projectos {
    //clases, métodos y/o atributos.
    private String clase;
    private String metodo;
    private String atributos;

    public projectos() {
    }

    public projectos(String clase, String metodo, String atributos) {
        this.clase = clase;
        this.metodo = metodo;
        this.atributos = atributos;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getAtributos() {
        return atributos;
    }

    public void setAtributos(String atributos) {
        this.atributos = atributos;
    }

    @Override
    public String toString() {
        return "projectos{" + "clase=" + clase + ", metodos=" + metodo + ", atributos=" + atributos +'}';
    }

    
    
    
}
