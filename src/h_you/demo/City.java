package h_you.demo;

public class City {
    public String name;
    public Double latitude;
    public Double longitude;

    public static void main(String[] args) {
        City ct = new City();
        ct.name = "beijing";
        ct.latitude = 39.903;
        ct.longitude = 116.401;
        System.out.println(ct.name);
        System.out.println("location: " + ct.latitude + ", " + ct.longitude);
    }
}
