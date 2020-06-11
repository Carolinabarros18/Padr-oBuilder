/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicos;

import PadrãoBuilder.CConsultaBuilder;
import PadrãoBuilder.Consulta;
import PadrãoBuilder.Diretor;
import static java.util.stream.DoubleStream.builder;

/**
 *
 * @author CAROL
 */
public class Medicos {
 	public static void main(String[] args) {		
            CConsultaBuilder ConsultaBuilder = new CConsultaBuilder(1) {
                @Override
                public Consulta finalizarConsulta() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };		
            Diretor dir = new Diretor (ConsultaBuilder);
            dir.cadastrarConsulta("Julio","professor"," Paula","07/03/2005","10/03/2020","15:20"); 			
            /*ConsultaBuilder */Consulta Consulta = ConsultaBuilder.finalizarConsulta();
            Consulta.imprimirComprovante(); 
        } 
}
    

