package tallerarboles;

public class ArbolBinario {

    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void agregarNodo(String nom, int edad, float bas) {

        NodoArbol nuevo = new NodoArbol(nom, edad, bas);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol aux = raiz;
            NodoArbol padre;
            while (true) {
                padre = aux;
                if (edad < aux.edad) {
                    aux = aux.Hizq;
                    if (aux == null) {
                        padre.Hizq = nuevo;
                        return;
                    }

                } else {
                    aux = aux.Hder;
                    if (aux == null) {
                        padre.Hder = nuevo;
                        return;
                    }
                }
            }

        }

    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public void inOrden(NodoArbol r) {
        if (r != null) {
            inOrden(r.Hizq);
            System.out.println(r.nombre + " " + r.edad + " " + r.basico);
            inOrden(r.Hder);
        }
    }

    public void preOrden(NodoArbol r) {
        if (r != null) {
            System.out.println(r.nombre + " " + r.edad + " " + r.basico);
            preOrden(r.Hizq);
            preOrden(r.Hder);
            

        }

    }
public void postOrden(NodoArbol r) {
        if (r != null) {
            postOrden(r.Hizq);
            postOrden(r.Hder);
            System.out.println(r.nombre + " " + r.edad + " " + r.basico);
            
        }

    }

public NodoArbol buscarNodo(int edad){
    NodoArbol aux = raiz;
    while(aux.edad!=edad){
        if (edad<aux.edad) {
            aux = aux.Hizq;
        }else{
            aux = aux.Hder;
        }
        if (aux==null) {
            return null;
        }
    }
    return aux;
}

public NodoArbol modificar(int edad){
    NodoArbol aux = raiz;
    while(aux.edad!=edad){
        if (edad<aux.edad) {
            aux = aux.Hizq;
        }else{
            aux = aux.Hder;
        }
        if (aux==null) {
            return null;
        }
    }
    return aux;
}

public boolean eliminar(int edad){
    
    NodoArbol aux = raiz;
    NodoArbol padre = raiz;
    boolean esHizq = true;
    while (aux.edad!=edad){
        padre = aux;
        if (edad<aux.edad) {
            esHizq= true;
            aux = aux.Hizq;
        }else{
            esHizq = false;
            aux = aux.Hder;
        }
        if (aux==null) {
            return false;
        }
    }
    if (aux.Hizq==null && aux.Hder==null) {
        if (aux==raiz) {
            raiz = null;
        }else if (esHizq) {
            padre.Hizq = null;
        }else{
            padre.Hder = null;
        }
        
    }else if (aux.Hder==null) {
        if (aux==raiz) {
            raiz = aux.Hizq;
        }else if (esHizq) {
            padre.Hizq = aux.Hizq;
        }else{
            padre.Hder = aux.Hizq;
        }
        
    }else if (aux.Hizq==null) {
        if (aux==raiz) {
            raiz = aux.Hder;
        }else if (esHizq) {
            padre.Hizq = aux.Hder;
        }else{
            padre.Hder = aux.Hizq;
        }
        
    }else{
        NodoArbol rempla = obtenerNodoReemplazo(aux);
        if (aux==raiz) {
            raiz = rempla;
        }else if (esHizq) {
            padre.Hizq = rempla;
        }else{
          padre.Hder = rempla;  
        }
        rempla.Hizq = aux.Hizq;
    }
    return true;
    
}

public NodoArbol obtenerNodoReemplazo(NodoArbol nodoreemp){
    NodoArbol reemplazoPadre = nodoreemp;
    NodoArbol reemplazo = nodoreemp;
    NodoArbol aux = nodoreemp.Hder;
    while (aux!=null){
        reemplazoPadre = reemplazo;
        reemplazo = aux;
        aux = aux.Hizq;
    }
    if (reemplazo!=nodoreemp.Hder) {
        reemplazoPadre.Hizq = reemplazo.Hder;
        reemplazo.Hder = nodoreemp.Hder;
    }
    System.out.println("El nodo reemplazo es" + reemplazo);
    return  reemplazo;
}




}

