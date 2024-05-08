package edu.uncc.giftlistapp.models;

import org.json.JSONObject;

public class Product {
    String pid,name, img_url;
    double price=0.0;
    int count =0;

    public Product() {
    }
    public Product(JSONObject json) {
        this.pid = json.optString("pid");
        this.name = json.optString("name");
        this.img_url =json.optString("img_url");
        try {
            this.price = Double.valueOf(json.optString("price"));
        }catch (NumberFormatException ex){
            ex.printStackTrace();
            price=0;
        }
    }
    public void incrementCount(){
        count++;
    }
    public  void decrementCount(){
        if(count>0){
            count--;
        }
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    /*
    "products": [
        {
            "pid": "ec132919-d16b-4529-8516-13f121e933e7",
            "name": "Charlotte 49ers 11.5'' Suntime Premium Glass Face Football Helmet Wall Clock",
            "img_url": "https://www.theappsdr.com/items-imgs/charlotte-49ers-wall-clock.jpeg",
            "price": "35.99"
        },
     */
}
