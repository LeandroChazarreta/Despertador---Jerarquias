package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDespertador {

	@Test
	public void testQueVerificaQueElDespertadorEsteSonando() throws Exception {
		
		Reloj despertador = new Reloj(11,0 , 10, 59);
		despertador.iniciar();
		
		assertTrue(despertador.getSonar());
		

		
	}
	

	@Test
	public void testQueVerificaQueLaAlarmaSeaSeteadaCorrectamente() {
		
		Reloj despertador = new Reloj(11,0 , 10, 59);
		
		Integer ve=11;
		Integer vo=despertador.getAlarma().getHora();
		assertEquals(ve,vo );
		
		ve=0;
		vo=despertador.getAlarma().getMin();
		assertEquals(ve,vo );
	}
		

}
