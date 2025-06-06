package ec.edu.ups.poo;

public class Asignatura {
    private String docente;
    private String nombre;

    public Asignatura() {
    }
    public Asignatura(String docente, String nombre) {
        this.docente = docente;
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "docente='" + docente + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
