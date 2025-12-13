package lab13;

import java.util.StringTokenizer;

public class toStringAdress {
    public String country;
    public String region;
    public String city;
    public String street;
    public String house;
    public String korp;
    public String apart;

    public void Splittt(String address) {
        String[] parts = address.split(",");
        if (parts.length != 7) throw new RuntimeException("Неверное количество элементов");
        country = parts[0].trim();
        region = parts[1].trim();
        city = parts[2].trim();
        street = parts[3].trim();
        house = parts[4].trim();
        korp = parts[5].trim();
        apart = parts[6].trim();
    }
    public void Ttokenizer(String address) {
        StringTokenizer st = new StringTokenizer(address, ",.;");
        if (st.countTokens() != 7) throw new RuntimeException("Не то количество элементов");
        country = st.nextToken().trim();
        region = st.nextToken().trim();
        city = st.nextToken().trim();
        street = st.nextToken().trim();
        house = st.nextToken().trim();
        korp = st.nextToken().trim();
        apart = st.nextToken().trim();
    }

    @Override
    public String toString() {
        return country + " " + region + " " + city + " " + street + " " + house + " " + korp + " " + apart;
    }
}
