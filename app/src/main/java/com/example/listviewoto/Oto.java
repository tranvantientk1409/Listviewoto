package com.example.listviewoto;

public class Oto {
    private String name;
    private String tinhnang;
    private int hinh;

    public Oto(String name, String tinhnang, int hinh) {
        this.name = name;
        this.tinhnang= tinhnang;
        this.hinh = hinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTinhnang() {
        return tinhnang;
    }

    public void setTinhnang(String tinhnang) {
        this.tinhnang = tinhnang;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
