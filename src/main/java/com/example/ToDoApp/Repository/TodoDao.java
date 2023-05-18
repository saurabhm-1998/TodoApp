package com.example.ToDoApp.Repository;

import com.example.ToDoApp.Model.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoDao {

    private List<Todo> todoList;//data source for all our todos

    public TodoDao()
    {
        todoList = new ArrayList<>() ;
        //not needed ...done for testing
        todoList.add(new Todo("0","Dummy Todo for Testing",true));

    }

    public List<Todo> getTodosFromDataSource()
    {
        return todoList;
    }

    public boolean save(Todo todo)
    {
        todoList.add(todo);//mock Database call
        return true;
    }

    public boolean remove(Todo todo)
    {
        todoList.remove(todo);//mock a database
        return true;
    }

    public boolean update(String id, boolean status)
    {
        boolean updateStatus = false;
        for(Todo todo : todoList)
        {
            if(todo.getId().equals(id))
            {

                remove(todo);

                todo.setTodoStatus(status);
                save(todo);

                return true;

            }

        }
        return false;
    }
}
