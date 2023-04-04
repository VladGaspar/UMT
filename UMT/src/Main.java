import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Coordinates> list = new ArrayList<>();

        list.add(new Coordinates(1,1));
        list.add(new Coordinates(1,3));
        list.add(new Coordinates(2,1));
        list.add(new Coordinates(2,3));
        list.add(new Coordinates(3,1));
        list.add(new Coordinates(3,3));

        System.out.println(Rectangle.findRectangles(list));
    }
}