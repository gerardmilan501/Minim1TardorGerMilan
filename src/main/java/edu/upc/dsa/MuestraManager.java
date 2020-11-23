package edu.upc.dsa;

import java.util.List;

public interface MuestraManager {


    public muestra addMuestra(String idmuestra, String idclinic, String id, String fecha, String idlab);
    public muestra addMuestra(muestra idmuestra);
    public muestra getTrack(String idmuestra);
    public List<muestra> findAll();
    public void deleteMuestra(String idmuestra);
    public muestra updateMuestra(muestra idmuestra);

    public int size();
}
