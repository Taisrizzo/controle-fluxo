public class CaixaEletronico {
    public static void main(String[] args) {
        
        //Estrutura condicional SIMPLES "if"
        
        double saldo = 25.0;
        double valorSolicitado = 30.0;
 
        if(valorSolicitado < saldo) {
         saldo = saldo - valorSolicitado;
        }
         System.out.println(saldo);
    }
}
