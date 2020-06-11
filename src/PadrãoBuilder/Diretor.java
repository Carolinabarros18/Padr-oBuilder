/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CAROL
 */package PadrãoBuilder;
 
public class Diretor {
    
   
   private CConsultaBuilder c;
   public Diretor(CConsultaBuilder c) { 
       this.c = c; 
   }	
   public void cadastrarConsulta(String mnome, 
           String especialidade,String pnome, String dt_Nascimento, String data, String hora){	
       
       c.cadastrarMedico(mnome, especialidade); 
       c.cadastrarPaciente(pnome, dt_Nascimento); 
       c.agendarConsulta(data,hora); 		
   }
   
   public Consulta finalizarConsulta() { return this.finalizarConsulta();
   
   }
}
    

