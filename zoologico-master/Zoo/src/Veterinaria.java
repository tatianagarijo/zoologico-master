
public class Veterinaria {
	
	static String nombreVeterinaria="Veterinaria Pepe";
	static Animal a1,a2,a3;
	static int[] gastosMensuales={23,54,65,23,32,54,32,56,87,12,34,22};

	public static int Maximo(int[] v){
		int salida=v[0];
		for(int i:v){
			if(i>salida) salida=i;
		}
		return salida;
		
	}
	
	public static float Media(int[] v){
		float salida=0;
		for(int i:v){
			salida+=i;
		}
		salida=salida/v.length;
		return salida;
	}
	
	public static void main(String[] args) {
		// TODO 
		
		a1=new Animal("PERRO",4,"Tobi");
		a2=new Animal("GATO",6,"Misifú");
		a3=new Animal("PÁJARO",2,"Piolín");
		
		
		int gastoMaximo=Maximo(gastosMensuales);
		float gastoMedio=Media(gastosMensuales);
		System.out.println(gastoMaximo);
		System.out.println(a1.EmiteSonido());
		System.out.println(gastoMedio);
		System.out.println(a2.EmiteSonido());
		System.out.println(a3.EmiteSonido());
		
		String[] clientes={"Ana","Bea","Clara","Delia"};
		
		nombreVeterinaria+=" Tus";
		nombreVeterinaria+=" mascotas";
		nombreVeterinaria+=" sanas";
		nombreVeterinaria+=" y";
		nombreVeterinaria+=" salvas";
		System.out.println(nombreVeterinaria);
		/* Descomentar para probar la ruptura en excepciones 
		int[] sueldos=null;
		int mediaSueldos=Maximo(sueldos);
		System.out.println(mediaSueldos);
		
		*/
		

	}

}
