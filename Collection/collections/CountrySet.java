package collections;

import java.util.HashSet;
import java.util.Iterator;

public class CountrySet {

    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {

        Iterator<String> it = H1.iterator();

        while (it.hasNext()) {
            String s = it.next();
            if (s.equals(countryName)) {
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        CountrySet obj = new CountrySet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("Canada"));
    }
}
