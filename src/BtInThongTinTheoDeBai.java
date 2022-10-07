public class BtInThongTinTheoDeBai {
    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + version);
        System.out.println("Java Home: " + "/opt/jdk/jdk1.8.0_71/jre");
        System.out.println("Java Vendor: " + System.getProperty("java.vm.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor"));
        System.out.println("Java Class Path: ");
    }
}
