import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Workshop02 {
    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/workshop02?user=root&password=asd&serverTimezone=UTC";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account.class);

        Dao<Account, String> accountDao = DaoManager.createDao(connectionSource, Account.class);

        ArrayList<String> accounts = new ArrayList<String>(Arrays.asList("Iron Man", "Wolverine", "Hulk", "Loki"));

        Account account = new Account("Captain America", "uejnsd632**234.");
        createAccountIfNotExists(accountDao, account);

        for (String item : accounts) {
            createAccountIfNotExists(accountDao, new Account(item, "1"));
        }

        account = accountDao.queryForId("Captain America");
        System.out.println("Account: " + account.toString());

        try {
            QueryBuilder<Account, String> queryBuilder = accountDao.queryBuilder();
            System.out.println(accountDao.queryForAll());
            List<Account> accountsList = accountDao.queryBuilder().orderBy("name", true).query();
            for (Account item : accountsList) {
                System.out.println(item);
            }
        } catch (
                SQLException e)

        {
            e.printStackTrace();
        }
    }

    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if (accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }
}