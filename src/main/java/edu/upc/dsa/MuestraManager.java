package edu.upc.dsa;

import java.util.List;

public interface MuestraManager {


    public muestra addmuestra(String idmuestra, String idclinic, String id, String fecha, String idlab);
    public muestra addmuestra(muestra idmuestra);
    public muestra getTrack(String idmuestra);
    public List<muestra> findAll();
    public void deletemuestra(String idmuestra);
    public muestra updatemuestra(muestra idmuestra);

    public int size();
}
