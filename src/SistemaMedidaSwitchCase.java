public class SistemaMedidaSwitchCase {
    public static void main(String[] args) {
        
        //Estrutura condicional SWITCH CASE
        /*Neste cenário ela pode não mostrar muitos beneficios, mas em outros cenário pode ser bem útil. Observe o cenário "SistemaMedidaSwitchCase2.java"*/ 
        
        String sigla = "M";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
    }
}
