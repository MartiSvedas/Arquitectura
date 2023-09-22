package entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Estudiante {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column
    private int dni;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private int edad;
    @Column
    private String genero;

    @Column (name="ciudad")
    private String ciudadResidencia;
    @Column
    private int LU;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estudiante")
    private Set<EstudianteCarrera> carreras;

    public Estudiante(int dni, String nombre, String apellido, int edad, String genero, String ciudad, int Lu) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.dni = dni;
        this.ciudadResidencia = ciudad;
        this.LU = Lu;
        this.carreras = new HashSet<>();
    }

    public Estudiante() {
    this.carreras=new HashSet<>();
    }


    public String getNombres() {
        return nombre;
    }

    public void setNombres(String nombres) {
        this.nombre = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDni() {
        return dni;
    }


    public int getId_estudiante() {
        return id;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public int getNumeroLibreta() {
        return LU;
    }

    public void setNumeroLibreta(int numeroLibreta) {
        this.LU = numeroLibreta;
    }

    @Override
    public String toString() {
        return "Estudiante [nombres=" + nombre + ", apellido=" + apellido
                + ", edad=" + edad + ", genero=" + genero + ", dni=" + dni + ", ciudadResidencia=" + ciudadResidencia
                + ", numeroLibreta=" + LU + ", carreras="  + "]";
    }

}

