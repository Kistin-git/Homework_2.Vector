import java.util.Objects;

public class Vector {
    private double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    public double getModule() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public Vector getAddition(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector getSubtraction(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    public double getScalar(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector getVector(Vector vector) {
        return new Vector(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }

    public double angle(Vector vector) {
        return (x * vector.x + y * vector.y + z * vector.z)/Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2))/Math.sqrt(Math.pow(vector.x, 2) + Math.pow(vector.y, 2) + Math.pow(vector.z, 2));
    }

    @Override
    public String toString() {
        return "{" + x + "; " + y + "; " + z + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Double.compare(vector.x, x) == 0 && Double.compare(vector.y, y) == 0 && Double.compare(vector.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}