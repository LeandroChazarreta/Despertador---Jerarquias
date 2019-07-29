package ar.edu.unlam.pb2;

public class HoraExacta extends Hora {

	private Integer segundos; 
	
	public HoraExacta(Integer hora, Integer min, Integer segundos) {
		super(hora, min);
		this.segundos=segundos;
	}
	
	@Override
	public void incrementar () {
		
		this.segundos++;
		if (this.segundos>59) {
			this.segundos=0;
			super.incrementar();
		}
	}

	public Integer getSegundos() {
		return segundos;
	}

	public void setSegundos(Integer segundos) {
		this.segundos = segundos;
	}

	
	
	
	
	
	

}
