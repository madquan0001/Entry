package com.company.todo;

public class ToDoList {

    Entry[] list = new Entry[];
    public int lenght = 0;

    public void showTodoList(Entry[] list) {
        for (int len = 0; len < list.length; len++) {
            System.out.println(list[len].priority + list[len].notes);
        }
    }

    public void sortList() {

    }

    public boolean removeEntry(int id) {
        Entry entryTemp = new Entry();
        for (int len = 0; len < list.length; len++) {
            if (list[len].priority == id) {
                for (int row = len; row < list.length; row++) {
                    if (row == list.length - 1)
                        break;
                    list[row].priority = list[row + 1].priority;
                    list[row].notes = list[row + 1].notes;
                }
                lenght--;
                return true;
            } else
                return false;
        }

    }

    public void addEntry(Entry entry) {
        list[lenght].priority = entry.priority;
        list[lenght].notes = entry.notes;
        lenght++;
    }

    public void getEntryById(int id) {
        for (int len = 0; len < list.length; len++) {
            if (list[len].priority == id) {
                System.out.println(list[len].priority + list[len].notes);
            } else
                System.out.println("No entry!");
        }
    }
}
