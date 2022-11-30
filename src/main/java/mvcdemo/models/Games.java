package mvcdemo.models;

public class Games {

    private String gender;
    private String name;
    private String platform;
    private double price;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Games(String gender, String name, String platform, double price) {
        this.gender = gender;
        this.name = name;
        this.platform = platform;
        this.price = price;
    }
}
