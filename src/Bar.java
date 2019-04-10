import java.util.ArrayList;

public class Bar {

    private ArrayList<Cliente> clientes;


    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void adicionarCliente(Cliente novoCliente){
        this.clientes.add(novoCliente);
    }

    public void removerCliente(Cliente clienteARemover){
        if(this.clientes.contains(clienteARemover)) {
            this.clientes.remove(clienteARemover);
        }
    }

    public Cliente getClientePorCPF(String cpfCliente){

        for (Cliente clienteAtual : this.getClientes()) {

            if(clienteAtual.getCpf().contentEquals(cpfCliente)){

                return clienteAtual;
            }

        }

        return null;

    }

    public long getNumeroClientes(){

        return this.getClientes().size();

    }

    public void getPercentualPorGenero(){

        double totalClientes = this.getClientes().size();
        double totalHomens = 0;
        double totalMulheres = 0;

        for (Cliente clienteAtual : this.getClientes()) {

            if(clienteAtual.getGenero().equals('H')){
                totalHomens++;
            }else if(clienteAtual.getGenero().equals('M')){
                totalMulheres++;
            }

        }

        double percentualHomens = totalHomens*totalClientes/100;
        double percentualMulheres = totalMulheres*totalClientes/100;

        System.out.println("Total de pessoas: " + totalClientes);
        System.out.println("Percentual de homens: " + percentualHomens + "%");
        System.out.println("Percentual de mulheres: " + percentualMulheres + "%");

    }

    public void getPercentualDeSocios(){

        double totalClientes = this.getClientes().size();
        double totalSocios = 0;
        double totalNaoSocios = 0;

        for (Cliente clienteAtual : this.getClientes()) {

            if(clienteAtual.getNumeroSocio() > 0){
                totalSocios++;
            }else{
                totalNaoSocios++;
            }

        }

        double percentualSocios = totalSocios*totalClientes/100;
        double percentualNaoSocios = totalNaoSocios*totalClientes/100;

        System.out.println("Total de pessoas: " + totalClientes);
        System.out.println("Percentual de socios: " + percentualSocios + "%");
        System.out.println("Percentual de nao socios: " + percentualNaoSocios + "%");

    }

    public void registrarSaidaCliente(String cpfCliente){

        for (Cliente clienteAtual : this.getClientes()) {

            if(clienteAtual.getCpf().contentEquals(cpfCliente)) {

                this.clientes.remove(clienteAtual);

                //teste para evitar quebra de codigo quando nao ha mais clientes
                //se o ultimo cliente e removido, o foreach se perde
                if(this.getClientes().size() <= 0){

                    return;

                }

            }

        }

    }

//    public void armazenarClientes(){
//
//
//
//    }

}
