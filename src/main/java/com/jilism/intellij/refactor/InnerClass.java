package com.jilism.intellij.refactor;

public class InnerClass {
    public void moveInnerClass(){
        Team team = new Team("검색 개발팀", "search");
        System.out.println(team.getCode());
    }

    // 아래 Team이라는 클래스를 외부 패키지로 리팩토링
    // 클래스명에 포커스를 둔 상태에서 F6 -> 원하는 패키지로 이동
    // 설명 추가 Project source에서 이름변경 shift+F6
    public static class Team{
        private String name;
        private String code;

        public Team(String name, String code) {
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }
    }
}
