package com.example.point.myapplication;

/**
 * Created by POINT on 2/15/2018.
 */

public class DataModel {

    private String Username;
    private String Usermsg;
    private String Usertime;
    DataModel(String Username, String Usermsg, String Usertime) {
        this.Username= Username;
        this.Usermsg= Usermsg;
        this.Usertime= Usertime;
    }
    public String getUsername(){
        return Username;
    }
    public String getUsermsg(){

        return Usermsg;
    }
    public String getUsertime(){
        return Usertime;
    }
}

