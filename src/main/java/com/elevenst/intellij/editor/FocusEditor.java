package com.elevenst.intellij.editor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FocusEditor {
    public void focus(){
        //opt + <-,-> 단어별 이동
        String s = "안녕하세요 반갑습니다. IntelliJ IDEA !!!";
        System.out.println(s);
    }

    public void increaseFocus(){
        //opt + up 커서위치에서 포커스를 계층적으로 늘려줌
        System.out.println(Optional.of(new StringBuilder().append("test")));

        //cmd + [,] 포커스 이동

    }

    public void copyFocus(){
        //opt2번 + down 블럭단위 수정
        List<String> members = new ArrayList<>();
        members.add(new StringBuilder().append("Test2").toString());
        members.add(new StringBuilder().append("Test2").toString());
        members.add(new StringBuilder().append("Test2").toString());
        members.add(new StringBuilder().append("Test2").toString());
        members.add(new StringBuilder().append("Test2").toString());
    }

    public void errorFocus(){
        //F2 에러로 이동
        //아래 주석 풀어서 테스트 해보세요
        //return "";
        //return "";
        //21 / 0;
    }
}
