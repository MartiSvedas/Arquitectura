package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Carrera  {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;

    @Column
    private int duracion;

    @OneToMany (mappedBy = "carrera", fetch=FetchType.LAZY)
    private Set<EstudianteCarrera> estudiantes;

    public Carrera () {
        this.estudiantes = new HashSet<>();
    }

    public Carrera(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.estudiantes = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<EstudianteCarrera> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Set<EstudianteCarrera> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getId_carrera() {
        return id;
    }

    @Override
    public String toString() {
        return "Carrera [id_carrera=" + id + ", nombre=" + nombre + ", estudiantes=" + estudiantes + "]";
    }




}

