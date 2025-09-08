package model;
//Integrantes: Manceñido Xenia, Ortiz Paez Lourdes, Ortiz Paez Santiago, Ozan Santiago 
import java.util.HashSet;

public class Alumno {
    private int nroLegajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumno() {
        this.materias = new HashSet<>();
    }

    public Alumno(int nroLegajo, String apellido, String nombre) {
        this.nroLegajo = nroLegajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void inscribirMateria(Materia materia) {
        materias.add(materia);
    }
    
    public int cantidadMaterias(){
        return materias.size();
    }
    
     @Override
    public String toString() {
        return apellido + " " + nombre + " (Legajo: " + nroLegajo + ")";
    }
    
}
