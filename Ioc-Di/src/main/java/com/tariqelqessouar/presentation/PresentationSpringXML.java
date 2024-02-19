package com.tariqelqessouar.presentation;

import com.tariqelqessouar.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Imetier metier = (Imetier) context.getBean("metier");
        System.out.println("Result : " + metier.calcul());
    }
}
