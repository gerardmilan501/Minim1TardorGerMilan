package edu.upc.dsa.models;

public class muestra {
    String idmuestra;
    String idclinic;
    String id = ToString.this.id;
    String fechamuestra;
    String idlab;

    public String getIdmuestra() {
        return idmuestra;
    }

    public String getIdlab() {
        return idlab;
    }

    public String getFechamuestra() {
        return fechamuestra;
    }

    public String getIdclinic() {
        return idclinic;
    }

    public void setIdmuestra(String idmuestra) {
        this.idmuestra = idmuestra;
    }

    public void setIdclinic(String idclinic) {
        this.idclinic = idclinic;
    }

    public void setFechamuestra(String fechamuestra) {
        this.fechamuestra = fechamuestra;
    }

    public void setIdlab(String idlab) {
        this.idlab = idlab;
    }

    @Override
    public String toString() {
        return "muestra [id muestra="+idmuestra+", id clinic=" + idclinic + ", id=" + id +", fecha muestra=" + idmuestra + "id lab=" + idlab "]";
}
