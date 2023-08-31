//Vamos criar um exemplo de uma classe para representar uma SmarTV onde:
//1.Ela tenha as características: ligada (boolean), cantal (int) e volume(int)
//2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
//3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
//4. Nossa tv poderá mudar de canal de 1 em 1
//ou definindo o número correspondente

public class SmarTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void MudarCanal(int novoCanal){
        canal = novoCanal;
    }
    
    public void AumentarCanal(){
        canal++;
    }

    public void DiminuirCanal(){
        canal--;
    }
    
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void AumenVolu() {
        volume++;
        System.out.println("Aumentando o volume para "+ volume);
    }

    public void BaixarVolu () {
        --volume;
        System.out.println("Baixando o volume para "+ volume);
    }
}
