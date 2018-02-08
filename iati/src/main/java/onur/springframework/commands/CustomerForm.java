package onur.springframework.commands;

/**
 * Created by jt on 1/10/17.
 */
public class CustomerForm {
    private Long id;
    private String adSoyad;
    private String tarih;
    private String isyeri;
    private String telefon;
    private String adres;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getTarih() {
		return tarih;
	}

	public void setTarih(String tarih) {
		this.tarih = tarih;
	}

	public String getIsyeri() {
		return isyeri;
	}

	public void setIsyeri(String isyeri) {
		this.isyeri = isyeri;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

    
}
