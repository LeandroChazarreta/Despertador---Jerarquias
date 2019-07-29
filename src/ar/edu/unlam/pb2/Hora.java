package ar.edu.unlam.pb2;

public class Hora {
	private Integer hora;
	private Integer min;

	public Hora(Integer hora, Integer min) {

		this.hora = hora;
		this.min = min;
	}

	public void setHora(Integer hora) {
		if (hora > 0 && hora < 23) {
			this.hora = hora;
		}
	}

	public void setMin(Integer min) {
		if (min > 0 && min < 59) {
			this.min = min;
		}

	}

	public void incrementar() {

		this.min++;
		if (this.min > 59) {
			this.min = 0;
			this.hora++;
		}
		if (this.hora > 23) {
			this.hora = 0;
		}
	}

	public Integer getHora() {
		return hora;
	}

	public Integer getMin() {
		return min;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		result = prime * result + ((min == null) ? 0 : min.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hora other = (Hora) obj;
		if (hora == null) {
			if (other.hora != null)
				return false;
		} else if (!hora.equals(other.hora))
			return false;
		if (min == null) {
			if (other.min != null)
				return false;
		} else if (!min.equals(other.min))
			return false;
		return true;
	}
	
	
}
