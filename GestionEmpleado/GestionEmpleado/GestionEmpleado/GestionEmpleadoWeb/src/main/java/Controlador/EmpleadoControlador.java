/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empleado;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

/**
 *
 * @author Prueba
 */
@ManagedBean
@Named(value = "empControlador")
@SessionScoped 
public class EmpleadoControlador {

    int startId;
    int endId;
    DataModel EmpNombre;
    EmpHelper helper;
    private int recordCount = 1000;
    private int pageSize = 10;

    private Empleado current;
    private int selectedItemIndex;
    /**
     * Creates a new instance of EmpleadoControlador
     */
       public EmpleadoControlador(){
           
       }
//    public EmpleadoControlador() {
//        helper = new EmpHelper();
//        startId = 1;
//        endId = 10;
//    }
//
//    public EmpleadoControlador(int startId, int endId) {
//        helper = new EmpHelper();
//        this.startId = startId;
//        this.endId = endId;
//    }
//
//    public Empleado getSelected() {
//        if (current == null) {
//            current = new Empleado();
//            selectedItemIndex = -1;
//        }
//        return current;
//    }


    public DataModel getEmpleado() {
        if (EmpNombre == null) {
            EmpNombre = new ListDataModel(helper.getEmpleado());
        }
        return EmpNombre;
    }

    void recreateModel() {
        EmpNombre = null;
    }
}
