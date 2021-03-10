public class Point
{
    private double x;
    private double y;
    private int z;

    public Point(double x, double y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }
}

