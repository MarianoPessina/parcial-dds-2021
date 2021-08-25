package Services;

public class ClimaService extends  ApiSelector{
    @Override
    public static String obtenerClima(){
        return AccuWeatherAPI.doHttpGet();
    }
}
