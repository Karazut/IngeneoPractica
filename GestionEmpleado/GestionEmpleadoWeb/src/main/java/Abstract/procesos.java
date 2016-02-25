/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

import java.util.List;

/**
 *
 * @author Prueba
 */
public interface procesos {
    public void registrar();
    public void buscar(String cod);
    public void modificar(String cod);
    public void eliminar(String cod);
    public List listar();
}
