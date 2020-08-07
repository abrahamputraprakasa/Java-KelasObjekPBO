package site.abrahamprakasa;

public abstract class Gadget {
    private String kategori;
    private String brand;
    private int harga;
    private String seri;

    protected static final int KONDISI_SEPERTIBARU = 1;
    protected static final int KONDISI_CACATBODY = 2;
    protected static final int KONDISI_RUSAK = 3;

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    String seriDanBrand(){
        return brand + seri;
    }


    //abstract method
    abstract String listFitur();

    //target overriding
    String brandDanSeri(){
        return brand + " " + seri;
    }

    //overloading atau static binding
    protected int hargaJualBekas(){
        return harga / 2;
    }

    protected int hargaJualBekas(int kondisi){
        int hargaJual;
        switch (kondisi){
            case KONDISI_SEPERTIBARU:
                hargaJual = harga - (harga * 20/100);
                break;
            case KONDISI_CACATBODY:
                hargaJual = harga - (harga * 60/100);
                break;
            case KONDISI_RUSAK:
                hargaJual = harga - (harga * 90/100);
                break;
            default:
                hargaJual = harga / 2;
                break;
        }
        return hargaJual;
    }

    @Override
    public String toString() {
        return "Gadget {" +
                "kategori='" + kategori + '\'' +
                ", brand='" + brand + '\'' +
                ", harga=" + harga +
                ", seri='" + seri + '\'' +
                "}  |  ";
    }
}
