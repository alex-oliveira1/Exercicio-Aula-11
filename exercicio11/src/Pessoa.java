public class Pessoa {
    private String nome;
    private EstadoCivil estadoCivil;
    
    public Pessoa(String nome, EstadoCivil estadoCivil) {
        this.nome = nome;
        this.estadoCivil = estadoCivil;
    }
    
    public String getNome() {
        return nome;
    }
    
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }
    
    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Estado civil: " + estadoCivil);
    }
}