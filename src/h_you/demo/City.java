package h_you.demo;

public class City {
    private String name;
    private Double latitude;
    private Double longitude;

    // 属性を取得
    public String getName() {
        return this.name;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    // 構造方法
    public City(String name, Double latitude, Double longitude) {
        if (name == "shanghai") {
            throw new IllegalArgumentException(name + " is not support.");
        } else if(name == null ||name.isBlank()) {
            this.name = defaultName();
        } else {
            this.name = name;
        }
        this.latitude = latitude;
        this.longitude = longitude;
    }


    private String defaultName() {
        return "beijing";
    }

    public static void main(String[] args) {
        City ct = new City("", 39.903, 116.401);
        System.out.println(ct.getName());
        System.out.println("location: " + ct.getLatitude() + ", " + ct.getLongitude());
    }
}
