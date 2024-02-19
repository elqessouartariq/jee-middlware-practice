package com.tariqelqessouar.extension;

import com.tariqelqessouar.dao.IDao;

import java.util.Date;

public class DaoImplVWS implements IDao {
    @Override
    public Date getDate() {
        System.out.println("Version VWS");
        return new Date();
    }
}