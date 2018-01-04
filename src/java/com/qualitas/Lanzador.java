
package com.qualitas;

import asjava.uniclientlibs.UniConnectionException;
import asjava.uniobjects.UniCommandException;
import asjava.uniobjects.UniFileException;
import asjava.uniobjects.UniSelectListException;
import asjava.uniobjects.UniSessionException;
import com.qualitas.modelo.ConectaUniverse;
import com.qualitas.modelo.entities.RegistroBase;
import java.util.List;


public class Lanzador {
    
    public static void main(String... args) throws UniSessionException, UniConnectionException, UniCommandException, UniSelectListException, UniFileException{
        ConectaUniverse conectaUniverse = new ConectaUniverse() {};
        List<RegistroBase> lista= conectaUniverse.leer("TENDOSO");
        System.err.println("Encontre: "+lista.size()+ " records.");
    }
    
}
