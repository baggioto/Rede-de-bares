public class Cliente {

    private String nome;
    private String cpf;
    private long idade;
    private Character genero;
    private long numeroSocio;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getIdade() {
        return idade;
    }

    public void setIdade(long idade) {
        this.idade = idade;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public long getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(long numeroSocio) {
        this.numeroSocio = numeroSocio;
    }
}
