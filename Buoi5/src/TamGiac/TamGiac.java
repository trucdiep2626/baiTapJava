package TamGiac;

public class TamGiac {
    private float a;
    private float b;
    private float c;

    public TamGiac() {
    }

    public TamGiac(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    public float ChuVi()
    {
        return a+b+c;
    }
}
