//Vamos criar um exemplo de uma classe para representar uma SmarTV onde:
//1.Ela tenha as características: ligada (boolean), cantal (int) e volume(int)
//2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
//3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
//4. Nossa tv poderá mudar de canal de 1 em 1
//ou definindo o número correspondente

public class Usuario{
    public static void main(String[] args) {
                
        SmarTv smarTv = new SmarTv();
        
                smarTv.MudarCanal(13);
                System.out.println("Canal Atual: " + smarTv.canal);

        System.out.println("A TV ligada? " + smarTv.ligada);
        System.out.println("Canal Atual: " + smarTv.canal);
        System.out.println("Volume atual: " + smarTv.volume);

        smarTv.ligar ();
        System.out.println("New Status: A TV ligada? " + smarTv.ligada);

        smarTv.AumenVolu();
        smarTv.AumenVolu();
        System.out.println("New Status: Volume atual: " + smarTv.volume);
    }
}