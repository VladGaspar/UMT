public class Coordinates {

    private int x;
    private int y;

    Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    // suprascriem metoda equals() deoarece este folosita in metoda
    // contains() din ArrayList
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates pair = (Coordinates) o;
        return x == pair.x && y == pair.y;
    }

}
