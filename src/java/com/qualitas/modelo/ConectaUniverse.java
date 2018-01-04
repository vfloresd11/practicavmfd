package com.qualitas.modelo;

import asjava.uniclientlibs.UniConnectionException;
import asjava.uniclientlibs.UniDynArray;
import asjava.uniobjects.UniCommand;
import asjava.uniobjects.UniCommandException;
import asjava.uniobjects.UniFile;
import asjava.uniobjects.UniFileException;
import asjava.uniobjects.UniSelectList;
import asjava.uniobjects.UniSelectListException;
import asjava.uniobjects.UniSession;
import asjava.uniobjects.UniSessionException;
import com.qualitas.modelo.entities.RegistroBase;

import java.util.ArrayList;
import java.util.List;

public class ConectaUniverse {
    private String server = "110.10.0.11"; // ip server
    private String userName = "viflores"; // usuario
    private String password = "v1ctor39#"; // contraseña
    private String accountPath = "/sise"; //cuenta
    public String DBtype = "UNIVERSE"; // tipo de cuenta
    private static UniSession session; // UniVerse session

    public ConectaUniverse() {                  
        session = new UniSession();
        procesar();
    }

    public void procesar() {
        System.out.println("Entro a procesar ->");
        try {
            session.setHostName(server);
            session.setUserName(userName);
            session.setPassword(password);
            session.setAccountPath(accountPath);
            session.setDataSourceType(DBtype);
            System.out.println("Termino asignar valores ->" );
            session.connect();
            System.out.println("Conexion exitosa!");
        } catch (UniSessionException e) {
            System.out.println("Error en la conexion! ");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Se encontro el error:  " + e.getMessage());
        }
    }
    public List<RegistroBase> leer(String tablaBaseUniverse) throws UniConnectionException,            
                                                             UniSessionException,
                                                             UniCommandException,
                                                             UniSelectListException,
                                                             UniFileException {
        UniCommand universeComando;
        UniSelectList universeLista;
        UniFile universeArchivo;
        UniDynArray universeRegistro;
        RegistroBase registroUniverBase;
        String cadenaComando,llaveUniverse ;
        
        List<RegistroBase> listaRegistros = new ArrayList();
        if (!checarCon()) {
            procesar();
        }
        cadenaComando = "SELECT " + tablaBaseUniverse;
        universeComando = session.command();
        universeComando.setCommand(cadenaComando);
        universeComando.exec();
        universeLista = session.selectList(0);
        universeArchivo = session.openFile(tablaBaseUniverse);
        System.out.println("Base de Datos Universe en Tabla -> " + tablaBaseUniverse);
        while (!universeLista.isLastRecordRead()) {
            llaveUniverse = universeLista.next().toString();
            if (!llaveUniverse.equals("")) {
                System.out.println("Localice registro con llave: " + llaveUniverse);
                universeArchivo.setRecordID(llaveUniverse);
                universeRegistro = new UniDynArray(universeArchivo.read().toString());
                registroUniverBase = new RegistroBase(llaveUniverse, universeRegistro);
                listaRegistros.add(registroUniverBase);
            }
        }
        return listaRegistros;
    }
  public static boolean checarCon() {
    return session.isActive();
  }    
}
