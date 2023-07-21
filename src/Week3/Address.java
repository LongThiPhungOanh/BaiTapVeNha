package Week3;
public class Address {
    String province;
    String district;
    String commune;
    int houseNumber;
    public Address(String province, String district, String commune, int houseNumber) {
        this.province = province;
        this.district = district;
        this.commune = commune;
        this.houseNumber = houseNumber;
    }
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address " +
                "province = '" + province + '\'' +
                ", district = '" + district + '\'' +
                ", commune = '" + commune + '\'' +
                ", houseNumber = " + houseNumber ;
    }
}
