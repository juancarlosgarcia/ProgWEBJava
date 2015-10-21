/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author PC-1
 */
@ManagedBean
@SessionScoped
public class ClienteControlador {
    private  List<Cliente> clientes;
    private Cliente cliente;
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }
        
    public void grabar() {
        clientes.add(cliente);
    }
    
    public void cancelar() {
        cliente = new Cliente();
    }
    
    public ClienteControlador() {
        cliente = new Cliente();
        clientes = new ArrayList();
    }


}
