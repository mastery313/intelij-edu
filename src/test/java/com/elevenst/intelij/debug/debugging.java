package com.elevenst.intelij.debug;

import com.elevenst.intellij.refactor.Extractor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class debugging {

    @Test
    public void testEvaluate(){
        //현재 포커스로 새로운 debug 시작 ctrl+shift+D
        //바로 이전 debugging 햇던 위치의 debug 실행 ctrl+D
        //step over(한줄씩 실행) F8
        //step into(메서드 안으로 포커스 이동) F7
        //step out(메서드 밖으로 포커스 이동) shift+F8
        //resume(다음 브레이크포인트 이동) cmd+opt+R
        System.out.println("test");
        System.out.println("test2");
        System.out.println("test3");
        System.out.println("test4");
        //특정 조건에서만 브레이크 포인트
        //브레이크 지점의 모든 변수 스코프를 사용 가능
        List<Extractor.Book> books = Arrays.asList(new Extractor.Book("자바프로그래밍"),new Extractor.Book("스프링부트"),new Extractor.Book("클라우드프로그래망"));

        for (Extractor.Book book : books) {
            System.out.println(book.getTitle());
        }
    }

}
