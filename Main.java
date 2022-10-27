public class Main{
	
	public static void main(String args[]){
		TArbol arbolito = new TArbol(8);
		
		arbolito.insert(6, arbolito.getRoot());
		arbolito.insert(12, arbolito.getRoot());
		arbolito.insert(16, arbolito.getRoot());
		arbolito.insert(50, arbolito.getRoot());
		arbolito.insert(4, arbolito.getRoot());
		arbolito.insert(7, arbolito.getRoot());
		arbolito.insert(11, arbolito.getRoot());
		arbolito.insert(15, arbolito.getRoot());
		arbolito.insert(5, arbolito.getRoot());
		
		System.out.println("Recorrido en preorden");
		arbolito.preOrden(arbolito.getRoot());
		
		System.out.println("Recorrido en inorden");
		arbolito.inOrden(arbolito.getRoot());
		
		System.out.println("Recorrido en postorden");
		arbolito.postOrden(arbolito.getRoot());
		
		TNodo ayuda = new TNodo();
		ayuda = arbolito.search(arbolito.getRoot(), 15);
		if (ayuda != null)
			System.out.println("El dato fue encontrado y es: " + ayuda.getInfo());
		else
			System.out.println("El dato no esta en el arbol");
	
	} // fin void main
		
} // Fin clase Main