package com.jilism.intellij.refactor;

public class refactoring {
    public void rename(){
        // 변수명, 클래스 메서드, 파일명, 패키지등등 일괄 변경
        // shift+F6
        String legacy = "a";

    }

    public void print(){
        int num = cal();
        System.out.println(num);
    }

    private int cal(){
        //return type refactoring (type migration)
        //return type에 포커스를 둔 상태에서 cmd+shift+F6
        return 1;
    }

    //optimize import on fly 설정을 통해 자동으로 사용하지 않는 패키지 제거
    //자동정렬 cmd+opt+l
}
