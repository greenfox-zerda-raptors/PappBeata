import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "accounts")
public class Account {

    @DatabaseField(id = true)
    private String name;
    @DatabaseField
    private String password;

    @DatabaseField(foreignAutoCreate = true)
    private String addressId;


    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return name;
    }

    public Account() {
    }
}
