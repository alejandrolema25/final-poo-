package Consultorio.domie;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Oftalmologo {
    private String nombre;
    private Arraylist<Paciente>pacientes;
    public Oftalmologo( ArrayList<Paciente>pacientes){
        this.pacientes=new ArrayList<>();
    }
    public Arraylist<Paciente> addPaciente(Paciente paciente){
        cityList.stream().filter(str -> str.contains("a")).collect(Collectors.toList()){pacientes.add(paciente);

    }
        public boolean operarPaciente(Operable pacienteAOperar){
            return pacienteAOperar.operar();
        }
        public boolean noOperarPaciente(Operable pacienteANoOperar){
            return pacienteANoOperar.noOperarPaciente();
        }
public ArrayList getOperados(){
            return (ArrayList<Paciente>)pacientes.stream().filter(paciente->paciente.isNecesitaCirugia()==true).collect(Collectors.toList())
        }
public ArrayList<Paciente>getPacientes(){
return pacientes;
        }
        }

}
