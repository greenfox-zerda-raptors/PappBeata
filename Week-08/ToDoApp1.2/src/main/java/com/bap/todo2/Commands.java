package com.bap.todo2;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.UpdateBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

import static javafx.scene.input.KeyCode.T;

public class Commands {

    Dao<Task, String> taskDao;
    Tasklist objTasklist;
    Task nextToDo;
    UpdateBuilder<Task, String> updateBuilder;

    public Commands() throws SQLException {

        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/todo?user=root&password=asd&serverTimezone=UTC";
        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);
        taskDao = DaoManager.createDao(connectionSource, Task.class);
        TableUtils.createTableIfNotExists(connectionSource, Task.class);
        updateBuilder = taskDao.updateBuilder();

        objTasklist = new Tasklist();
    }

    public void addItem(String inp) throws SQLException {
        nextToDo = new Task(inp);
        taskDao.create(nextToDo);
        objTasklist.add(nextToDo);
    }

    public void setPrio(int inp) throws SQLException {
        nextToDo.setPriority(inp);

        taskDao.update(PreparedUpdate < T > preparedUpdate);
        //PreparedUpdate UPDATE task SET priority=1 WHERE taskId=9;
    }

    public void listItems() throws SQLException {
        for (Task i : objTasklist) {
            System.out.println(i.toString());
        }
    }

    public void removeItem(String inp) throws SQLException {
        objTasklist.remove(Integer.parseInt(inp) - 1);
        System.out.println("Task " + inp + " removed");
    }

    public void complete(String inp) throws SQLException {
        objTasklist.get(Integer.parseInt(inp) - 1).completed = true;
        System.out.println("Task " + inp + " completed");
    }

    public void help() {
        System.out.println("Available commands:\n");
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

}


