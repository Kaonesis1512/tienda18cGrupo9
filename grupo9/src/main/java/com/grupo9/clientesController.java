package com.grupo9;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo9.DAO.ClientesDAO;
import com.grupo9.DTO.ClientesDTO;


@RestController
public class clientesController {
		
		@RequestMapping("/registrarClientes")
		public void resgistrar (ClientesDTO clientes) {
			ClientesDAO Dao=new ClientesDAO();
			Dao.registrarCliente(clientes);
		}
		@RequestMapping("/consultarClientes")
		public ArrayList <ClientesDTO> consultar(int documento){
			ClientesDAO Dao=new ClientesDAO();
			return Dao.consultarClientes(documento);
		}
		@RequestMapping("/listaDeClientes")
		public ArrayList <ClientesDTO> listar(){
			ClientesDAO Dao=new ClientesDAO();
			return Dao.listaDeClientes();
		}
		@RequestMapping("/eliminarCliente")
		public void eliminar(int documento) {
			ClientesDAO Dao=new ClientesDAO();
			Dao.eliminarCliente(documento);
		}

}
