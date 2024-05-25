public class BreakEContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break; /*se no lugar de "break" for "continue", então o código irá pular o numero do "if", e continuar até o numero final da condição.*/
            
            System.out.println(numero);
            
        }
    }
}
