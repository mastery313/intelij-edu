package com.elevenst.intellij.view;

public class ViewDefinition  {
    public void view(){
        EmailSender sender = new EmailSender(2,"test2", "test2@11stcorp.com");
        //opt+space : 생성정보나 메서드 전체 코드를 보여준다
        //html의 js,css 소스도 미리보기가 가능(ultimate)
        sender.send("test@11stcorp.com");
    }
}
