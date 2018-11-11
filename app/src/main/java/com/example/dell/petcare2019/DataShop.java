package com.example.dell.petcare2019;

public class DataShop {
    private int HinhAnh;
    private String Ten;
    private  String Content ;

    public DataShop(int hinhAnh, String ten, String content) {
        HinhAnh = hinhAnh;
        Ten = ten;
        Content = content;
    }

    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }



}
