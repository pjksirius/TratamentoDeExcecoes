public class MinhaExcecao1 extends Exception{
        public MinhaExcecao1(String mensagem) {
            super(mensagem); 
        }
     
        public void gerarExcecao() throws MinhaExcecao1 {
            throw new MinhaExcecao1("Erro: Operação Inválida na Classe MinhaExcecao1");
        }

}
