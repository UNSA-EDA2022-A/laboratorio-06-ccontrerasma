package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }


    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){
    	//si el arbolesta vacio entonces si ser binario
        if(a.isEmpty()) {
    		return true;
    		
        //Si no esta vacio, se verificara que los nodos tengan hijos o sean hojas
    	} 
        else {
    		return siBinario(a.root);
    	}
    }
    public <T extends Comparable<T>> boolean siBinario(Node<T> node){
    	//Primer caso, si los dos hijos son null entonces devolvera true
    	if(node.left == null && node.right == null) {
    		return true;
    		} 
        //Segundo caso si un hijo es null y el otro no devolvera false por que ya no seria binario
    	else if ((node.left == null && node.right != null) || (node.left != null && node.right == null)) {
    		return false;
    		}
        //Tercer caso si el nodo presenta los dos hijos diferentes de null se verificara que cada hijo sea nodo u hoja
    	else {
    		return siBinario(node.right) && siBinario(node.left);
    	}
    }
}
