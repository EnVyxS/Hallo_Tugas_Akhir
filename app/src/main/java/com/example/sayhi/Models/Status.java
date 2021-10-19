package com.example.sayhi.Models;

//kode ini merupakan Getter and setter
//kode ini digunkan untuk menampilkan foto yang akan di upload di status (dan akan tampil pada Firebase)
public class Status {
    private String imageUrl;
    private long timeStamp;

    public Status() {
    }

    public Status(String imageUrl, long timeStamp) {
        this.imageUrl = imageUrl;
        this.timeStamp = timeStamp;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
