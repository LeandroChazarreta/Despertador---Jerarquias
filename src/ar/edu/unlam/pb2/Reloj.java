package ar.edu.unlam.pb2;

public class Reloj {
	private Hora alarma;
	private Hora reloj;
	private Boolean sonar;

	public  Reloj (
			Integer horaAlarma, Integer minutosAlarma,
			Integer horaReloj, Integer minutosReloj){
		
		alarma=new Hora(horaAlarma,minutosAlarma);
		reloj = new Hora (horaReloj,minutosReloj);
		sonar=false;
		
	}
		
	public void iniciar ()  {
		
		while (true) {
			this.demoraUnMinuto();
			reloj.incrementar();
			if (reloj.equals(alarma)) {
				this.sonar();
				break;
			}
		}
	
	}

	private void demoraUnMinuto() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//demora un minuto
		
	}

	private void sonar() {
	
		this.sonar=true;
	}

	public Hora getAlarma() {
		return alarma;
	}

	public void setAlarma(Hora alarma) {
		this.alarma = alarma;
	}

	public Hora getReloj() {
		return reloj;
	}

	public void setReloj(Hora reloj) {
		this.reloj = reloj;
	}

	public Boolean getSonar() {
		return sonar;
	}

	public void setSonar(Boolean sonar) {
		this.sonar = sonar;
	}

	@Override
	public String toString() {
		return "Despertador [alarma=" + alarma + ", reloj=" + reloj + ", sonar=" + sonar + "]";
	}

	

}
