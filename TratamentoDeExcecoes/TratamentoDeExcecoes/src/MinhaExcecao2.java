public class MinhaExcecao2 extends Exception{
        public MinhaExcecao2(String mensagem) {
            super(mensagem); 
        }
     
        public void gerarExcecao() throws MinhaExcecao2 {
            throw new MinhaExcecao2("Erro: Falha de Processamento em MinhaExcecao2");
        }
}
