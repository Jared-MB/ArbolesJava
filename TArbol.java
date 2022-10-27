public class TArbol{
	private TNodo root;
	
	TArbol(int dato){
		root = new TNodo(dato);
	}	
	
	public TNodo getRoot(){
		return root;
	}	
	
	public void insert(int dato, TNodo root){
		if (dato > root.getInfo())
			if (root.getRight() != null)
				insert(dato, root.getRight());
			else{
				TNodo hijo = new TNodo(dato);
				root.setRight(hijo);
			}		
		else
			if (dato < root.getInfo())
				if (root.getLeft() != null){
					insert(dato, root.getLeft());
				}
				else {
					TNodo hijo = new TNodo(dato);
					root.setLeft(hijo);
				}
	}	
	
	public void preOrden(TNodo root){
		if (root != null){
			System.out.println(root.getInfo());
			preOrden(root.getLeft());
			preOrden(root.getRight());
		}	 
	}
	
	public void inOrden(TNodo root){
		if (root != null){
			inOrden(root.getLeft());
			System.out.println(root.getInfo());
			inOrden(root.getRight());
		}	
	}
	
	public void postOrden(TNodo root){
		if (root != null){
			postOrden(root.getLeft());
			postOrden(root.getRight());
			System.out.println(root.getInfo());
		}	
	}
	
	public TNodo search(TNodo root, int dato){
		if (root != null){
			if (dato > root.getInfo()){
				return search(root.getRight(), dato);
			}
			if (dato < root.getInfo()){
				return search(root.getLeft(), dato);
			}
			return root;    	
		}
		return null;	
	}
	
}