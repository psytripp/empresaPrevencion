package cl.awakelab.empresaprevencion.modelos;

import java.util.Scanner;

public class Usuario implements Iasesoria {
    

    private int idUsuario;
    private String nombre;
    private String nacimiento;
    private Integer run;

    Scanner input = new Scanner(System.in);

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String nacimiento, Integer run) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        do{
            System.out.println("Ingrese nombre ");
            nombre = input.nextLine();
            this.nombre = nombre;
        }while(nombre.isBlank() || nombre.length() < 10 || nombre.length() >50);
        System.out.println("Registrado exitosamente");
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        do{System.out.println("Ingrese fecha de nacimiento DD/MM/AAAA");
            nacimiento = input.nextLine();
            this.nacimiento = nacimiento;
        }while(nacimiento.isBlank() || nacimiento.isEmpty() || !nacimiento.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2)])/([0-9][0-9])?[0-9][0-9]$"));
        System.out.println("Registrado exitosamente");

    }

    public Integer getRun() {
        return run;
    }

    public void setRun(Integer run) {
        do{System.out.println("Ingrese run (sin puntos ni guion ni digito verificador menor a 99 999 999) ");
        run = input.nextInt();
        this.run = run;
        }while(run > 99999999);
        System.out.println("numero debe ser menor a 99 999 999");

        if(run <= 99999999 && run >= 1000000){
            System.out.println("Registrado exitosamente");
        }
        input.nextLine();
    }
    
    public void ingresoUsuario(){

            System.out.println("Ingrese nombre ");
            nombre = input.nextLine();
            this.nombre = nombre;

        System.out.println("Ingrese fecha de nacimiento DD/MM/AAAA");
            nacimiento = input.nextLine();
            this.nacimiento = nacimiento;

        System.out.println("Ingrese run (sin puntos ni guion ni digito verificador menor a 99999999) ");
        run = input.nextInt();
        this.run = run;

        input.nextLine();
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", nacimiento='" + nacimiento + '\'' +
                ", run=" + run +
                '}';
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Su nombre " + nombre + "\nSu nacimiento " + nacimiento + "\nSu run " + run);
    }
    public void mostrarEdad(){
        System.out.println("El usuario tiene " + nacimiento +" años" );
    }


}

