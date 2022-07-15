package com.example.project;

public class Exercise2 {

    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstIguales(tree1, tree2));
        
    }
    public <T extends Comparable<T>> boolean bstIguales(BST<T> a1, BST<T> a2){
    	
    	/* Como los arboles con los que se estan trabajando son BTS's significa que respetan la condicion
    	 de que el lado rerecho es mayor y el lado izquierdo es menor por ende para reconocer si dos arboles BTS's 
    	 son iguales seria sufiente verificar que su postOrder y el preOrder son iguales.*/
    	
    	if(a1.postOrder().equals(a2.postOrder()) && a1.preOrder().equals(a2.preOrder()))
    		return true;
        return false;
    }
}
