import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import Estado.Estado;

@Entity
public class Guerrero {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "vida")
    int vida = 100;

    @Column(name = "nivel")
    private int nivel;

    Estado estado;

    void actualizarEstado(){
    }

    void recibirDanio(int danio){
        vida = vida - danio;
        if (vida < vida*0.2){
            estado = Berserker;
        }
    }
}
