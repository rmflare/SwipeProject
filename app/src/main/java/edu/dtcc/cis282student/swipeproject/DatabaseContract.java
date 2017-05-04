package edu.dtcc.cis282student.swipeproject;

import android.provider.BaseColumns;

final class DatabaseContract {

    static final int DATABASE_VERSION = 1;
    static final String DATABASE_NAME = "ProjectDatabase.db";

    private DatabaseContract() {}

    static class DatabaseEntry implements BaseColumns {
        static final String TABLE_NAME = "tableName";
        static final String COLUMN_NAME_COL1 = "column1";
        static final String COLUMN_NAME_COL2 = "column2";
        static final String COLUMN_NAME_COL3 = "column3";

        static final String CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + " (" + _ID +
                        " INTEGER PRIMARY KEY," + COLUMN_NAME_COL1 +
                        " TEXT," + COLUMN_NAME_COL2 +
                        " TEXT," + COLUMN_NAME_COL3 + " )";

        static final String DELETE_TABLE =
                "DROP TABLE IF EXISTS " + TABLE_NAME;
    }
}


