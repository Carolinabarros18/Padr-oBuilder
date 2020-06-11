   package PadrãoBuilder;
   
  public class CConsultaBuilder implements ConsultaBuilder{
      private Consulta consulta1;
      public CConsultaBuilder(int codConsulta) {
          this.consulta1 = new Consulta(); 
      }
      public void cadastrarMedico(String nome, String especialidade) { 
          Medico m1 = new Medico();		
          m1.setNome(nome);	
          m1.setEspecialidade(especialidade);	
          this.consulta1.setMedico(m1); 
      }
      public void cadastrarPaciente(String nome, String dt_Nascimento) {
          Paciente p1 = new Paciente();		
          p1.setNome(nome);
          p1.setDt_Nascimento(dt_Nascimento);	
          this.consulta1.setPaciente(p1);
      } 
      public void agendarConsulta(String data, String hora) { 
          Consulta c1= new Consulta();
          c1.setHora(hora);
          c1.setData(data);
          this.consulta1.setData(data);
          this.consulta1.setHora(hora);
      } 
      public Consulta finalizarConsulta() { 
          return this.consulta1; 
      } 
  }