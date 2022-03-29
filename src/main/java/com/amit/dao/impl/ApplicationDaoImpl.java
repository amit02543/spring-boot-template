package com.amit.dao.impl;

import com.amit.dao.ApplicationDao;
import org.springframework.stereotype.Repository;

@Repository
public class ApplicationDaoImpl implements ApplicationDao {


    @Override
    public String testEndpoint() {
        return "Yay!!! its working.";
    }


}
