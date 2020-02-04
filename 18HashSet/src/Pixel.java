public class Pixel implements Comparable<Pixel>{
    int x,y;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pixel pixel = (Pixel) o;
        return x == pixel.x &&
                y == pixel.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }

    @Override
    public int compareTo(Pixel o) { // safety valve
        int result = Integer.compare(x,o.x);
        if(result !=0) return result;
        return Integer.compare(y,o.y);
    }
}
