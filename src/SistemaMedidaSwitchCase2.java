public class SistemaMedidaSwitchCase2 {
        /*String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}*/
        public static void main(String[] args) {
            String plano = "t"; // M / T

            switch (plano) {
                case "T": {
                    System.out.println("5Gb Youtube");
                }
                case "M": {
                    System.out.println("WhatsApp e Instagram grátis");
                }
                case "B": {
                    System.out.println("100 minutos de ligação");
                }
                default :
                    System.out.println("Faça a seleção correta do plano!");
            }
    }
} /*No código que está dentro do comentário lá em cima dentro do "else if" utilizamos mais linhas de código para imprimir os beneficios dos planos da operadora*/

/*Já no código abaixo usando "switch case" com os planos da operadora do MAIOR para o MENOR, usei menos linhas para simplificar o código,*/

//Observe também que,retiramos o "break" de cada condição. Assim poderá ser impresso uma ou mais informações na tela, de acordo com a opção que o usuário escolher, 
