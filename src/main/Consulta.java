package main;

import Consultorio.domie.Paciente;

import java.util.ArrayList;

public class Consulta {
    public static void main(String[] args) {
        Paciente paciente1= new Paciente(false,"Manuel",25);
        Paciente paciente2= new Paciente(false,"Hernesto",40);
        Paciente paciente3= new Paciente(false,"Alejandra",34);
        Paciente paciente4= new Paciente(false,"Ana",12);
        Paciente paciente5= new Paciente(false,"Juan",26);
        Paciente paciente6= new Paciente(false,"Miguel",45);
        ArrayList<Paciente>listaPacientes=new ArrayList<>();
        Paciente paciente=new Paciente(listaPacientes);
        paciente.addPaciente(paciente1);
        paciente.addPaciente(paciente2);
        paciente.addPaciente(paciente3);
        paciente.addPaciente(paciente4);
        paciente.addPaciente(paciente5);
        paciente.addPaciente(paciente6);





        }


    }
}
