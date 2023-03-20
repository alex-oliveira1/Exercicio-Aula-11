public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", EstadoCivil.SOLTEIRO);
        Pessoa pessoa2 = new Pessoa("Maria", EstadoCivil.CASADO);
        Pessoa pessoa3 = new Pessoa("Pedro", EstadoCivil.VIUVO);
        
        pessoa1.exibirDados();
        pessoa2.exibirDados();
        pessoa3.exibirDados();
        
        pessoa1.setEstadoCivil(EstadoCivil.CASADO);
        pessoa2.setEstadoCivil(EstadoCivil.DIVORCIADO);
        pessoa3.setEstadoCivil(EstadoCivil.CASADO);
        
        pessoa1.exibirDados();
        pessoa2.exibirDados();
        pessoa3.exibirDados();
    }
}