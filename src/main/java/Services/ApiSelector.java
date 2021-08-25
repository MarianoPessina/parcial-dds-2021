package Services;

public class ApiSelector {
    public ApiSelector apiElegida = new ClimaService();

    public String obtenerClima(){
        return apiElegida.obtenerClima();
    }

}