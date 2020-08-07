package site.abrahamprakasa;

public class Smartphone extends Gadget {
    public static final String OS_ANDROID = "Android";
    public static final String OS_IOS = "iOS";
    public static final String OS_WINDOWSPHONE = "Windows Phone";

    private boolean touchscreen;
    private String os;

    String listFitur(){
        return "4g,NFC,Bluetooth,Touchscreen,audio";
    }

    //polymorphism
//    public Smartphone(){
//
//    }

    public Smartphone(String brand, int harga, boolean touchscreen, String os, String seri) {
        super.setBrand(brand);
        super.setHarga(harga);
        super.setSeri(seri);
        super.setKategori("Communication");
        this.touchscreen = touchscreen;
        this.os = os;
    }

    //overriding dari kelas gadget
    String brandDanSeri(){
        return "brand dan seri dari child class";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Smartphone: touchscreen=" + touchscreen +
                ", os='" + os + '\'' + hargaJualBekas();
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
