package com.example.movie.model.local;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Cast implements Parcelable {

    @SerializedName("name")
    private String name;
    @SerializedName("character")
    private String role;
    @SerializedName("profile_path")
    private String img;

    public Cast() {

    }

    public Cast(String name, String role, String imgurl) {
        this.name = name;
        this.role = role;
        this.img = imgurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getImg_url() {
        return img;
    }

    public void setImgurl(String imgurl) {
        this.img = imgurl;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.role);
        dest.writeString(this.img);
    }

    private Cast(Parcel in) {
        this.name = in.readString();
        this.role = in.readString();
        this.img = in.readString();
    }

    public static final Creator<Cast> CREATOR = new Creator<Cast>() {
        @Override
        public Cast createFromParcel(Parcel source) {
            return new Cast(source);
        }

        @Override
        public Cast[] newArray(int size) {
            return new Cast[size];
        }
    };
}
