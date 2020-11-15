package Consultorio.domie;

public class PacienteNoOperable extends Paciente implements Operable {
    public PacienteNoOperable(boolean necesitaCirugia, String nombre,int edad) {
        super(necesitaCirugia, nombre,edad);
    }

    @Override
    public boolean operar() {

        return false;
    }

    @Override
    public boolean noOperar() {
        return false;
    }
}
