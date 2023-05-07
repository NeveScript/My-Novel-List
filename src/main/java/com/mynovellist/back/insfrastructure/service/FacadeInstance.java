package com.mynovellist.back.insfrastructure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacadeInstance {

    //================================{ ATTRIBUTES }================================//
    private static IFacade facadeInstance;
    private static final Object MONITOR = new Object();

    //================================{ CONSTRUCTOR }================================//
    public FacadeInstance(){

        super();

    }

    //================================{ METHODS }================================//
    public static IFacade getInstance(){

        synchronized (MONITOR){

            if(facadeInstance == null){
                facadeInstance = new Facade();
            }
        }

        return facadeInstance;
    }
}
