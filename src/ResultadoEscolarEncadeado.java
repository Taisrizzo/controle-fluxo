public class ResultadoEscolarEncadeado {
    public static void main(String[] args) {
        
        //Estrutura condicional ENCADEADA "else if"
        
        double nota = 4.8;

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
    }
}
