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


}
