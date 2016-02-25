package bean.model;
// Generated 25-feb-2016 11:50:27 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="empleado")
@ViewScoped
public class Empleado  implements java.io.Serializable {


     private Integer codEmpleado;
     private Departamento departamento;
     private Empleado empleado;
     private String empNombre;
     private String empApellido;
     private String empCedula;
     private String empDireccion;
     private String empTelefono;
     private Set departamentos = new HashSet(0);
     private Set empleados = new HashSet(0);
     private Set nominas = new HashSet(0);

    public Empleado() {
    }

	
    public Empleado(String empNombre, String empApellido, String empCedula, String empDireccion) {
        this.empNombre = empNombre;
        this.empApellido = empApellido;
        this.empCedula = empCedula;
        this.empDireccion = empDireccion;
    }
    public Empleado(Departamento departamento, Empleado empleado, String empNombre, String empApellido, String empCedula, String empDireccion, String empTelefono, Set departamentos, Set empleados, Set nominas) {
       this.departamento = departamento;
       this.empleado = empleado;
       this.empNombre = empNombre;
       this.empApellido = empApellido;
       this.empCedula = empCedula;
       this.empDireccion = empDireccion;
       this.empTelefono = empTelefono;
       this.departamentos = departamentos;
       this.empleados = empleados;
       this.nominas = nominas;
    }
   
    public Integer getCodEmpleado() {
        return this.codEmpleado;
    }
    
    public void setCodEmpleado(Integer codEmpleado) {
        this.codEmpleado = codEmpleado;
    }
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public String getEmpNombre() {
        return this.empNombre;
    }
    
    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }
    public String getEmpApellido() {
        return this.empApellido;
    }
    
    public void setEmpApellido(String empApellido) {
        this.empApellido = empApellido;
    }
    public String getEmpCedula() {
        return this.empCedula;
    }
    
    public void setEmpCedula(String empCedula) {
        this.empCedula = empCedula;
    }
    public String getEmpDireccion() {
        return this.empDireccion;
    }
    
    public void setEmpDireccion(String empDireccion) {
        this.empDireccion = empDireccion;
    }
    public String getEmpTelefono() {
        return this.empTelefono;
    }
    
    public void setEmpTelefono(String empTelefono) {
        this.empTelefono = empTelefono;
    }
    public Set getDepartamentos() {
        return this.departamentos;
    }
    
    public void setDepartamentos(Set departamentos) {
        this.departamentos = departamentos;
    }
    public Set getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set empleados) {
        this.empleados = empleados;
    }
    public Set getNominas() {
        return this.nominas;
    }
    
    public void setNominas(Set nominas) {
        this.nominas = nominas;
    }




}


