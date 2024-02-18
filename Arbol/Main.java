/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

public class Main {

    public static void main(String[] args) throws Exception {
        ArbolBinario arbol;
        Nodo a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a;

        //Recorrido en Postorden de D)a*b/c
        a1 = ArbolBinario.nuevoArbol(null, "a", null);
        a2 = ArbolBinario.nuevoArbol(null, "b", null);
        a3 = ArbolBinario.nuevoArbol(a1, "*", a2);//Nodo izq de Raiz
        a4 = ArbolBinario.nuevoArbol(null, "c", null);//Nodo der de Raiz
        a = ArbolBinario.nuevoArbol(a3, "/", a4);//Nodo Raiz
        arbol = new ArbolBinario(a);
        System.out.print("Recorrido en Postorden de D)a*b/c, es:\t");
        arbol.postorden(a);

        //Recorrido en Postorden de E)(a+b)/c
        a1 = ArbolBinario.nuevoArbol(null, "a", null);
        a2 = ArbolBinario.nuevoArbol(null, "b", null);
        a3 = ArbolBinario.nuevoArbol(a1, "+", a2);//Nodo izq de Raiz
        a4 = ArbolBinario.nuevoArbol(null, "c", null);//Nodo der de Raiz
        a = ArbolBinario.nuevoArbol(a3, "/", a4);//Nodo Raiz
        arbol = new ArbolBinario(a);
        System.out.print("\nRecorrido en Postorden de E)(a+b)/c, es:\t");
        arbol.postorden(a);
        
        
        //Recorrido en Postorden de F)a*b*c/(b+c)
        a1 = ArbolBinario.nuevoArbol(null, "a", null);
        a2 = ArbolBinario.nuevoArbol(null, "b", null);
        a3 = ArbolBinario.nuevoArbol(a1, "*", a2);
        a4 = ArbolBinario.nuevoArbol(null, "c", null);
        a5 = ArbolBinario.nuevoArbol(a3, "*", a4);//Nodo izq de raiz
        a6 = ArbolBinario.nuevoArbol(null, "b", null);
        a7 = ArbolBinario.nuevoArbol(null, "c", null);
        a8 = ArbolBinario.nuevoArbol(a6, "+", a7);//Nodo der de Raiz
        a = ArbolBinario.nuevoArbol(a5, "/", a8);//Nodo raiz
        
        arbol = new ArbolBinario(a);
        System.out.print("\nRecorrido en Postorden de F)a*b*c/(b+c), es:\t");
        arbol.postorden(a);
        
        
    }
}
