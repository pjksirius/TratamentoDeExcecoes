package Main;
public class TesteExcecoes {
    public static void main(String[] args) {
        ExcecaoPersonalizada1 excecao1 = new ExcecaoPersonalizada1("Teste 1");
        ExcecaoPersonalizada2 excecao2 = new ExcecaoPersonalizada2("Teste 2");
 
        try {
            excecao1.gerarExcecao();
        } catch (ExcecaoPersonalizada1 e) {
            System.out.println("Capturada: " + e.getMessage());
        }
 
        try {
            excecao2.gerarExcecao();
        } catch (ExcecaoPersonalizada2 e) {
            System.out.println("Capturada: " + e.getMessage());
        }
    }
}