public class GeometryLab {
    public double f(double x, double y) {
        return x+y;
    }
    public double g(double x, double y) {
        return x-y;
    }
    public double h(double x, double y) {
        return x*y;
    }
    public double j(double x, double y) {
        return x/y;
    }
    public double k(double x, double y) {
        return x%y; 
    }
    public double m(double x, double y, double z) {
        return x+y-z;
    }
    public double triArea(double b, double h) {
        return (1.0/2.0) * b * h;
    }
    public double trapArea(double ba, double bb, double h) {
        return 0.5 * (ba + bb) * h;
    }
    public double rectArea(double b, double h) {
        return b*h;
    }
    public double circArea(double r) {
        return 3.14 * r * r;
    }
    public double paralArea(double b, double h) {
        return b*h;
    }
    public double pythHypotenuse(double a, double b) {
        return a*a+b*b;
    }
    public double triPrismVol(double b, double h, double w) {
        return triArea(b, h) * w;
    }
    public double rectPrismVol(double b, double h, double w) {
        return rectArea(b, h) * w;
    }
    public double rectPyramidVol(double b, double h, double w) {
        return (1.0/3.0) * rectArea(b, h) * w;
    }
    public double cylVol(double r, double h) {
        return circArea(r) * h;
    }
    public double sphereVol(double r) {
        return (4.0/3.0) * circArea(r) * r;
    }
    public double coneVol(double r, double h) {
        return (1.0/3.0) * circArea(r) * h; 
    }
    public double sphereSurfArea(double r) {
        return 4 * circArea(r);
    }
    public double cylSurfArea(double r, double h) {
        return (2 * circArea(r)) + (2 * 3.14 * r * h);
    }
    public double rectPrismSurfArea(double b, double h, double w) {
        return 2*b*h + 2*b*w + 2*h*w;
    }
}