import java.util.List;

public class Rectangle {

    public static int findRectangles(List<Coordinates> coordinatesList) {

        // ne cream o variablia pentru a stoca numarul de dreptunghiuri
        int numberOfRectangles = 0;

        // parcurgem lista de coordonate
        for (int i = 0; i < coordinatesList.size(); i++) {
            for (int j = i + 1; j < coordinatesList.size(); j++) {

                // comparam un set de coordonate cu un altul la fiecare iteratie
                Coordinates a = coordinatesList.get(i);
                Coordinates c = coordinatesList.get(j);

                // daca coordonata x a unei coordonate este diferita de coordonata x al alteia si
                // daca coordonata y a unei coordonate este diferita de coordonata y al alteia
                // exista posibilitatea ca cele 2 puncte sa fie o diagonala intr-un dreptunghi
                if (a.getX() != c.getX() && a.getY() != c.getY()) {

                    // ne cream 2 coordonate noi bazate pe cele descoperite anterior folosindu-ne de
                    // coordonatele x si y
                    // A(x,y)       B(x,y)
                    //   *----------*
                    //   | \        |
                    //   |  \       |
                    //   |   \      |         |  B.x = C.x
                    //   |    \     |         |  B.y = A.y
                    //   |     \    |    =>   |  D.x = A.x
                    //   |      \   |         |  D.y = C.y
                    //   |       \  |
                    //   |        \ |
                    //   *----------*
                    // D(x,y)       C(x,y)
                    Coordinates b = new Coordinates(c.getX(), a.getY());
                    Coordinates d = new Coordinates(a.getX(), c.getY());

                    // daca coordonatele create anterior exista in lista de coordonate putem sa formam
                    // un dreptunghi
                    if (coordinatesList.contains(b) && coordinatesList.contains(d)) {
                        numberOfRectangles++;
                    }
                }
            }
        }
        // impartim numarul final de dreptunghiuri gasite la 2 deoarece programul se
        // bazeaza pe lucrul cu diagonalele si cum fiecare dreptunghi are cate 2 o sa
        // fie numarat de 2 ori
        return numberOfRectangles / 2;
    }

}
