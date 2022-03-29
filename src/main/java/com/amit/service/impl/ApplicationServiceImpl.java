package com.amit.service.impl;

import com.amit.dao.ApplicationDao;
import com.amit.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {


    @Autowired
    private ApplicationDao dao;


    @Override
    public String testEndpoint() {
        return dao.testEndpoint();
    }


}
