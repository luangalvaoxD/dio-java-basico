package edu.Luan.primeirasemana.SmartTV;

public class SmartTV {
    // Atributos
    boolean ligada;
    int canal;
    int volume;

    // Construtor
    public SmartTV() {
        this.ligada = false;
        this.canal = 1;
        this.volume = 10;
    }

    // Métodos para ligar e desligar a TV
    public void ligar() {
        this.ligada = true;
        System.out.println("A TV está ligada.");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("A TV está desligada.");
    }

    // Métodos para aumentar e diminuir o volume
    public void aumentarVolume() {
        if (this.ligada) {
            this.volume++;
            System.out.println("Volume aumentado para: " + this.volume);
        } else {
            System.out.println("A TV está desligada. Não é possível ajustar o volume.");
        }
    }

    public void diminuirVolume() {
        if (this.ligada) {
            this.volume--;
            System.out.println("Volume diminuído para: " + this.volume);
        } else {
            System.out.println("A TV está desligada. Não é possível ajustar o volume.");
        }
    }

    // Métodos para mudar de canal
    public void aumentarCanal() {
        if (this.ligada) {
            this.canal++;
            System.out.println("Canal mudado para: " + this.canal);
        } else {
            System.out.println("A TV está desligada. Não é possível mudar o canal.");
        }
    }

    public void diminuirCanal() {
        if (this.ligada) {
            this.canal--;
            System.out.println("Canal mudado para: " + this.canal);
        } else {
            System.out.println("A TV está desligada. Não é possível mudar o canal.");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (this.ligada) {
            this.canal = novoCanal;
            System.out.println("Canal mudado para: " + this.canal);
        } else {
            System.out.println("A TV está desligada. Não é possível mudar o canal.");
        }
    }
}
