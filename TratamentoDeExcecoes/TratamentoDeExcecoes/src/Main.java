public class Main {
        public static void main(String[] args) {
            MinhaExcecao1 excecao1 = new MinhaExcecao1("Mensagem para exceção 1");
            MinhaExcecao2 excecao2 = new MinhaExcecao2("Mensagem para exceção 2");
     
            try {
                excecao1.gerarExcecao();
            } catch (MinhaExcecao1 e) {
                System.out.println("Capturado: " + e.getMessage());
            }
     
            try {
                excecao2.gerarExcecao();
            } catch (MinhaExcecao2 e) {
                System.out.println("Capturado: " + e.getMessage());
            }
        }
}
