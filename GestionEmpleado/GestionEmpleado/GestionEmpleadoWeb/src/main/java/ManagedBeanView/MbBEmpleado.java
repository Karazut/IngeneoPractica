/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeanView;

import DAO.DAOEmpleado;
import HibernateUtil.HibernateUtil;
import POJO.Empleado;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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
    Transaction transaction;

    private Empleado emp;
    private List<Empleado> listaEmpleado;

    private String valorCedula;

    /**
     * Creates a new instance of MbBEmpleado
     */
    public MbBEmpleado() {
        FacesMessage fs = new FacesMessage(FacesMessage.FACES_MESSAGES, "hola lista", e.getMessage());
        FacesContext.getCurrentInstance().addMessage(null, fs);

    }

    public void agregarListaEmpleadoPorCedula() {
        this.session = null;
        this.transaction = null;
        try {
            if (this.valorCedula.equals("")) {
                return;
            }
            this.session = HibernateUtil.getSessionFactory().openSession();
            DAOEmpleado daoEmpleado = new DAOEmpleado();
            this.transaction = this.session.beginTransaction();
            this.emp = daoEmpleado.getByCedEmpleado(this.session, valorCedula);
            if (this.emp != null) {
                String nom = emp.getEmpNombre();
                String ape = emp.getEmpApellido();
                String ced = emp.getEmpCedula();
                String dir = emp.getEmpDireccion();
                this.listaEmpleado.add(new Empleado(nom, ape, ced, dir));
            }
            this.transaction.commit();
        } catch (Exception e) {
            if (this.transaction == null) {
                transaction.rollback();
            }
            FacesMessage fs = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, fs);

        } finally {
            if (this.session != null) {
                this.session.close();
            }
        }
    }

    public List<Empleado> getAllEmpleado() {
        
        this.session = null;
        this.transaction = null;
        try {
            
            this.session = HibernateUtil.getSessionFactory().openSession();
            DAOEmpleado daoEmpleado = new DAOEmpleado();
            this.transaction = this.session.beginTransaction();
            this.listaEmpleado = daoEmpleado.getAll(this.session);
            this.transaction.commit();
            return this.listaEmpleado;
        } catch (Exception e) {
            if (this.transaction == null) {
                transaction.rollback();
            }
            FacesMessage fs = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error", e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, fs);

            return null;
        } finally {
            if (this.session != null) {
                this.session.close();
            }
        }
    }

    public String getValorCedula() {
        return valorCedula;
    }

    public void setValorCedula(String valorCedula) {
        this.valorCedula = valorCedula;
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

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

}
