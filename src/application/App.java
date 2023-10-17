package application;

import classes.Iphone;

public class App {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        System.out.println("Aparelho telefonico");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();
        System.out.println();

        System.out.println("Reprodutor musical");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        System.out.println();

        System.out.println("Navegador da Internet");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println();

    }
}
