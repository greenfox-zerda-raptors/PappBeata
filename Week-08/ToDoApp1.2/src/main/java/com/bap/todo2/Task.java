package com.bap.todo2;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.sql.Date;
import java.sql.SQLException;

@DatabaseTable(tableName = "task")
public class Task {

    @DatabaseField(generatedId = true)
    int taskId;
    @DatabaseField(canBeNull = false)
    String taskName;
    @DatabaseField
    boolean completed = false;
    // @DatabaseField
    Date dueDate;
    @DatabaseField(useGetSet = true)
    int priority;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void SetDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Task(String taskName, int priority, Date dueDate) {
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public Task(String taskName) {
        this.taskName = taskName;
        this.priority = 3;
    }

    public Task() {
    }

    public String toString() {
        return String.format("%d %s %s  prio %d", taskId, toStringCompleted(), taskName, priority);
    }

    public String toStringCompleted() {
        if (completed) {
            return "[x]";
        } else {
            return "[ ]";
        }
    }

    public void createTaskIfNotExists(Dao<Task, String> taskDao, Task tsk) throws SQLException {
        if (taskDao.queryForId(tsk.getTaskName()) == null) {
            taskDao.create(tsk);
        }
    }
}

