package org.example;

import one.digialinovation.gof.Facade.Facade;
import one.digialinovation.gof.Singleton.SingletonEager;
import one.digialinovation.gof.Singleton.SingletonLazy;
import one.digialinovation.gof.Singleton.SingletonLazyHolder;
import one.digialinovation.gof.Strategy.*;

public class Test {

    // Testendo o Desing Patern Singleton:
    public static void main(String[] args){
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);


        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();


        //Facade


        Facade facade = new Facade();
        facade.migrarCliente("Paulo", "12345678");

    }
}