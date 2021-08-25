import javax.persistence.*;

import Equipo.Equipo;

import Estado.Estado;
import Estado.Berserker;
import Estado.Muerto;
import Estado.Triste;
import Estado.Normal;


import Services.ClimaService;

import java.
import java.util.List;

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

    private Estado estado;

    @OneToMany
    List<Equipo> equipo;

    void setEstado(Estado estadoNuevo){
        estado = estadoNuevo;
    }

    void actualizarEstado(){
        //Aca tendría algo como un scheduler para pegarle a la api cada X tiempo
        if (ClimaService.obtenerClima()=="rain"){
            setEstado(new Triste());
        }else{
         setEstado(new Normal());
        }
    }

    void recibirDanio(int danio){
        vida = vida - danio;
        if (vida <= 0){
            setEstado(new Muerto());
        }
        else{
            if (vida < vida*0.2){
                setEstado(new Berserker());
            }
        }
    }

    void atacar(Guerrero guerreroEnemigo){
        int danio = (int) (estado.calcularMultiplicadorDanio() * (this.getCalidadTotal()));
        guerreroEnemigo.recibirDanio(danio);
    }

    int getCalidadTotal(){
        return (equipo.stream().map(equipo -> equipo.calcularCalidadTotal())).sum();
    }
}
