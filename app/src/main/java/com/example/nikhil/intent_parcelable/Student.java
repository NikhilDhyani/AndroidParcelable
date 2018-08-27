package com.example.nikhil.intent_parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by NIKHIL on 26-08-2018.
 */

public class Student implements Parcelable {

    private Integer rollno;
    private String name;
    private Integer age;



    protected Student(Parcel in) {

        age = in.readInt();
        name  = in.readString();
        rollno = in.readInt();


    }

    public Student(Integer age, String name, Integer rollno) {
        this.age = age;
        this.name = name;
        this.rollno = rollno;
    }


    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };




    @Override
    public int describeContents() {
        return 0;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static Creator<Student> getCREATOR() {
        return CREATOR;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeInt(age);
        parcel.writeString(name);
        parcel.writeInt(rollno);


    }
}
