package com.example.roomdatabase04092019;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Sinhvien.class},version = 1)
public abstract class SinhvienDatabase extends RoomDatabase {

    private static SinhvienDatabase sinhvienDatabase = null;

    public abstract SinhvinDao sinhvinDao();

    public static SinhvienDatabase getInstance(Context context) {
        if (sinhvienDatabase == null) {
            sinhvienDatabase = Room.databaseBuilder(
                    context,
                    SinhvienDatabase.class,
                    "quanlysinhvien")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return sinhvienDatabase;
    }
}
