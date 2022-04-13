package com.jilism.intellij.refactor;

import java.util.List;

public class Extractor {
    public void extractVariable(){
        //영역 선택 후 cmd+opt+V
        //지정된 영역의 동일 변수로 추출 해준다.
        System.out.println(String.format("%d + %d = %d", 1, 2, 1 + 2));
        System.out.println(String.format("%d + %d = %d", 1, 2, 1 + 2));

        //결과
        String msg = String.format("%d + %d = %d", 1, 2, 1 + 2);
        System.out.println(msg);
        System.out.println(msg);
    }

    /**
     * overloading method
     */
    public void extractParameter() {
        extractParameter(10);
    }

    public void extractParameter(int num){
        //파라미터 추출 cmd+opt+P
        //deligate via overloading
        System.out.println(num);
        System.out.println(num);
    }

    public void extractMethod(List<Book> books){
        //블럭 지정된 코드를 메소드로 추출 cmd+opt+M
        for (Book book : books) {
//            for (String s : book.getAuthors()) {
//                if("jilee".equals(s)){
//                  System.out.println("");
//                }
//                print(s);
//            }
            lookup(book);
        }
    }

    /**
     * authors 순회 메서드 추출 결과물
     * @param book
     */
    private void lookup(Book book) {
        for (String s : book.getAuthors()) {
            print(s);
        }
    }

    /**
     * sout 메서드 추출 결과물
     * @param s
     */
    private void print(String s) {
        if("jilee".equals(s)){
            System.out.println("");
        }
    }

    public static class Book{
        private String title;
        private long price;
        private List<String> authors;

        public Book(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public long getPrice() {
            return price;
        }

        public List<String> getAuthors() {
            return authors;
        }
    }
}
