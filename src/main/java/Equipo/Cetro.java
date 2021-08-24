package Equipo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Cetro implements Armamento{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column (name = "largo")
    int largo;

    public int calcularCalidadTotal(){

        return (largo*2 + purezaMaterial*3);
    }
}
