package edu.Luan.primeirasemana.SmartTV;

public class Main {
    public static void main(String[] args) {
        // Criar uma instância da classe SmartTV
        SmartTV minhaTV = new SmartTV();

        // Testar os métodos da instância SmartTV
        minhaTV.ligar();
        minhaTV.aumentarVolume();
        minhaTV.aumentarVolume();
        minhaTV.aumentarVolume();
        minhaTV.aumentarVolume();
        minhaTV.aumentarVolume();
        minhaTV.diminuirVolume();
        minhaTV.aumentarCanal();
        minhaTV.diminuirCanal();
        minhaTV.mudarCanal(2);
        minhaTV.desligar();
        
        // Tentar usar os métodos com a TV desligada
        minhaTV.aumentarVolume();
        minhaTV.mudarCanal(10);
        minhaTV.diminuirCanal();
        minhaTV.diminuirVolume();
    }
}