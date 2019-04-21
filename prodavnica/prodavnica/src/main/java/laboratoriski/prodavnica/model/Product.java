package laboratoriski.prodavnica.model;

import java.util.Locale;

public class Product {
    private long id;
    private String ime;
    private String opis;
    private String link;
    private Category kategorija;
    private Manufacturer proizvoditel;

    public Product(long id, String ime, String opis, String link, Category kategorija, Manufacturer proizvoditel) {
        this.id = id;
        this.ime = ime;
        this.opis = opis;
        this.link = link;
        this.kategorija = kategorija;
        this.proizvoditel = proizvoditel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Category getKategorija() {
        return kategorija;
    }

    public void setKategorija(Category kategorija) {
        this.kategorija = kategorija;
    }

    public Manufacturer getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(Manufacturer proizvoditel) {
        this.proizvoditel = proizvoditel;
    }
}
