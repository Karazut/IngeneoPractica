package bean.model;
// Generated 25-feb-2016 13:23:15 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Nomina generated by hbm2java
 */
public class Nomina  implements java.io.Serializable {


     private Integer codNomina;
     private Categoriaprofesional categoriaprofesional;
     private Empleado empleado;
     private Date nomFecha;
     private double nomSalario;

    public Nomina() {
    }

    public Nomina(Categoriaprofesional categoriaprofesional, Empleado empleado, Date nomFecha, double nomSalario) {
       this.categoriaprofesional = categoriaprofesional;
       this.empleado = empleado;
       this.nomFecha = nomFecha;
       this.nomSalario = nomSalario;
    }
   
    public Integer getCodNomina() {
        return this.codNomina;
    }
    
    public void setCodNomina(Integer codNomina) {
        this.codNomina = codNomina;
    }
    public Categoriaprofesional getCategoriaprofesional() {
        return this.categoriaprofesional;
    }
    
    public void setCategoriaprofesional(Categoriaprofesional categoriaprofesional) {
        this.categoriaprofesional = categoriaprofesional;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Date getNomFecha() {
        return this.nomFecha;
    }
    
    public void setNomFecha(Date nomFecha) {
        this.nomFecha = nomFecha;
    }
    public double getNomSalario() {
        return this.nomSalario;
    }
    
    public void setNomSalario(double nomSalario) {
        this.nomSalario = nomSalario;
    }




}


