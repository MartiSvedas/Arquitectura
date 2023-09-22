package entities;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Objects;

@Entity
@Table(name ="estudiante_carrera")
public class EstudianteCarrera implements Serializable {
    @Id
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_estudiante")
    private Estudiante estudiante;

    @Id
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_carrera")
    private Carrera carrera;

    @Column(name="fecha_graduacion")
    private Timestamp fecha_inscripcion;



    @Column(name="fecha_egreso")
    private Timestamp fecha_egreso;

    @Column (name="antiguedad")
    private int antiguedad;

    public EstudianteCarrera( Estudiante e, Carrera c, Timestamp anio_inscripcion, Timestamp anio_egreso, int antiguedad) {
        this.estudiante=e;
        this.carrera=c;
        this.fecha_inscripcion = anio_inscripcion;
        this.fecha_egreso = anio_egreso;
        this.antiguedad = antiguedad;
    }

    public EstudianteCarrera() {
    }


    public Timestamp getAnio_inscripcion() {
        return this.fecha_inscripcion;
    }

    public Timestamp getAnio_egreso() {
        return this.fecha_egreso;
    }

    public void setAnio_inscripcion(Timestamp anio_inscripcion) {
        this.fecha_inscripcion = anio_inscripcion;
    }

    public void setAnio_egreso(Timestamp anio_egreso) {
        this.fecha_egreso = anio_egreso;
    }

    public Integer getAntiguedad() {
        Calendar fechaInscripcion = Calendar.getInstance();
        fechaInscripcion.setTimeInMillis(this.fecha_inscripcion.getTime());
        return Calendar.getInstance().get(Calendar.YEAR) - fechaInscripcion.get(Calendar.YEAR);
    }

    public int id_carrera(){
        return this.carrera.getId_carrera();
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Timestamp getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(Timestamp fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public Timestamp getFecha_egreso() {
        return fecha_egreso;
    }

    public void setFecha_egreso(Timestamp fecha_egreso) {
        this.fecha_egreso = fecha_egreso;
    }

    @Override
    public String toString() {
        return "EstudianteCarrera [año inscripcion=" + fecha_inscripcion + ", año egreso=" + fecha_egreso + ", antiguedad="
                + antiguedad + "]";
    }
}

