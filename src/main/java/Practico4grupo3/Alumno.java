package Practico4grupo3;

import Practico4grupo3.Materia;
import java.util.HashSet;

public class Alumno {
    private Integer nroLegajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumno(Integer nroLegajo, String apellido, String nombre) {
        this.nroLegajo = nroLegajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(Integer nroLegajo) {
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

    public void agregarMateria(Materia materia) {
        materias.add(materia); // HashSet previene duplicados automáticamente
    }

    public int cantidadMaterias() {
        return materias.size();
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }
}
