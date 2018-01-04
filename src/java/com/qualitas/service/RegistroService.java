
package com.qualitas.service;

import asjava.uniclientlibs.UniConnectionException;
import asjava.uniobjects.UniCommandException;
import asjava.uniobjects.UniFileException;
import asjava.uniobjects.UniSelectListException;
import asjava.uniobjects.UniSessionException;

import com.qualitas.modelo.ConectaUniverse;
import com.qualitas.modelo.entities.RegistroBase;
import com.qualitas.modelo.entities.TipoEndoso;

import java.util.ArrayList;
import java.util.List;

public class RegistroService {
    public List<TipoEndoso> informacionEndoso() throws UniSessionException,
                                                       UniConnectionException,
                                                       UniCommandException,
                                                       UniSelectListException,
                                                       UniFileException{
        ConectaUniverse con;
        List<RegistroBase> registro;
        List<TipoEndoso> list;
        TipoEndoso tipoEndo;
        
        list=new ArrayList();
        con=new ConectaUniverse();
        registro= con.leer("TENDOSO");
        
        for (RegistroBase reg:registro){
            tipoEndo=new TipoEndoso(reg.getId(),
                                    reg.getRegistro().extract(1).toString(),
                                    reg.getRegistro().extract(2).toString());
            list.add(tipoEndo);
        }
        return list;        
    }        
}
