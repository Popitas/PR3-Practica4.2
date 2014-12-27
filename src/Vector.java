
public class Vector {

    private final float[] v;
    private float[] menoresOrdenado;
    private int posicion;

    public Vector(float[] vector) {
        v = vector;
    }

    public void establecerPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void establecerMenoresOrdenado(float[] vector) {
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

    public String mostrarVectorOriginal() {
        StringBuilder stringResult = new StringBuilder();

        for (int i = 0; i < v.length; i++) {
            if (i < v.length - 1) {
                stringResult.append(v[i]).append(", ");
            } else {
                stringResult.append(v[i]);
            }
        }

        return stringResult.toString();
    }

    public String mostrarMenoresDescen() {
        StringBuilder stringResult = new StringBuilder();

        for (int i = menoresOrdenado.length - 1; i >= 0; i--) {
            if (i > 0) {
                stringResult.append(menoresOrdenado[i]).append(", ");
            } else {
                stringResult.append(menoresOrdenado[i]);
            }
        }

        return stringResult.toString();
    }

    public String mostrarMenoresAscen() {
        StringBuilder stringResult = new StringBuilder();

        for (int i = 0; i < menoresOrdenado.length; i++) {
            if (i < menoresOrdenado.length - 1) {
                stringResult.append(menoresOrdenado[i]).append(", ");
            } else {
                stringResult.append(menoresOrdenado[i]);
            }
        }
        
        return stringResult.toString();
    }

}
