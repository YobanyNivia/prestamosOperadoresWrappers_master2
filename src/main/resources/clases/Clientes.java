package clases;

import java.util.List;

public class Clientes {

	public List <BeneficiosCovid19> beneficiosClientes;
	
	public void setBeneficiosClientes(List<BeneficiosCovid19> beneficiosClientes) {
		this.beneficiosClientes = beneficiosClientes;
		
	}
	
    public List<BeneficiosCovid19> getBeneficiosClientes() {
		
		return beneficiosClientes;
	}

	@Override
	public String toString() {
		return "Clientes [beneficiosClientes=" + beneficiosClientes + "]";
	}

	
	

}
