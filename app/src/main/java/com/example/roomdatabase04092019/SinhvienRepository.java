package com.example.roomdatabase04092019;

import android.content.Context;

import java.util.ArrayList;

public class SinhvienRespository {

    private  static  SinhvienRespository instance = null;
    private SinhvinDao sinhvinDao;

    public SinhvienRespository(Context context){
            SinhvienDatabase sinhvienDatabase = SinhvienDatabase.getInstance(context);
            sinhvinDao = sinhvienDatabase.sinhvinDao();
    }
    public  static  SinhvienRespository getInstance(Context context){
        if(instance == null){
            instance = new SinhvienRespository(context);
        }
        return instance;
    }
    public ArrayList<Sinhvien> getAllSinhVien(){
        return  sinhvinDao.getAllSinhvien();
    }

}
