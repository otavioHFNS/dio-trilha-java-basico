public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        //Estrutura condicional encadeada
        //Se tive apenas o "IF" e "ELSE" seria condicional composta
        //Abaixo exemplo condição ternária
        //int nota = 6;
		//String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		//System.out.println(resultado);

	if (nota >= 7)
		System.out.println("Parabéns, Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Realizar prova de Recuperação");
	else
		System.out.println("Reprovado");
    }
}
