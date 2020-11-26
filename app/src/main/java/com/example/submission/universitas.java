package com.example.submission;

import android.os.Parcel;
import android.os.Parcelable;

public class universitas implements Parcelable {
    private String Name;
    private String detail;
    private int photo;

    protected universitas(Parcel in) {
        Name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<universitas> CREATOR = new Creator<universitas>() {
        @Override
        public universitas createFromParcel(Parcel in) {
            return new universitas(in);
        }

        @Override
        public universitas[] newArray(int size) {
            return new universitas[size];
        }
    };

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Name);
        parcel.writeString(detail);
        parcel.writeInt(photo);
    }


    public universitas() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }
}


