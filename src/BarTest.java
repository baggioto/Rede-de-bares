import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BarTest {

    private Bar bar;

    @BeforeEach
    public void setUp() throws Exception {
        bar = new Bar();
        ArrayList<Cliente> novosClientes = new ArrayList<>();
        bar.setClientes(novosClientes);
    }

    @Test
    public void testGetClientes() {

        ArrayList<Cliente> clientesTeste = bar.getClientes();

    }

    @Test
    public void testSetClientes() {

        ArrayList<Cliente> clientesTeste = bar.getClientes();
        this.bar.setClientes(clientesTeste);

    }

    @Test
    public void testAdicionarCliente() {

        Cliente novoCliente = new Cliente();
        this.bar.adicionarCliente(novoCliente);

    }

    @Test
    public void testRemoverCliente() {

        Cliente clienteARemover = new Cliente();
        this.bar.adicionarCliente(clienteARemover);
        this.bar.removerCliente(clienteARemover);

    }

    @Test
    public void testGetClientePorCPF() {

        Cliente novoCliente = new Cliente();
        novoCliente.setCpf("345.645.345-64");
        this.bar.adicionarCliente(novoCliente);

        Cliente clienteTeste = this.bar.getClientePorCPF("345.645.345-64");
        Cliente clienteTeste2 = this.bar.getClientePorCPF("378.456.348-74");

    }

    @Test
    public void testGetNumeroClientes() {

        long numeroClientes = this.bar.getNumeroClientes();

    }

    @Test
    public void testGetPercentualPorGenero() {

        Cliente novoClienteHomem = new Cliente();
        novoClienteHomem.setGenero('H');

        Cliente novoClienteMulher = new Cliente();
        novoClienteMulher.setGenero('M');

        this.bar.adicionarCliente(novoClienteHomem);
        this.bar.adicionarCliente(novoClienteMulher);

        this.bar.getPercentualPorGenero();

    }

    @Test
    public void testGetPercentualDeSocios() {

        Cliente novoClienteSocio = new Cliente();
        novoClienteSocio.setNumeroSocio(5);

        Cliente novoClienteNaoSocio = new Cliente();

        this.bar.adicionarCliente(novoClienteSocio);
        this.bar.adicionarCliente(novoClienteNaoSocio);

        this.bar.getPercentualDeSocios();

    }

    @Test
    public void testRegistrarSaidaCliente() {

        Cliente novoCliente = new Cliente();
        novoCliente.setCpf("345.645.345-64");
        this.bar.adicionarCliente(novoCliente);

        this.bar.registrarSaidaCliente("345.645.345-64");

    }

}
