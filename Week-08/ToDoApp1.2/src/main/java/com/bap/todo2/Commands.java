package com.bap.todo2;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.UpdateBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.List;

public class Commands {

    Dao<Task, String> taskDao;
    Dao<Users, String> usersDao;
    private UpdateBuilder<Task, String> updateBuilder;
    private UpdateBuilder<Users, String> updateBuilderU;
    Task nextToDo;


    public Commands() throws SQLException {

        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/todo?user=root&password=asd&serverTimezone=UTC";
        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);
        taskDao = DaoManager.createDao(connectionSource, Task.class);
        TableUtils.createTableIfNotExists(connectionSource, Task.class);
        updateBuilder = taskDao.updateBuilder();
        usersDao = DaoManager.createDao(connectionSource, Users.class);
        TableUtils.createTableIfNotExists(connectionSource, Users.class);
        updateBuilderU = usersDao.updateBuilder();
    }

    public void addItem(String inp) throws SQLException {
        nextToDo = new Task(inp);
        taskDao.create(nextToDo);
    }

    public void setPrio(int inp) throws SQLException {
        nextToDo.setPriority(inp);
        taskDao.update(nextToDo);
    }

    public void listItems() throws SQLException {
        queryTasks();
    }

    public void removeItem(String inp) throws SQLException {
        taskDao.delete(nextToDo);
        System.out.println("Task " + inp + " removed");
    }

    public void complete(String inp) throws SQLException {
        System.out.println("Task " + inp + " completed");
        taskDao.update(nextToDo);
    }

    public void help() {
        System.out.println("\nAvailable commands:\n");
        System.out.println("list : Lists all the tasks");
//        System.out.println("l shorthand for list\n");
        System.out.println("add : Adds a new task");
//        System.out.println("a shorthand for add\n");
        System.out.println("remove : Removes a task");
//        System.out.println("r shorthand for remove\n");
        System.out.println("complete : Completes a task");
//        System.out.println("c shorthand for complete\n");
        System.out.println("help : Print out this list again");
        System.out.println("q : quit program");
    }

    public void queryTasks() {
        try {
            QueryBuilder<Task, String> queryBuilder = taskDao.queryBuilder();
            List<Task> taskList = taskDao.queryBuilder().orderBy("taskId", true).query();
            for (Task item : taskList) {
                System.out.println(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean userExists(String userN) throws SQLException {
        QueryBuilder userQb = usersDao.queryBuilder();
        userQb.setCountOf(true);
        userQb.setWhere(userQb.where().eq("userName", userN));
        Long count = usersDao.countOf(userQb.prepare());
        //if (userQb.where().eq("userName", userN).query()..exists(userQb)) {
        if (count == 0) {
            usersDao.create(new Users(userN));
            return true;
        } else {
            return false;
        }
    }

    public boolean passwordCorrect(String password) {
        //    if (doesExist usersDao.queryBuilder(password)){
        return true;
      /*  } else{
            return false;
        }*/
    }
}
