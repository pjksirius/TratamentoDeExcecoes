package Main;
public class ExcecaoPersonalizada1 extends Exception {
    public ExcecaoPersonalizada1(String mensagem) {
        super(mensagem);
    }
 
    public void gerarExcecao() throws ExcecaoPersonalizada1 {
        throw new ExcecaoPersonalizada1("Erro: Operação Inválida na Classe ExcecaoPersonalizada1");
    }
}