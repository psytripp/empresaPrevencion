package cl.awakelab.empresaprevencion.modelos;

public class Capacitacion extends Eventos{

    private int idCapacitacion;
    private String duracion;
    private Integer cantidadParticipantes;


    public Capacitacion() {
    }

    public Capacitacion(int idEvento, Integer rutCliente, String dia, String hora, String lugar, int idCapacitacion, String duracion, int cantidadParticipantes) {
        super(idEvento, rutCliente, dia, hora, lugar);
        this.idCapacitacion = idCapacitacion;
        this.duracion = duracion;
        this.cantidadParticipantes = cantidadParticipantes;
    }

    public int getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(int idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCantidadParticipantes() {
        return cantidadParticipantes;
    }

    public void setCantidadParticipantes(Integer cantidadParticipantes) {
        this.cantidadParticipantes = cantidadParticipantes;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "idCapacitacion=" + idCapacitacion +
                ", duracion='" + duracion + '\'' +
                ", cantidadAsistentes=" + cantidadParticipantes +
                ", rutCliente=" + getRutCliente() +
                ", dia='" + getDia() + '\'' +
                ", hora='" + getHora() + '\'' +
                ", lugar='" + getLugar() + '\'' +
                "} " + super.toString();
    }

    public String mostrarDetalle(){
        return "la capacitacion sera en " + getLugar()+ "a las " + getHora() + " del dia " + getDia() + "y durara " + getDuracion();
    }


}
