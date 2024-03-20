package Produk;

public class Akun {
    private String idAkun;
    private String namaGame;
    private String rankAkun;
    private String platformAkun;
    private int harga;

    public Akun(String idAkun, String namaGame, String rankAkun, String platformAkun, int harga) {
        this.idAkun = idAkun;
        this.namaGame = namaGame;
        this.rankAkun = rankAkun;
        this.platformAkun = platformAkun;
        this.harga = harga;
    }
    public String getIdAkun() {
        return idAkun;
    }

    public void setIdAkun(String idAkun) {
        this.idAkun = idAkun;
    }

    public String getNamaGame() {
        return namaGame;
    }

    public void setNamaGame(String namaGame) {
        this.namaGame = namaGame;
    }

    public String getRankAkun() {
        return rankAkun;
    }

    public void setRankAkun(String rankAkun) {
        this.rankAkun = rankAkun;
    }

    public String getPlatformAkun() {
        return platformAkun;
    }

    public void setPlatformAkun(String platformAkun) {
        this.platformAkun = platformAkun;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}