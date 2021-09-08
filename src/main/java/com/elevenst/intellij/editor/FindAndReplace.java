package com.elevenst.intellij.editor;

public class FindAndReplace {
    //cmd+shift+O 파일 검색
    //패키지명의 일부를 넣어서 검색도 가능 intellij.Find ...

    //cmd+opt+O 메소드 검색

    //cmd+shift+A Action 검색, 설정이나 단축키 검색

    //cmd+E 최근 열었던 파일 검색
    //cmd+shit+E 최근 수정된 파일만 검색

    //shift 를 추가하면 프로젝트 전체 범위로 적용
    //정규식으로 바꾸기 -> regex1.html 참고
    public void find(){
        //cmd+F
        String str = "textFind";
    }

    public void replace(){
        //cmd+R
        String str = "textReplace";
        System.out.println("textReplace");
    }
}
