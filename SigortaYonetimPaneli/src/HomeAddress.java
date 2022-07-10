public class HomeAddress implements Adress {
    private int addressId;
    private String city;
    private String district;
    private String street;

    public HomeAddress(int addressId, String city, String district, String street) {
        this.addressId = addressId;
        this.city = city;
        this.district = district;
        this.street = street;
    }
    public  HomeAddress(){

    }

    @Override
    public void adressInfo() {
        System.out.println("Bina No : " + this.addressId + " Sehir : " + this.city + " Semt : " + this.district + " Sokak : " + this.street);
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
