
package controller;

import Modelo.Cliente;
import dao.ClienteDAO;
import java.util.List;


public class ClienteControl {
    public void adicionar(String nome, String idade){
        Cliente c = new Cliente();
        c.setNome(nome);
        c.setIdade(Integer.parseInt(idade));
        ClienteDAO d = new ClienteDAO();
        d.adicionar(c);
    }
    
    public void alterar(String nome, String idade,String id){
        Cliente c = new Cliente();
        c.setNome(nome);
        c.setIdade(Integer.parseInt(idade));
        c.setId(Integer.parseInt(id));
        ClienteDAO d = new ClienteDAO();
        d.alterar(c);
    }
    
    public void exclui(String nome, String idade,String id){
        Cliente c = new Cliente();
        c.setNome(nome);
        c.setIdade(Integer.parseInt(idade));
        c.setId(Integer.parseInt(id));
        ClienteDAO d = new ClienteDAO();
        d.alterar(c);
    }
    
    /* public void deletar */
    public List<Cliente> listar(String query){
        ClienteDAO d = new ClienteDAO();
        List<Cliente> clientes = d.listar(query);
        return clientes;
    }
    
    
    
}
