/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Prueba
 */
public class EmpHelper {

    private Session session = null;

    public EmpHelper() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public List getEmpleado() {
        List<Empleado> empList = null;
        try {
            Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Empleado");
            empList = (List<Empleado>) q.list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return empList;
    }

}
