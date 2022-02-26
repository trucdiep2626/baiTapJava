/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de6_tudien;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author admin
 */
public class Dictionary {

    ArrayList<Word> tuDien = new ArrayList<>();

    public Dictionary() {
        tuDien.add(new Word(1, "dog", "cho"));
        tuDien.add(new Word(2, "cat", "meo"));
        tuDien.add(new Word(3, "bird", "chim"));
        tuDien.add(new Word(4, "hotdog", "xuc xich"));
        tuDien.add(new Word(5, "go", "di"));
        tuDien.add(new Word(6, "apple", "tao"));
        tuDien.add(new Word(7, "orange", "cam"));
        tuDien.add(new Word(8, "banana", "chuoi"));
        tuDien.add(new Word(9, "word", "tu"));
        tuDien.add(new Word(10, "hello", "xin chao"));
    }

    public void sapXep() {
        //tuDien.sort(Comparator.comparing(Word::getEn));
        for (int i = 0; i < tuDien.size()-1; i++) {
            for (int j = i+1; j < tuDien.size(); j++) {
                Word w1 = new Word(tuDien.get(i).getId(), tuDien.get(i).getEn(),tuDien.get(i).getVn());
                Word w2 = new Word(tuDien.get(j).getId(), tuDien.get(j).getEn(),tuDien.get(j).getVn());
                if (tuDien.get(i).getEn().compareTo(tuDien.get(j).getVn()) >0) {
                    
                }
            }
        }
    }

    public String timKiem(String en) {

        for (int i = 0; i < tuDien.size(); i++) {
            if (tuDien.get(i).getEn().compareTo(en) == 0) {
                return tuDien.get(i).getVn();
            }
        }
        return "";
    }

    public boolean themTu(String en, String vn) {
        if(tuDien.contains(new Word(0, en, vn))){
            return false;
        }else
        {
            tuDien.add(new Word(tuDien.size() + 1, en, vn));
            
        }
        return true;
    }
}
