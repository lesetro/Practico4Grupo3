package Practico4grupo3;




public class Materia {
    private int idMateria;
    private String nombre;
    private int año;

    public Materia(int idMateria, String nombre, int año) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Materia materia = (Materia) o;

        return idMateria == materia.idMateria;
    }

    @Override
    public int hashCode() {
        return idMateria;
    }
}
