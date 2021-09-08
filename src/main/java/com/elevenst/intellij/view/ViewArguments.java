package com.elevenst.intellij.view;

public class ViewArguments {

    public void view(){
        //cmd+P 인자값 보기
        EmailSender sender = new EmailSender(1,"test","test@11stcorp.com");
        sender.receive("test@11stcorp.com", "test2@11stcorp.com");

    }

}
