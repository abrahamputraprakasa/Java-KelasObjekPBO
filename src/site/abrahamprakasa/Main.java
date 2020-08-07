package site.abrahamprakasa;

public class Main {


    public static void main(String[] args) {
	// write your code here


        //declaration   instantiation initialization
        Smartphone a = new Smartphone("Samsung", 2800000, true, Smartphone.OS_ANDROID, "A21s");
        Smartphone b = new Smartphone("Apple", 8000000, true, Smartphone.OS_IOS, "Iphone SE 2020");

        Smartwatch c = new Smartwatch( "MIUI", "button", true, "Xiaomi", 200000, "Mi Band 2");
        Smartwatch d = new Smartwatch( "AndroidWear", "touchscreen", false, "Asus", 3000000, "Zenwatch 3");

        System.out.println("Smartphone A:" + a.listFitur());
        System.out.println("Smartphone B:" + b.listFitur());
        System.out.println("Smartwatch C:" + c.listFitur());
        System.out.println("Smartwatch D:" + d.listFitur());



//        Gadget g2 = new Smartphone("Samsung", 2800000, true, Smartphone.OS_ANDROID, "A21s");
//        System.out.println(g2.brandDanSeri());

    }
}
