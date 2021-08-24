package Equipo;

import javax.persistence.Column;

public interface Armamento extends Equipo {
    @Column (name = "puereza")
    int purezaMaterial = 1;

    @Column(name = "nombre")
    String nombre = "";
}
