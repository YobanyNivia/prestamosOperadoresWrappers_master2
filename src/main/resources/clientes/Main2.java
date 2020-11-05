package clientes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import clases.BeneficiosCovid19;
import clases.Clientes;

public class Main2 {

	static ArrayList<BeneficiosCovid19> lista1 = new ArrayList<BeneficiosCovid19>();
	static ArrayList Beneficios1 = new ArrayList ();
	static ArrayList MejoBeneficio = new ArrayList ();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leer();
		generaInfome();
	}
	
	public static void leer() {
		
		String salir;
		 
	do {
		Scanner sc = new Scanner(System.in);		
		BeneficiosCovid19 aux =new BeneficiosCovid19();
		
		
 		aux.setId(getIdBeneficio());
    	System.out.println("Nombre");
    	aux.setNombre(sc.nextLine());
    	System.out.println("Valor Subsidio");
    	aux.setValorSubsidio(sc.nextFloat());
    	
    	lista1.add(aux);    
    	Beneficios1.add(getLisBeneficios());
    
    	    	
    	System.out.println("Desea ingresar otro beneficiario?---> s");
    	salir = sc.next();
    		
    	sc.nextLine();
    	
	} while (salir.equals("s") || salir.equals("S"));
    
	}
	
	
/* Genera numero aleatorio */
	
	private static String getIdBeneficio(){  	
	    	int z;
	    	z= (int) (1000* Math.random());
	        return String.valueOf(z);
	    }

/* Genera Listado de Beneficios */
	 public static List getLisBeneficios() {
		 ArrayList Beneficios6 = new ArrayList ();
		 Clientes clientes = new Clientes ();
		 Scanner sc1 = new Scanner(System.in);
		 
		 System.out.println("Escriba numero de beneficios");
	    	int numerobeneficios = sc1.nextInt();
	    	int j= 0;
		 
		 for (int i=0; i<numerobeneficios; i++) {
	    		System.out.println("valor de beneficio " + ++j);
	     		Beneficios6.add(sc1.nextFloat());
	     	}
		 
		    clientes.setBeneficiosClientes(Beneficios6);
		    MejoBeneficio.add (Collections.max(Beneficios6)); 
				 
		 	return Beneficios6;
	 }
	
/* Genera Mejores Beneficios */
	public static void generaInfome() {
	float m = (float) Collections.max(MejoBeneficio);
    
	System.out.println("**************************************************");
	System.out.println("* El mejor beneficio es: " + Collections.max(MejoBeneficio)) ;
	
	for (int x=0; x < MejoBeneficio.size();x++) {
		
		float m2 = (float) MejoBeneficio.get(x);
		
		if ( m == m2) { 
			System.out.println("* Le pertenece al cliente: \n" + "* " + lista1.get(x));
			System.out.println("**************************************************");
		}
		
	   }
		
	 }
}
