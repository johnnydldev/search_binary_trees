/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

// definición de la clase Arbol
class NodoArbol {

    // miembros de acceso del paquete
    NodoArbol nodoIzq; // nodo izquierdo
    NodoArbol nodoRaiz; //nodo Padre
    NodoArbol nodoDer; // nodo derecho
    public int llave; // identificador

    Object datos; // valor del nodo

    // el constructor inicializa los datos y hace de este nodo un nodo raíz
    public NodoArbol(int indice) {
        llave = indice;
        nodoRaiz = nodoIzq = nodoDer = null; // el nodo no tiene hijos
        datos = null;
    } // fin del constructor de Arbol

} // fin de la clase NodoArbol

// definición de la clase Arbol
public class Arbol {

    NodoArbol raiz;

    // el constructor inicializa un Arbol vacío de enteros
    public Arbol() {
        raiz = null;
    } // fin del constructor de Arbol sin argumentos

    // localiza el punto de inserción e inserta un nuevo nodo; ignora los valores duplicados
    public void insertar(int indice, Object valorInsertar) {
        NodoArbol n = new NodoArbol(indice);
        n.datos = valorInsertar;

        if (raiz == null) {
            raiz = n;
        } else {
            NodoArbol aux = raiz;

            while (aux != null) {
                n.nodoRaiz = aux;

                if (n.llave >= aux.llave) {
                    aux = aux.nodoDer;
                } else {
                    aux = aux.nodoIzq;
                }

                if (n.llave < aux.nodoRaiz.llave) {
                    n.nodoRaiz.nodoIzq = n;
                } else {
                    n.nodoRaiz.nodoDer = n;
                }
            }
        }
    }// fin del método insertar

    // comienza el recorrido preorden
    public void recorridoPreorden(NodoArbol n) {
        if (n != null) {
            System.out.println("Indice: " + n.llave + " Dato: " + n.datos);
            recorridoInorden(n.nodoIzq);
            recorridoInorden(n.nodoDer);
        }
    } // fin del método recorridoPreorden

    // comienza recorrido inorden
    public void recorridoInorden(NodoArbol n) {
        if (n != null) {
            recorridoInorden(n.nodoIzq);
            System.out.println("Indice: " + n.llave + " Dato: " + n.datos);
            recorridoInorden(n.nodoDer);
        }
    } // fin del método recorridoInorden

    // comienza recorrido postorden
    public void recorridoPostorden(NodoArbol n) {
        if (n != null) {
            recorridoInorden(n.nodoIzq);
            recorridoInorden(n.nodoDer);
            System.out.println("Indice: " + n.llave + " Dato: " + n.datos);
        }
    } // fin del método recorridoPostorden

} // fin de la clase Arbol
