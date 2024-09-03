/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico4grupo3;

import Practico4grupo3.Materia;
import Practico4grupo3.Alumno;
import java.util.Objects;


public class Inscripcion {
    
    private Alumno alumno;  
    private Materia materia;  

    
    public Inscripcion(Alumno alumno, Materia materia) {  
        this.alumno = alumno;  
        this.materia = materia;  
    }  

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.alumno);
        hash = 23 * hash + Objects.hashCode(this.materia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inscripcion other = (Inscripcion) obj;
        if (!Objects.equals(this.alumno, other.alumno)) {
            return false;
        }
        return Objects.equals(this.materia, other.materia);
    }

     
    public Alumno getAlumno() {  
        return alumno;  
    }  

    public Materia getMateria() {  
        return materia;  
    }  

    
    @Override  
    public String toString() {  
        return "Inscripción: " + alumno.getApellido() + " en " + materia.getNombre();  
    }  
}  
    

