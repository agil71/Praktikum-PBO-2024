package Produk;

public class Diamond extends AbstractStok {
    private String IdDiamond;
    private String JenisDiamond;

    public Diamond(String Nama, int Harga, String idDiamond, String jenisDiamond) {
        super(Nama, Harga);
        this.IdDiamond = idDiamond;
        this.JenisDiamond = jenisDiamond;
    }

    public String getIdDiamond() {
        return IdDiamond;
    }

    public String getJenisDiamond() {
        return JenisDiamond;
    }

    public void setIdDiamond(String idDiamond) {
        IdDiamond = idDiamond;
    }

    public void setJenisDiamond(String jenisDiamond) {
        JenisDiamond = jenisDiamond;
    }

    public void setJenisDiamond(String jenisDiamond, int tambahan) {
        JenisDiamond = jenisDiamond + " " + tambahan;
    }
}
