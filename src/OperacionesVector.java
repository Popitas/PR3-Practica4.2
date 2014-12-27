
import java.util.Random;

public class OperacionesVector {

    static void buscaMenores(Vector vector, float valor) {
        float[] vecAux = obtenerVectorAuxiliar(vector.dameArray());
        vector.establecerPosicion(buscaMenoresRec(vecAux, 0, vector.dameTamaño() - 1, valor));
        vector.establecerMenoresOrdenado(obtenerMenoresOrdenado(vecAux, vector.damePosicion()));
    }

    private static int buscaMenoresRec(float[] vector, int linf, int lsup, float valor) {
        if (linf > lsup) {
            return 0;
        }

        if (linf == lsup && (valor == vector[linf])) {
            return linf;
        }

        int[] posiciones = division(vector, linf, lsup);
        
        if (valor == vector[posiciones[0] + 1]) {
            return posiciones[0] + 1;
        }
        
        if (vector[posiciones[0] + 1] > valor) {
            return buscaMenoresRec(vector, linf, posiciones[0], valor);
        } else {
            return buscaMenoresRec(vector, posiciones[1], lsup, valor);
        }

    }

    private static int[] division(float[] vector, int linf, int lsup) {
        int piv = obtenerPivote(linf, lsup);

        int pini = linf, pfin = lsup;

        float aux;
        while (pini <= pfin) {

            while (pini <= lsup && vector[pini] <= vector[piv]) {
                pini++;
            }

            while (pfin >= linf && vector[pfin] >= vector[piv]) {
                pfin--;
            }

            if (pini < pfin) {
                aux = vector[pini];
                vector[pini] = vector[pfin];
                vector[pfin] = aux;

                pini++;
                pfin--;
            }
        }

        if (pini < piv) {
            aux = vector[pini];
            vector[pini] = vector[piv];
            vector[piv] = aux;
            pini++;
        } else if (pfin > piv) {
            aux = vector[pfin];
            vector[pfin] = vector[piv];
            vector[piv] = aux;
            pfin--;
        }
        int[] v2 = {pfin, pini};
        return v2;
    }

    private static int obtenerPivote(int linf, int lsup) {
        java.util.Random random = new Random();

        while (true) {
            int aux = random.nextInt(lsup);

            if (aux >= linf) {
                return aux;
            }
        }
    }

    private static float[] obtenerMenoresOrdenado(float[] vector, int pos) {
        float[] resultado = new float[pos];

        System.arraycopy(vector, 0, resultado, 0, resultado.length);
        divintern(resultado, 0, resultado.length - 1);

        return resultado;
    }

    private static void divintern(float[] vec, int linf, int lsup) {
        if (linf < lsup - 1) {
            int[] posiciones = division(vec, linf, lsup);
            divintern(vec, linf, posiciones[0]);
            divintern(vec, posiciones[1], lsup);
        } else if (lsup - linf == 1) {
            if (vec[lsup] < vec[linf]) {
                float aux = vec[lsup];
                vec[lsup] = vec[linf];
                vec[linf] = aux;
            }
        }
    }

    private static float[] obtenerVectorAuxiliar(float[] array) {
        float[] copia = new float[array.length];
        System.arraycopy(array, 0, copia, 0, array.length);
        return copia;
    }
    
}
