/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Preorden;

import Arbol.ArbolBinario;
import Arbol.Nodo;


public class Preorden {
  
    public static void main(String[] args) {
        ArbolBinario arbol;
        Nodo a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11,a12, a13,a14, a;

        //Recorrido en Preorden de A)a-b+c
        a1 = ArbolBinario.nuevoArbol(null, "a", null);
        a2 = ArbolBinario.nuevoArbol(null, "b", null);
        a3 = ArbolBinario.nuevoArbol(a1, "-", a2);//Nodo izq de Raiz
        a4 = ArbolBinario.nuevoArbol(null, "c", null);//Nodo der de Raiz
        a = ArbolBinario.nuevoArbol(a3, "+", a4);//Nodo Raiz
        arbol = new ArbolBinario(a);
        System.out.print("Recorrido en Preorden de A)a-b+c, es:\t");
        arbol.preorden(a);

        
        
        //Recorrido en Preorden de B)(a*c) MOD c
        a1 = ArbolBinario.nuevoArbol(null, "a", null);
        a2 = ArbolBinario.nuevoArbol(null, "c", null);
        a3 = ArbolBinario.nuevoArbol(a1, "*", a2);//Nodo izq de Raiz
        a4 = ArbolBinario.nuevoArbol(null, "c", null);//Nodo der de Raiz
        a = ArbolBinario.nuevoArbol(a3, "MOD", a4);//Nodo Raiz
        arbol = new ArbolBinario(a);
        System.out.print("\nRecorrido en Preorden de B)(a*c) MOD c, es:\t");
        arbol.preorden(a);
        
        //Recorrido en Preorden de C) c^b+c*b
        a1 = ArbolBinario.nuevoArbol(null, "c", null);
        a2 = ArbolBinario.nuevoArbol(null, "b", null);
        a3 = ArbolBinario.nuevoArbol(a1, "^", a2);//Nodo izq de Raiz
        a4 = ArbolBinario.nuevoArbol(null, "c", null);
        a5 = ArbolBinario.nuevoArbol(null, "b", null);
        a6 = ArbolBinario.nuevoArbol(a4, "*", a5);//Nodo der de Raiz
        a = ArbolBinario.nuevoArbol(a3, "+", a6);//Nodo Raiz
        arbol = new ArbolBinario(a);
        System.out.print("\nRecorrido en Preorden de C) c^b+c*b, es:\t");
        arbol.preorden(a);
        
        a1 = ArbolBinario.nuevoArbol(null, "H", null);
        a2 = ArbolBinario.nuevoArbol(null, "I", null);
        a3 = ArbolBinario.nuevoArbol(a1, "D", a2);//Nodo izq de Raiz
        a4 = ArbolBinario.nuevoArbol(null, "J", null);
        a5 = ArbolBinario.nuevoArbol(null, "K", null);
        a6 = ArbolBinario.nuevoArbol(a4, "E", a5);//Nodo der de Raiz
        a7 = ArbolBinario.nuevoArbol(a3, "B", a6);//Nodo Raiz
        
        a8 = ArbolBinario.nuevoArbol(null, "L", null);
        a9 = ArbolBinario.nuevoArbol(null, "M", null);
        a10 = ArbolBinario.nuevoArbol(a8, "F", a9);//Nodo izq de Raiz
        a11 = ArbolBinario.nuevoArbol(null, "N", null);
        a12 = ArbolBinario.nuevoArbol(null, "O", null);
        a13 = ArbolBinario.nuevoArbol(a11, "G", a12);//Nodo der de Raiz
        a14 = ArbolBinario.nuevoArbol(a10, "C", a13);//Nodo Raiz
        a = ArbolBinario.nuevoArbol(a7, "A", a14);//Nodo Raiz
         arbol.preorden(a);
         System.out.println("");
         
        arbol.inorden(a);
        System.out.println("");
         arbol.postorden(a);
    }
}
