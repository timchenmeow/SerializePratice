package entity;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author TimChen
 */
public class Book {
    @SerializedName("bookName")
    private String name;
    
    @SerializedName("bookPrice")
    private float price;
    
    @SerializedName("bookAuthor")
    private String author;    
    
    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
