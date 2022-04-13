package com.jilism.intellij.editor;

public class Line {
    public void copyLine() {
        System.out.println("현재줄 복사"); //cmd+d
        System.out.println("현재줄 복사");
        System.out.println("현재줄 복사");
        System.out.println("현재줄 삭제"); //cmd+backspace

    }

    public void joinString(){
        //여러라인으로 연결된 스트링을 한줄로 합치기
        //ctrl+shift+J
        String profile = "안녕하세요.인텔리제이 강의에 오신걸 환영합니다." +
                "!!!!"
                +"a"
                +"b";

        //긴 sql문등을 간결하게 한줄로 정리학 싶을때 유용
        String sql = "Select *"
                +" From TIGER"
                +" Where ID=123";
    }

    public void moveLineAndStatement(){
        //opt+shift+위아래
        //cmd_shift+위아래 (메소드안에서만 이동)
        System.out.println("라인 혹 구문 이동");
        //cmd+opt+shift+좌우 (속성 이동)
        //html -> element 이동시 유용
    }
}
