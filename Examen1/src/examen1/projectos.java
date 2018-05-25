
package examen1;

import java.util.ArrayList;

public class projectos {
    //clases, métodos y/o atributos.
    private String clase;
    private ArrayList<String> metodo;
    private ArrayList<String> atributos;

    public projectos() {
    }

    public projectos(String clase, ArrayList<String> metodo, ArrayList<String> atributos) {
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

    public ArrayList<String> getMetodo() {
        return metodo;
    }

    public void setMetodo(ArrayList<String> metodo) {
        this.metodo = metodo;
    }

    public ArrayList<String> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<String> atributos) {
        this.atributos = atributos;
    }

    @Override
    public String toString() {
        return "projectos{" + "clase=" + clase + ", metodos=" + metodo + ", atributos=" + atributos +'}';
    }

    
    
    
}
