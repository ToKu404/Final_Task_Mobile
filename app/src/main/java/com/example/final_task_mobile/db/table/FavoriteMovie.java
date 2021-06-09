package com.example.final_task_mobile.db.table;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "favorites_movie")
public class FavoriteMovie implements Serializable {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @PrimaryKey
    private int id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "img_path")
    private String imgPath;

    public FavoriteMovie(){}

    public FavoriteMovie(int id){
        this.id = id;
    }
    public FavoriteMovie(int id, String title, String imgPath){
        this.id = id;
        this.title = title;
        this.imgPath = imgPath;
    }


}
