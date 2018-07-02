package arreglos;

public class mainarrays {

	public static int showElNumeroMayor (int array_numeros[]) {
		int nmayor=0;
		for (int index=0;index<array_numeros.length;index++) {
			//siempre y cuando  los numeros del array sean  naturales.
			if (array_numeros[index]>nmayor) {  
				nmayor = array_numeros[index];
			}
			
			
		}
		
			
			
			
		return nmayor;
	}
	public static void main(String[] args) {
		
		int[] array_numeros = {6,561,18,6};
		//int[] array_numeros = new int[5];
		int nmayor = showElNumeroMayor(array_numeros);
		System.out.println(nmayor);
		
	}
	
	
}
