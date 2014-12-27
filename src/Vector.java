
public class Vector {

    private float[] v, menoresOrdenado;
    private int posicion;

    public Vector(float[] vector) {
        v = vector;
    }

    void establecerPosicion(int posicion) {
        this.posicion = posicion;
    }

    void establecerMenoresOrdenado(float[] vector) {
        menoresOrdenado = vector;
    }

    public int dameTamaño() {
        return v.length;
    }

    public float[] dameArray() {
        return v;
    }

    public int damePosicion() {
        return posicion;
    }

    boolean contiene(float numero) {
        for (float w : v) {
            if (w == numero) {
                return true;
            }
        }
        return false;
    }

    public String mostrarVector(boolean menores, boolean ordenado) {
        if (menores) {
            if (ordenado) {
                return mostrarVector(menoresOrdenado, posicion);
            } else {
                return mostrarVector(v, posicion);
            }
        } else {
            return mostrarVector(v, v.length);
        }
    }

    private String mostrarVector(float[] vector, int lsup) {
        StringBuilder stringResult = new StringBuilder();

        for (int i = 0; i < lsup; i++) {
            if (i < lsup - 1) {
                stringResult.append(vector[i]).append(", ");
            } else {
                stringResult.append(vector[i]);
            }
        }

        return stringResult.toString();
    }

}
