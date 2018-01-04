package com.qualitas.modelo.entities;

import asjava.uniclientlibs.UniDynArray;

public class RegistroBase {
    private final String id;
    private final UniDynArray registro;
    
    public RegistroBase(String id,UniDynArray registro ){
        this.id=id;
        this.registro=registro;
    }
    public String getId() {
        return id;
    }

    public UniDynArray getRegistro() {
        return registro;
    }
   
    
}
