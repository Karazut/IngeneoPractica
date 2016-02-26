/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interface.ITEmpleado;
import POJO.Empleado;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Julian
 */
public class DAOEmpleado implements ITEmpleado {

    @Override
    public boolean insert(Session session, Empleado emp) throws Exception {
        session.save(emp);
        
        return true;
    }

    @Override
    public Empleado getUltioEmpleado(Session session) throws Exception {
        String hql = "from Empleado order by codEmpleado desc";
        Query query=session.createQuery(hql).setMaxResults(1);
        
        return (Empleado) query.uniqueResult();
    }

    @Override
    public Empleado getByCedEmpleado(Session session, String ced) throws Exception {
        String hql = "from Empleado where empCedula=:Cedula";
        Query query = session.createQuery(hql);
        query.setParameter("Cedula", ced);
        return (Empleado) query.uniqueResult();
    }

    @Override
    public List<Empleado> getAll(Session session) throws Exception {
        return session.createCriteria(Empleado.class).list();
    }

    @Override
    public boolean update(Session session, Empleado emp) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado DeleteByCedEmpleado(Session session, String ced) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
