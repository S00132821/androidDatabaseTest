package com.example.maart.androiddatabaselearn;

/**
 * Created by maart on 24/08/2016.
 */
public class TaskDbSchema {

    public static final class TaskTable{
        public static final String name = "tasks";

        public static final class Cols {

            public static final String ID = "id";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";

        }
    }
}
