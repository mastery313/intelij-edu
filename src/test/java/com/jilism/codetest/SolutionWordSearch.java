package com.jilism.codetest;

public class SolutionWordSearch {
    public boolean exist(char[][] board, String word){
        int m = board.length;
        int n = board[0].length;

        if(word.length() == 0 || m == 0 || n > 6) return false;

        //첫 문자 부터 board에서 찾기 시작
        int index=0,px=0,py=0;
        while(py < m && px < n) {
            boolean exist = findNext(board, word, index, px, py);
            if(exist) return true;
            //point x,y 증가
            if(++px == n){
                ++py;
                px=0;
            }
        }
        return false;
    }

    /**
     * 인접 노드 순회
     */
    private boolean findNext(char[][] board, String word, int tarIdx, int py, int px){
        //포인트가 m,n 에 다다를때까지 재귀하는 방식
        int m = board.length;
        int n = board[0].length; //constraint
        //못 찾으면 false
        if(py<0||px<0||py == m||px==n) return false;

        //마지막 문자까지 다 찾는데 성공
        if(tarIdx == word.length()) return true;
        //찾는 문자가 아니면 false
        if(board[py][px] != word.charAt(tarIdx)) return false;

        //찾은 경우 다음 인접문자 찾기
        //1. 오른쪽
        boolean findR = findNext(board, word, tarIdx+1, py, px+1);
        //2. 아래
        boolean findD = findNext(board, word, tarIdx+1, py+1, px);
        //3. 왼쪽
        boolean findL = findNext(board, word, tarIdx+1, py, px-1);
        //4. 위
        boolean findU = findNext(board, word, tarIdx+1, py-1, px);

        //두 인접문자중 찾아지면 true
        return findR || findD || findL || findU;

    }

    public static void main(String[] args) {
        boolean res = false;
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        //res = new SolutionWordSearch().exist(board,"ABCCED");
        System.out.println("find1 "+res);

        char[][] board2 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        res = new SolutionWordSearch().exist(board2,"SEE");
        System.out.println("find2 "+res);

        int a = ~1;
        System.out.println(Integer.toBinaryString(a << 8)+", "+(a<<8));
    }
}
