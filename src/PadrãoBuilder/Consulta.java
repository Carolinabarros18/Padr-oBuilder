
   package PadrãoBuilder;
   
   public class Consulta { 
       
       
       private String data;
   	private String hora;	
        private Medico medico;
        private Paciente paciente; 
        
        
        
        
        public String getData() { 
            return data;
        } 
        public void setData(String data){
            this.data = data; 
   }
        public String getHora() {
            return hora; 
        }
        public void setHora(String hora) {
            this.hora = hora; 
        } 
        public Medico getMedico() {
            return medico;
        } public void setMedico(Medico medico) { 
            this.medico = medico;
        } 
        public Paciente getPaciente() {
            return paciente; 
        }
        public void setPaciente(Paciente paciente) { 
            this.paciente = paciente; 
        } 
        public void imprimirComprovante() {
   
            System.out.println("**Consulta***");
            System.out.println("Medico:"+this.getMedico());	
            System.out.println("Paciente:"+this.getPaciente());
            System.out.println("Horario:"+this.getHora());	
            System.out.println("Data:"+this.getData());	
        }
}
