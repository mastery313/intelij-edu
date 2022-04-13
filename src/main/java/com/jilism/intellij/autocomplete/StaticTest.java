package com.jilism.intellij.autocomplete;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class StaticTest {
    private long id;
    private String email;
    private String name;


    public StaticTest() {
    }

    public void name(){
        //smart 자동완성, 클래스 및 파라미터에서 사용
        //ctrl+shift+space

        //alt+enter 코드 제안
        Calendar c = new GregorianCalendar();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
