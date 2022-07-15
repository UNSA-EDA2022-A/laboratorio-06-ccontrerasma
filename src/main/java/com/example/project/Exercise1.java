package com.example.project;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstSimilares(tree1, tree2));
        
    }


    public <T extends Comparable<T>> boolean bstSimilares(BST<T> a1, BST<T> a2){
    	Node<T> primero = a1.root; 
    	Node<T> segundo = a2.root; 
    	
    	//si ambos están vacios son similares
    	if (a1.isEmpty() && a2.isEmpty()) { 
    		return true; 
    	}
    	else 
    		//de lo contrario verificara si los hijos son iguales 
    		return identicos(primero.right, segundo.right) && identicos(primero.left, segundo.left);  
    	    
    }
    private <T extends Comparable<T>> boolean identicos(Node<T> a1, Node<T> a2){
    	
    	 if(a1 == null && a2 == null)//cuando los dos son nulos devuelve true por que ya no hay mas nodos
             return true;
    	 
         else if((a1 != null && a2 == null) || (a1 == null && a2 != null))// cuando a1 sea diferente de a2 o en el otro caso si a2 es diferente de a1
             return false;
    	 
         return (identicos(a1.left, a2.left) && identicos(a1.right, a2.right));//de lo contrario seguira buscando los nodos siguientes
    }
}
