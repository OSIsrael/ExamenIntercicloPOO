package ec.edu.ups.poo;

import java.util.ArrayList;
import java.util.List;

public class Calificacion {
    private double nota;
    private List<Asignatura> asignaturas;

    public Calificacion() {
        this.asignaturas = new ArrayList<>();
    }

    public Calificacion(double nota) {
        this.nota = nota;
        this.asignaturas=new ArrayList<>();
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    public void addAsignaturas(Asignatura asignatura) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Calificacion{" +
                "nota=" + nota +
                ", asignaturas=" + asignaturas +
                '}';
    }
}
