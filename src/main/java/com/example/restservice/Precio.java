package com.example.restservice;

public class Precio {

    private final long id;
    private final String content;


    public Precio(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String toPrintResumido(){
        return getId()+";"+getContent()+ '\n' ;
    }

}
