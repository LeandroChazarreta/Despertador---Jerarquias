package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHora {

	@Test
	public void test() {
		
		Hora hora= new Hora(23, 59);
		hora.incrementar();
		Integer ve=0;
		Integer vo=hora.getHora();
		
		ve=0;
		vo=hora.getMin();
		assertEquals(ve,vo);
		assertEquals(ve,vo);
	}

}
