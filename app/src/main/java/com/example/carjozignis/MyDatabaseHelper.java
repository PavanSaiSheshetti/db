package com.example.carjozignis;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    private Context context;
    private static final String DATABASE_NAME = "details.db";
    private static final int DATABASE_VERSION =1;
    private static final String TABLE_NAME = "details_table";
    private static final String COL0 = "id";
    private static final String COL1 = "Vehicle_Name";
    private static final String COL2 = "Vehicle_Number";
    private static final String COL3 = "Date_of_pickup";
    private static final String COL4 = "Odometer";
    private static final String COL5 = "Additional_Problems";
    private static final String COL6 = "Fuel_Reading";
    private static final String COL7 = "Fuel_type";
    private static final String COL8 = "Belongings_in_car";
    private static final String COL9 = "Dents/Scratches";
    private static final String COL10 = "Estimate";
    private static final String COL11 = "Tyre_Condition";
    private static final String COL12 = "Paint_Condition";
    private static final String COL13 = "Engine_oil_Condition";
    private static final String COL14 = "Coolant_Condition";
    private static final String COL15 = "list_of_items";
    private static final String COL16 = "InspectedBy";
    private static final String COL17 = "Pickup_Executive";
    private static final String COL18 = "Customer_Sign";

    public MyDatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query=
                "CREATE TABLE " + TABLE_NAME + " (" + COL0 + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL1 + " TEXT, " +
                        COL2 + " INTEGER, " + COL3 + " INTEGER, " + COL4 + " INTEGER, " +
                        COL5 + " TEXT, " + COL6 + " INTEGER, " + COL7 + " TEXT, " + COL8 + " TEXT, " + COL9 + " TEXT, " +
                        COL10 + " TEXT, " + COL11 + " TEXT, " + COL12 + " TEXT, " + COL13 + " TEXT, " + COL14 + " TEXT, " +
                        COL15 + " TEXT, " + COL16 + " TEXT, " + COL17 + " TEXT, " + COL18 + " TEXT);";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    void addService(String vehicle, int number, int date, int odometer, String problems, int fuel, String fuel_type, String
            belongings, String scratches, String Estimate , String tyre, String paint, String engine, String coolant,
                    String list, String inspect, String Executive, String sign){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COL1, vehicle);
        cv.put(COL2, number);
        cv.put(COL3, date);
        cv.put(COL4, odometer);
        cv.put(COL5, problems);
        cv.put(COL6, fuel);
        cv.put(COL7, fuel_type);
        cv.put(COL8, belongings);
        cv.put(COL9, scratches);
        cv.put(COL10, Estimate);
        cv.put(COL11, tyre);
        cv.put(COL12, paint);
        cv.put(COL13, engine);
        cv.put(COL14, coolant);
        cv.put(COL15, list);
        cv.put(COL16, inspect);
        cv.put(COL17, Executive);
        cv.put(COL18, sign);
        long result = db.insert(TABLE_NAME,null,cv);
        if(result == -1){
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "Added Successfully", Toast.LENGTH_SHORT).show();
        }
    }
}
