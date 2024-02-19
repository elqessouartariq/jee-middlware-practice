package com.tariqelqessouar.presentation;

import com.tariqelqessouar.metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.tariqelqessouar.dao", "com.tariqelqessouar.metier");
        Imetier  metier = (Imetier) context.getBean(Imetier.class);
        System.out.println("Result : " + metier.calcul());
    }
}
