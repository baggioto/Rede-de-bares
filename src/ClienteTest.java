import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setUp() throws Exception {
        cliente = new Cliente();
    }

    @Test
    public void testGetNome() {

        String nomeCliente = this.cliente.getNome();


    }

    @Test
    public void testSetNome() {

        this.cliente.setNome("Josias");

    }

    @Test
    public void testGetCpf() {

        String cpfCliente = this.cliente.getCpf();

    }

    @Test
    public void testSetCpf() {

        this.cliente.setCpf("498.534.664-53");

    }

    @Test
    public void testGetIdade() {

        long idadeCliente = this.cliente.getIdade();

    }

    @Test
    public void testSetIdade() {

        this.cliente.setIdade(18);

    }

    @Test
    public void testGetGenero() {

        Character generoCliente = this.cliente.getGenero();

    }

    @Test
    public void testSetGenero() {

        this.cliente.setGenero('M');

    }

    @Test
    public void testGetNumeroSocio() {

        long numeroSocioCliente = this.cliente.getNumeroSocio();

    }

    @Test
    public void testSetNumeroSocio() {

        this.cliente.setNumeroSocio(1);

    }

}
