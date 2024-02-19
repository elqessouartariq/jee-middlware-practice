package com.tariqelqessouar.presentation;

import com.tariqelqessouar.dao.IDao;
import com.tariqelqessouar.metier.Imetier;


import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class Presentation2 {
    public static void main(String[] args) throws Exception  {

        Scanner scanner=new Scanner(new File("applicationConfig.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.getConstructor().newInstance();

        System.out.println(dao.getDate());

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);

        Imetier metier=(Imetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        System.out.println(metier.calcul());
    }
}
