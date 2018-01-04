package com.qualitas.mbeans;

import asjava.uniclientlibs.UniConnectionException;
import asjava.uniobjects.UniCommandException;
import asjava.uniobjects.UniFileException;
import asjava.uniobjects.UniSelectListException;
import asjava.uniobjects.UniSessionException;
import com.qualitas.modelo.entities.TipoEndoso;
import com.qualitas.service.RegistroService;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ManagedBeanUniverse {

    private List<TipoEndoso> tipodeEndo;
    private String msgError;

    public ManagedBeanUniverse() {

        RegistroService obtenerTipoEndo = new RegistroService();

        try {
            tipodeEndo = obtenerTipoEndo.informacionEndoso();
        } catch (UniSessionException | UniConnectionException | UniCommandException | UniSelectListException | UniFileException e) {
            msgError = e.getMessage();
        } catch (Exception e) {
            msgError = e.getMessage();
        }
    }

    public List<TipoEndoso> getTipodeEndo() {
        return tipodeEndo;
    }

    public String getMsgError() {
        return msgError;
    }

}
