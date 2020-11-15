package Consultorio.domie;

public abstract class Paciente {
   private String nombre;
   private int edad;
   private boolean necesitaCirugia;
public Paciente(boolean necesitaCirugia,String nombre,int edad){
 this.necesitaCirugia=necesitaCirugia;
 this.nombre=nombre;
 this.edad=edad;
}

   @Override
   public String toString() {
   String a;
   if(necesitaCirugia==false){
      a= "el paciente no es operable ";
   }else{
      a= "el paciente es operable ";
   }
      return getNombre()+a;

   }
   public String getNombre(){
      return nombre;
   }  

   public boolean isNecesitaCirugia() {
      return necesitaCirugia;
   }

   public void setNecesitaCirugia(boolean necesitaCirugia) {
      this.necesitaCirugia = necesitaCirugia;
   }
}
