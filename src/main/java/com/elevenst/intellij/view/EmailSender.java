package com.elevenst.intellij.view;

public class EmailSender {
    long id;
    String name;
    String email;
    public EmailSender(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void receive(String from, String to){

    }

    public void send(String to){
        System.out.println("send mail =>"+to);
    }
}
