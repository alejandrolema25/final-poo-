package Consultorio.domie;

public class PacienteOperable extends Paciente implements Operable {
    public PacienteOperable(boolean necesitaCirugia, String nombre, int edad) {
        super(necesitaCirugia, nombre,edad);
    }

    @Override
    public boolean operar() {
        if(this.isNecesitaCirugia()==false)
        return false;
    }

    @Override
    public boolean noOperar() {
        return false;
    }
}
