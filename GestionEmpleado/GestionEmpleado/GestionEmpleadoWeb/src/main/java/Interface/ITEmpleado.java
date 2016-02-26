/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import POJO.Empleado;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Julian
 */
public interface ITEmpleado 
{
    public boolean insert(Session session, Empleado emp) throws Exception;    
    public Empleado getUltioEmpleado(Session session) throws Exception;
    public Empleado getByCedEmpleado(Session session, String ced) throws Exception;
    public List<Empleado> getAll(Session session) throws Exception;
    public boolean update(Session session, Empleado emp) throws Exception;  
    public Empleado DeleteByCedEmpleado(Session session, String ced) throws Exception;
    
}
