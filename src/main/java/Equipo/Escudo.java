package Equipo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Escudo implements Armamento{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column (name = "grosor")
    int grosor;


    public int calcularCalidadTotal(){

        return (grosor*5 + purezaMaterial);
    }
}
