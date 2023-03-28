public class Main {
    public static void main(String[] args) {
        Film[] movie = { //Array di Film
                //Creazione Oggetti nelle celle dell'array
                new Film("La bestia e la bella", "Roberto", "Horror", 4090, 200),
                new Film("Titanico", "DiCapriolo", "Per Bambini",1912,160),
                new Film("Injection", "Paolino", "Thriller/Noir",1500, 2077),
        };
        for (Film film : movie) {
            System.out.println(
                    "Titolo: " + film.getTitolo() +
                            " - Regista: " + film.getRegista() +
                            " - Genere: " + film.getGenere() +
                            " - Anno: " + film.getAnno() +
                            " - Durata: " + film.getDurata()
            );
        }
        System.out.println("Comparazione regista: " + movie[1].compareRegista("DiCapriolo")); //Compara con DiCapriolo
        System.out.println("Comparazione anno: " + movie[2].compareAnno(2076)); //Compara con 1500
    }
}