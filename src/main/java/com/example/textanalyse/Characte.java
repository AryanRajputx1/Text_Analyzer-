package com.example.textanalyse;
public class Characte {
    public int charaCount(String s) {
        s = s.trim(); // Remove leading/trailing spaces
        return s.replace(" ", "").length(); // Remove spaces and get remaining length
    }
}

