package Main;
public class ExcecaoPersonalizada2 extends Exception {
    public ExcecaoPersonalizada2(String mensagem) {
        super(mensagem);
    }
 
    public void gerarExcecao() throws ExcecaoPersonalizada2 {
        throw new ExcecaoPersonalizada2("Erro: Falha de Processamento em ExcecaoPersonalizada2");
    }
}
