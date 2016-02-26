/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeanView;

import POJO.Empleado;
import java.util.List;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Julian
 */
@Named(value = "mbBEmpleado")
@ViewScoped
public class MbBEmpleado {

    Session session;
    Transaction ts;
    
    private Empleado emp;
    private List<Empleado> listaEmpleado;
    
    private String valorCedula;

    /**
     * Creates a new instance of MbBEmpleado
     */
    public MbBEmpleado() {
    }

    public void agregarListaEmpleadoPorCedula() {

    }

    public String getValorCedula() {
        return valorCedula;
    }

    public void setValorCedula(String valorCedula) {
        this.valorCedula = valorCedula;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Transaction getTs() {
        return ts;
    }

    public void setTs(Transaction ts) {
        this.ts = ts;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public List<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(List<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

}
