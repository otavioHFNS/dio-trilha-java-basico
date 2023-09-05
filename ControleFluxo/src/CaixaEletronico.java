public class CaixaEletronico {
    public static void main(String[] args) {
    
       double saldo = 25.0;
       double valorSolicitado = 17.0;
       
     //Se tirarmos o "ELSE" teremos uma condicional simples. Abaixo exemplo condição ternária
    //int nota = 7;
	//String resultado = nota >=7 ? "Aprovado" : "Reprovado";
	//System.out.println(resultado)

       if (valorSolicitado < saldo) 
        {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo Saldo R$ " + saldo);       
        }
            else
                System.out.println("Saldo insuficiente");
    }
    
}
