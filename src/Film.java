public class Film {
    private String titolo, regista, genere;
    private int anno, durata;

    //Costruttori
    Film(){
        //Default
    }
    Film(String titolo, String regista, String genere, int anno, int durata){
        this.titolo = titolo;
        this.regista = regista;
        this.genere = genere;
        this.anno = anno;
        this.durata = durata;
    }

    //Setter
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public void setRegista(String regista){
        this.regista = regista;
    }
    public void setGenere(String genere){
        this.genere = genere;
    }
    public void setAnno(int anno){
        this.anno = anno;
    }
    public void setDurata(int durata){
        this.durata = durata;
    }

    //Getter
    public String getTitolo(){
        return titolo;
    }
    public String getRegista(){
        return  regista;
    }
    public String getGenere(){
        return  genere;
    }
    public int getAnno(){
        return  anno;
    }
    public int getDurata(){
        return  durata;
    }

    //Metodi
    public boolean compareRegista(String regista){
        if(this.regista.equals(regista)){
            return true;
        }
        else return false;
    }
    public boolean compareAnno(int anno){
        if(this.anno == anno){
            return true;
        }
        else return false;
    }
}