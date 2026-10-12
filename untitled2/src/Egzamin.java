import java.time.LocalDate;
import java.time.LocalTime;

public class Egzamin implements AutoCloseable{

    public String nazwaPrzedmiotu;
    private LocalDate data;
    private LocalTime godzinaRozpoczecia;
    private LocalTime godzinaZakonczenia;

    public void start(LocalTime godzina_rozpoczecia){
        this.godzinaRozpoczecia=godzina_rozpoczecia;
    }

    public void stop(){
        this.godzinaZakonczenia=this.godzinaRozpoczecia.plusMinutes(120);
    }

    public Egzamin(String nazwa_przedmiotu, LocalDate data) {
        this.nazwaPrzedmiotu = nazwa_przedmiotu;
        this.data = data;
    }

    public String getNazwa_przedmiotu() {
        return nazwaPrzedmiotu;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getGodzina_rozpoczecia() {
        return godzinaRozpoczecia;
    }

    public LocalTime getGodzina_zakonczenia() {
        return godzinaZakonczenia;
    }
    public void ustawGodzineZakonczenia(int minuty) {
        this.godzinaZakonczenia =
                this.godzinaRozpoczecia.plusMinutes(minuty);
    }

    @Override
    public void close() {
        this.nazwaPrzedmiotu = null;
        this.data = null;
        this.godzinaRozpoczecia = null;
        this.godzinaZakonczenia = null;
        System.out.println("Zasoby zostały zwolnione.");
    }


}
class Egz_praktyczny extends Egzamin{
    private String forma;
    private String opis;

    public Egz_praktyczny(String nazwaPrzedmiotu, LocalDate data, String forma, String opis) {
        super(nazwaPrzedmiotu, data);
        this.forma = forma;
        this.opis = opis;
    }

    @Override
    public void stop(){
        ustawGodzineZakonczenia(150);
    }

    public String getForma() {
        return forma;
    }

    public String getOpis() {
        return opis;
    }

}

