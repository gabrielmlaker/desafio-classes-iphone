package classes;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        System.out.println("Exibindo página web");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Adicionando uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atualizando a página");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Tocando a música");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("Selecionando a música");
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Ligando o telefone");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo o telefone");
    }

    @Override
    public void iniciarCorrerioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Iniciando o correio de voz");
    }

}
