package com.jilism.intellij.autocomplete;

/**
 * LiveTemplate 지정된 코드를 자동으로 완성
 * 설정에서 custom으로 추가 가능
 */
public class LiveTemplate {
    public static void main(String[] args) {
        //psvm
        //sout
        String a = "test";
        //ifn -> if null
        if (a == null) {

        }

        //live template 전체 보기
        //cmd+J

        //inn -> if not null
        if (a != null) {

        }

        //iter -> for
        for (String arg : args) {

        }
    }
}
