package com.company.todo;

public class Entry {

        public static int count = 0;
        public static int priority;
        public String notes;

    public Entry( int priority, String notes){
            this.priority = priority;
            this.notes = notes;
            count++;

        }
    }
