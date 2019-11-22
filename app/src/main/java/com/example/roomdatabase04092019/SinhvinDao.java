package com.example.roomdatabase04092019;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface SinhvinDao {
    @Query("SELECT * FROM Sinhvien")
    ArrayList<Sinhvien> getAllSinhvien();
}
