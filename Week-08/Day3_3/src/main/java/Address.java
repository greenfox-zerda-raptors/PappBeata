import com.j256.ormlite.field.DatabaseField;

/**
 * Created by Papp Beata Andrea on 14.12.2016.
 */
public class Address {

    @DatabaseField(generatedId = true)
    private String addressId;
    @DatabaseField
    private String street;
    @DatabaseField
    private String city;
    @DatabaseField
    private String postalCode;
    @DatabaseField
    private String country;

    @Override
    public String toString() {
        return "Address = {" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
