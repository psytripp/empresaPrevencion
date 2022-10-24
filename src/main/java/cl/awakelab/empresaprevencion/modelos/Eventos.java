package cl.awakelab.empresaprevencion.modelos;

import java.util.Scanner;

public class Eventos {
    Scanner sc = new Scanner(System.in);

    private int idEvento;
    private Integer rutCliente;
    private String dia;
    private String hora;
    private String lugar;

    public Eventos() {

    }

    public Eventos(int idEvento, Integer rutCliente, String dia, String hora, String lugar) {
        this.idEvento = idEvento;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Integer rutCliente) {
        do {
            System.out.println("Ingrese Rut del Cliente");
            rutCliente = sc.nextInt();
            this.rutCliente = rutCliente;
        }while (rutCliente == null); // para poder usar == debe ser integer
        System.out.println("Ingreso exitoso");
        sc.nextLine();
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        System.out.println("Ingrese el día (dia semana)");
        dia = sc.nextLine();
        this.dia = dia;
        if(dia.equalsIgnoreCase("Lunes") || dia.equalsIgnoreCase("Martes") || dia.equalsIgnoreCase("Miércoles") || dia.equalsIgnoreCase("Jueves") || dia.equalsIgnoreCase("Viernes"));
        System.out.println("Registrado con éxito");
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        do{
            System.out.println("Ingrese la hora HH:MM");
            hora = sc.nextLine();
            this.hora = hora;
        }while(!hora.matches("^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$"));
        System.out.println("Registrado con éxito");
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        do{
            System.out.println("Ingrese el lugar");
            lugar = sc.nextLine();
            this.lugar = lugar;
        }while(lugar.isBlank() || lugar.length() < 10 || lugar.length() > 50);
        System.out.println("Registrado con exito");
    }

    public int getIdEvento() {
        return idEvento;
    }

    @Override
    public String toString() {
        return "Eventos{" +
                "idEvento=" + idEvento +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                '}';
    }
}
