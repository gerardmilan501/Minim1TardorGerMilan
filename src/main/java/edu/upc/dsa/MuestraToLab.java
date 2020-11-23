package edu.upc.dsa;

import org.apache.log4j.Logger;

import java.util.LinkedList;
import java.util.List;

public class MuestraToLab implements MuestraManager{

    private static MuestraManager instance;
    protected List<muestra> muestras;
    final static Logger logger = Logger.getLogger(MuestraToLab.class);

    private MuestraToLab() {
        this.muestra = new LinkedList<>();
    }

    public static MuestraManager getInstance() {
        if (instance==null) instance = new MuestraToLab();
        return instance;
    }


    public muestra addMuestra(muestra muestra) {
        logger.info("new muestra " + muestra);

        this.muestra.add (muestra);
        logger.info("new muestra added");
        return muestra;
    }

    public muestra addmuestra(String idmuestra, String idclinic, String id, String fecha, String idlab) {
        return this.addmuestra(new muestra(idmuestra, idclinic, id, fecha, idlab));
    }

    public muestra getmuestra(String idmuestra) {
        logger.info("getmuestra(" + idmuestra + ")");

        for (muestra muestra : this.muestras) {
            if (muestra.getIdmuestra().equals(idmuestra)) {
                logger.info("getmuestra(" + idmuestra + "): " + muestra);

                return muestra;
            }
        }

        logger.warn("not found " + idmuestra);
        return null;
    }

    @Override
    public muestra updatemuestra(muestra m) {
        muestra muestra = this.getmuestra(m.getIdmuestra());

        if (m.getSalud()!="A") {
            logger.info("POSITIVO");


            logger.info(m +" updated ");
        }
        else {
            logger.warn("Negativo "+m.this.nombre);
        }

        return m;
    }


}
