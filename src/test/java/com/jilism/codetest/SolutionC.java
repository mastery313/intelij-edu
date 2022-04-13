package com.jilism.codetest;

import java.util.*;

public class SolutionC {

        Map<String, Integer> wc;

        public void sortByWordCount(String[] words){
            wc = new HashMap<>();
            int i = 0;
            int len = words.length;
            while(i<len){
                if(!wc.containsKey(words[i])){
                    //new word
                    //System.out.println(words[i]);
                    wc.put(words[i], 1);
                }else{
                    //word counting ++
                    int val = wc.get(words[i]);
                    wc.put(words[i],++val);
                }
                i++;
            }

            //정렬
            List<WordCount> sortWc = new ArrayList<>();
            Iterator<Map.Entry<String,Integer>> iter = wc.entrySet().iterator();
            while(iter.hasNext()){
                Map.Entry<String,Integer> e = iter.next();
                sortWc.add(new WordCount(e.getKey(),e.getValue()));
            }

            Collections.sort(sortWc, (w1, w2) -> {
                System.out.println(w1.toString());
                return w1.getCount() > w2.getCount() ? -1 : w1.getCount() < w2.getCount() ? 1 : 0;
            });

            sortWc.forEach(w -> System.out.println(w.word));

            //treemap elementㄱㅏ 다 저장되지 않음 ...왤까
//            SortedMap<Integer, Integer> sortedWc = new TreeMap<>(new Comparator<Integer>() {
//                @Override
//                public int compare(Integer w1, Integer w2) {
//                    System.out.println(w1+" VS "+w2);
//                    return wc.get(w1) > wc.get(w2) ? -1 : wc.get(w1) < wc.get(w2) ? 1 : 0;
//                }
//            });
//            for(Integer k : wc.keySet()){
//                System.out.println(words[k]+", "+wc.get(k));
//                sortedWc.put(k, wc.get(k));
//            }


//            Collections.emptySortedMap().comparator()
              //정렬된 키 출력
//            Iterator<Map.Entry<Integer,Integer>> iter = sortedWc.entrySet().iterator();
//            System.out.println(sortedWc.size());
//            System.out.println(sortedWc.lastKey());
//            while(iter.hasNext()){
//                System.out.println(words[iter.next().getKey()]);
//            }
        }

        class WordCount{
            private String word;
            private int count;

            public WordCount(String word, int count){
                this.word=word;
                this.count=count;
            }

            public String getWord(){
                return word;
            }

            public int getCount(){
                return count;
            }

            @Override
            public String toString() {
                return this.word+", "+this.count;
            }
        }

        public static final void main(String[] args){
            String[] words = {"geeks", "for", "geeks", "a", "portal", "to", "learn", "can", "be", "computer", "science", "zoom", "yup", "fire", "in", "be", "data", "geeks"};
            new SolutionC().sortByWordCount(words);
        }
}
