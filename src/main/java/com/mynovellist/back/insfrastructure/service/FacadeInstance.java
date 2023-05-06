package com.mynovellist.back.insfrastructure.service;

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
