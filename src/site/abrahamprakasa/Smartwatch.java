package site.abrahamprakasa;

public class Smartwatch extends Gadget{
    private String os;
    private String access;
    private boolean heartrate;

    public String getOs() {
        return os;
    }

    public Smartwatch(String os, String access, boolean heartrate, String brand, int harga, String seri) {
        super.setBrand(brand);
        super.setHarga(harga);
        super.setSeri(seri);
        super.setKategori("Lifestyle/Productivity");
        this.os = os;
        this.access = access;
        this.heartrate = heartrate;
    }

    @Override
    String listFitur() {
        return "getar,gyroscope,audio";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Smartwatch: os='" + os + '\'' +
                ", access='" + access + '\'' +
                ", heartrate=" + heartrate +
                '}' + hargaJualBekas(Gadget.KONDISI_RUSAK);
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public boolean isHeartrate() {
        return heartrate;
    }

    public void setHeartrate(boolean heartrate) {
        this.heartrate = heartrate;
    }
}
