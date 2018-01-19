package tallerarboles;



import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

            
        int opcion = 0, elem, mod;
        String nombre;
        float basico;
        ArbolBinario elarbol = new ArbolBinario();
        do {
            try {
               
                
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                          "1. Agregar un nodito\n"
                        + "2. Recorrer inorden \n"
                        + "3. Recorrer preorden\n"
                        + "4. Recorrer postorden\n"
                        + "5. Buscar un nodo en el arbolito\n"
                        + "6. Eliminar un nodo en el arbolito\n"
                        + "7. modificar un nodo en el arbolito\n"
                        + "8. Exit!!!!!!!\n"
                        + "Elige una opcion ...", "Arboles binario", JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elem = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingrese el Numero del nodo...", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null,
                                "ingrese el Nombre del nodo...", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE);
                        basico = Float.parseFloat(JOptionPane.showInputDialog(null,
                                "ingrese el Basico del nodo...", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE));
                        elarbol.agregarNodo(nombre, elem, basico);

                        break;
                    case 2:
                        if (!elarbol.estaVacio()) {
                            elarbol.inOrden(elarbol.raiz);
                            JOptionPane.showMessageDialog(null, "El Arbolito Esta siendo mostrado por consola Netbeans", "!Atencion¡", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(null, "El Tree Esta Vacio", "!OJO¡", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (!elarbol.estaVacio()) {
                            elarbol.preOrden(elarbol.raiz);
                            JOptionPane.showMessageDialog(null, "Esta belleza de Arbol Esta siendo mostrado por consola", "!Atencion¡", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(null, "El Arbol Esta Vacio", "!Cuidado¡", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 4:
                        if (!elarbol.estaVacio()) {
                            elarbol.postOrden(elarbol.raiz);
                            JOptionPane.showMessageDialog(null, "Ahi esta tu arbol ordernado en la consola", "!Atencion¡", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(null, "El Arbol Esta Vacio", "!Cuidado¡", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 5:
                        if (!elarbol.estaVacio()) {
                            elem = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "ingrese el Numero del nodo a buscar...", "Buscando Nodo", JOptionPane.QUESTION_MESSAGE));

                            if (elarbol.buscarNodo(elem) == null) {
                                JOptionPane.showMessageDialog(null, "El Nodo no esta", "!No encontrado¡", JOptionPane.INFORMATION_MESSAGE);

                            } else {
                                System.out.println("Nodo encontrado, el datos es" + elarbol.buscarNodo(elem));
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "El Arbol Esta Vacio", "!Cuidado¡", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if (!elarbol.estaVacio()) {
                            elem = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "ingrese el Numero del nodo a eliminar...", "Eliminando Nodo", JOptionPane.QUESTION_MESSAGE));

                            if (elarbol.eliminar(elem) == false) {
                                JOptionPane.showMessageDialog(null, "El Nodo no esta", "!No encontrado¡", JOptionPane.INFORMATION_MESSAGE);

                            } else {
                                JOptionPane.showMessageDialog(null, "El Nodo a sido eliminado", "!Nodo eliminado¡", JOptionPane.INFORMATION_MESSAGE);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "El Arbol Esta Vacio", "!Cuidado¡", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 7:
                        if (!elarbol.estaVacio()) {
                            elem = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "ingrese el Numero del nodo a buscar...", "Buscando Nodo", JOptionPane.QUESTION_MESSAGE));

                            if (elarbol.buscarNodo(elem) == null) {
                                JOptionPane.showMessageDialog(null, "El Nodo no esta", "!No encontrado¡", JOptionPane.INFORMATION_MESSAGE);

                            } else {
                                System.out.println("Nodo encontrado, el datos es");
                            mod = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "ingrese el Numero del nodo a modificar...", "Modificando Nodo", JOptionPane.QUESTION_MESSAGE));
                                    elem = mod;
                            
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "El Arbol Esta Vacio", "!Cuidado¡", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 8:
                        JOptionPane.showMessageDialog(null, "Ahi salio", "Salio!!!!", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "WTF!!!!", "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);

                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }

        } while (opcion != 8);

    }

}
