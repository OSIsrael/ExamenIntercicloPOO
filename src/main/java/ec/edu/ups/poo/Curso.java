package ec.edu.ups.poo;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Curso() {
        this.estudiantes = new ArrayList<>();
    }

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addEstudiante(Estudiante estudiantes) {
        this.estudiantes.add(estudiantes);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", estudiantes=" + estudiantes +
                '}';
    }
}
