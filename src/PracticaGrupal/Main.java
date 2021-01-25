package PracticaGrupal;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Persona[] pers = {new Persona("Pablo", 10),
                new Persona("Josefina", 3),
                new Persona("Cristian", 11),
                new Persona("Alberto", 4),
                new Persona("Victoria", 1)
        };

        Persona[] persOrdenado = (Persona[])SortUtil.ordenar(pers);

        System.out.println(Arrays.toString(persOrdenado));

    }
}
