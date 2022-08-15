package org.generation.app.service;

import java.util.List;

import org.generation.app.entity.Customer;

public interface ICustomerService {
	/**
	 * Enlista todas los clientes de la base de datos
	 * @param Customer
	 * @return Listado de clientes
	 */
	public List<Customer> findAllCustomers();
	/**
	 * Nos guarda el cliente en la base de datos
	 * @param customer Datos del cliente
	 * @return devuelve el cliente con el Id asignado
	 */
	public Customer saveCustomer(Customer customer);
	/**
	 * Elimina cliente de la base de datos
	 * @param Id el identificador del cliente a eliminar
	 */
//	public void deleteCustomerById(Long id);
	/**
	 * Encontrar un cliente en labase de datos
	 * @param Id identificador  del cliente a buscar
	 * @return
	 */
	public Customer findCustomerById(Long id);
	
	public Customer deleteCustomerById(Long id);
}
