package com.example.checkmate;

public class TodoItem {
    private String folderName;
    private String todoName;
    private String date;

    public TodoItem(){

    }

    public TodoItem(String folderName, String todoName, String date){
        this.folderName = folderName;
        this.todoName = todoName;
        this.date = date;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
