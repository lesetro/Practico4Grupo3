/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico4grupo3;

import Practico4grupo3.Materia;
import Practico4grupo3.Alumno;


public class Inscripcion {
    
    private Alumno alumno;  
    private Materia materia;  

    // Constructor  
    public Inscripcion(Alumno alumno, Materia materia) {  
        this.alumno = alumno;  
        this.materia = materia;  
    }  

    // Getters  
    public Alumno getAlumno() {  
        return alumno;  
    }  

    public Materia getMateria() {  
        return materia;  
    }  

    // Método para representar la inscripción como una cadena  
    @Override  
    public String toString() {  
        return "Inscripción: " + alumno.getApellido() + " en " + materia.getNombre();  
    }  
}  
    

