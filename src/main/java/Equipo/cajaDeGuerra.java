package Equipo;

public class cajaDeGuerra {
    public Equipo abrirCaja(){
        return equipoRandom();
    }

    private Equipo equipoRandom(){
        //este metodo devuelve una pieza de equipo al azar, puede ser otra caja
        return new Espada();
    }
}
