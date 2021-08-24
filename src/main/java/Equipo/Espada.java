package Equipo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Espada implements Armamento{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column (name = "filo")
    int filo;

    public int calcularCalidadTotal(){
        return filo*purezaMaterial;
    }
}
