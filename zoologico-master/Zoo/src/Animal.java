
public class Animal {
	static int numeroAnimales=0;
	
	String tipo="";
	int edad=0;
	String nombre;
	
	Animal(String tipo,int edad,String nombre){
		this.tipo=tipo;
		this.edad=edad;
		this.nombre=nombre;
		numeroAnimales++;
	}
	
	String EmiteSonido(){
		String salida="";
		switch(this.tipo){
		case "PERRO":salida="GUAU GUAU";break;
		case "GATO":salida="MIAU MIAU";break;
		case "PÁJARO":salida="PIO PIO";break;
		default:salida="SIN SONIDO";break;
		}
		
		return salida;
	}

	public static int getNumeroAnimales() {
		return numeroAnimales;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
