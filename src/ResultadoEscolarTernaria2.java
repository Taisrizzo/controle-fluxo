public class ResultadoEscolarTernaria2 {
    public static void main(String[] args) {
        
        //Estrutura condicional TERNÁRIA "composta"
        //Neste segundo cenário, há mais condições e ainda podem ser incluidas inumeras condições.
        
        int nota = 3;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ?"Recuperação" : "Reprovado";
		System.out.println(resultado);
    }
}
