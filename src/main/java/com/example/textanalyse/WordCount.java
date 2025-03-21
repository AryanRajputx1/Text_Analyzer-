package com.example.textanalyse;
 class WordCount {
    public int Count(String s) {

        s = s.trim();
        String[] words = s.split("\\s+");
        return words.length;

    }
}
