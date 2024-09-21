package Cliente;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();

        // Crear un cliente
        Cliente nuevoCliente = new Cliente(0, "Juan", "Pérez", "555-1234", "juan.perez@example.com", "Calle Falsa 123", "1990-01-01", "juanp", "password123", "123456789");
        clienteDAO.crearCliente(nuevoCliente);

        // Leer y mostrar todos los clientes
        List<Cliente> clientes = clienteDAO.obtenerClientes();
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        // Actualizar un cliente
        Cliente clienteActualizado = new Cliente(1, "Juan", "Pérez", "555-5678", "juan.perez@nuevo.com", "Calle Nueva 456", "1990-01-01", "juanperez", "newpassword", "123456789");
        clienteDAO.crearCliente(clienteActualizado);

        // Eliminar un cliente
        clienteDAO.eliminarCliente(1);
    }
}
