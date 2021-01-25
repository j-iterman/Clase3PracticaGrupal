package PracticaGrupal;

public class SortUtil {

    public static <T> Precedable<T>[] ordenar(Precedable<T>[] arr){

        Precedable<T>[] arrAux = arr.clone();

        int largo = arrAux.length;

        for (int i = 0; i < largo; i++){
            for (int j = 0; j < largo-1; j++){
                if (arrAux[j].precedeA((T)arrAux[j+1]) < 0){
                    Precedable<T> temp = arrAux[j];
                    arrAux[j] = arrAux[j+1];
                    arrAux[j+1] = temp;
                }
            }
        }

        return arrAux;
    }

}
