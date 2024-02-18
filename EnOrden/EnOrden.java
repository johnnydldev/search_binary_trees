
package EnOrden;

import Arbol.ArbolBinario;
import Arbol.Nodo;
import TipoPila.PilaVector;



public class EnOrden {
    
    public static void main(String[] args) throws Exception {
         ArbolBinario arbol;
        Nodo a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a;
        PilaVector pila = new PilaVector();

        //Recorrido en Orden de x = (2+3)*6
        a1 = ArbolBinario.nuevoArbol(null, "2", null);
        a2 = ArbolBinario.nuevoArbol(null, "3", null);
        a = ArbolBinario.nuevoArbol(a1, "+", a2);//Nodo izq de Raiz
        pila.insertar(a);

        a = ArbolBinario.nuevoArbol(null, "6", null);//Nodo Der de raiz
        pila.insertar(a);

        a2 = (Nodo) pila.quitar();
        a1 = (Nodo) pila.quitar();
        a = ArbolBinario.nuevoArbol(a1, "*", a2);//Nodo raiz
        arbol = new ArbolBinario(a);

        System.out.print("Recorrido en Orden de x = (2+3)*6, es:\t");
        arbol.inorden(a);

        //Recorrido en Orden de x = (2+3)/4
        a1 = ArbolBinario.nuevoArbol(null, "2", null);
        a2 = ArbolBinario.nuevoArbol(null, "3", null);
        a = ArbolBinario.nuevoArbol(a1, "+", a2);//Nodo Izq de Raiz
        pila.insertar(a);

        a = ArbolBinario.nuevoArbol(null, "4", null);//Nodo der de Raiz
        pila.insertar(a);

        a2 = (Nodo) pila.quitar();
        a1 = (Nodo) pila.quitar();
        a = ArbolBinario.nuevoArbol(a1, "/", a2);//Nodo Raiz
        arbol = new ArbolBinario(a);
        System.out.print("\nRecorrido en Orden de x = (2+3)/4, es:\t");
        arbol.inorden(a);

        //Recorrido en Orden de x= 2^2+3-2*(2 MOD 4)
        a1 = ArbolBinario.nuevoArbol(null, "2", null);
        a2 = ArbolBinario.nuevoArbol(null, "2", null);
        a3 = ArbolBinario.nuevoArbol(a1, "^", a2);
        a5 = ArbolBinario.nuevoArbol(null, "3", null);
        a4 = ArbolBinario.nuevoArbol(a3, "+", a5);
        a7 = ArbolBinario.nuevoArbol(null, "2", null);
        a6 = ArbolBinario.nuevoArbol(a4, "-", a7);//Nodo Izq de Raiz
        a9 = ArbolBinario.nuevoArbol(null, "2", null);
        a11 = ArbolBinario.nuevoArbol(null, "4", null);
        a10 = ArbolBinario.nuevoArbol(a9, "MOD", a11);//Nodo Der de raiz
        a8 = ArbolBinario.nuevoArbol(a6, "*", a10);//Nodo Raiz

        arbol = new ArbolBinario(a8);

        System.out.print("\nRecorrido en Orden de x= 2^2+3-2*(2 MOD 4), es:\t");
        arbol.inorden(a8);

        //Recorrido en Orden de x= (12+6)/2*3
        a1 = ArbolBinario.nuevoArbol(null, "12", null);
        a2 = ArbolBinario.nuevoArbol(null, "6", null);
        a3 = ArbolBinario.nuevoArbol(a1, "+", a2);// Nodo izq de Raiz.
        a4 = ArbolBinario.nuevoArbol(null, "2", null);
        a5 = ArbolBinario.nuevoArbol(null, "3", null);
        a6 = ArbolBinario.nuevoArbol(a4, "*", a5);//Nodo der de Raiz
        a = ArbolBinario.nuevoArbol(a3, "/", a6);//Nodo Raiz

        arbol = new ArbolBinario(a);
        System.out.print("\nRecorrido en Orden de x= (12+6)/2*3, es:\t");
        arbol.inorden(a);

        //Recorrido en Orden de x= (2+3) MOD 6
        a1 = ArbolBinario.nuevoArbol(null, "2", null);
        a2 = ArbolBinario.nuevoArbol(null, "3", null);
        a3 = ArbolBinario.nuevoArbol(a1, "+", a2);//Nodo izq de Raiz
        a4 = ArbolBinario.nuevoArbol(null, "6", null);//Nodo der de Raiz
        a = ArbolBinario.nuevoArbol(a3, "MOD", a4);

        arbol = new ArbolBinario(a);
        System.out.print("\nRecorrido en Orden de x= (2+3) MOD 6, es:\t");
        arbol.inorden(a);

        //Recorrido en Orden de x= (3*2+2) * (15/2)
        a1 = ArbolBinario.nuevoArbol(null, "3", null);
        a2 = ArbolBinario.nuevoArbol(null, "2", null);
        a3 = ArbolBinario.nuevoArbol(a1, "*", a2);
        a4 = ArbolBinario.nuevoArbol(null, "2", null);
        a5 = ArbolBinario.nuevoArbol(a3, "+", a4);//Nodo izq de raiz
        a6 = ArbolBinario.nuevoArbol(null, "15", null);
        a7 = ArbolBinario.nuevoArbol(null, "2", null);
        a8 = ArbolBinario.nuevoArbol(a6, "/", a7);//Nodo der de Raiz
        a = ArbolBinario.nuevoArbol(a5, "*", a8);//Nodo raiz
        
        arbol = new ArbolBinario(a);
        System.out.print("\nRecorrido en Orden de x= (3*2+2) * (15/2), es:\t");
        arbol.inorden(a);
        
    }
    
}
