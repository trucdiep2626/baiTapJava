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
        sapXep();
    }

    public void sapXep() {
        //tuDien.sort(Comparator.comparing(Word::getEn));
//        for (int i = 0; i < tuDien.size()-1; i++) {
//            for (int j = i+1; j < tuDien.size(); j++) {
//                Word w1 = new Word(tuDien.get(i).getId(), tuDien.get(i).getEn(),tuDien.get(i).getVn());
//                Word w2 = new Word(tuDien.get(j).getId(), tuDien.get(j).getEn(),tuDien.get(j).getVn());
//                if (tuDien.get(i).getEn().compareTo(tuDien.get(j).getVn()) >0) {
//                    
//                }
//            }
     //   }
        for (int i = 0; i < this.tuDien.size()-1; i++) {
            for (int j = i+1; j < this.tuDien.size(); j++) {
                if(this.tuDien.get(i).getEn().compareToIgnoreCase(this.tuDien.get(j).getEn())>0){
                    Word tmpWord = this.tuDien.get(i);
                    this.tuDien.set(i,this.tuDien.get(j));
                    this.tuDien.set(j,tmpWord);
                }
            }
        }
    }

    public String timKiem(String en) {

        int ketQua = binarySearch(0, tuDien.size()-1, en);
        if(ketQua != -1)
        {
            return tuDien.get(ketQua).getVn();
        }
        return "";
    }
    
    int binarySearch( int l, int r, String x) {
  if (r >= l) {
    int mid = l + (r - l) / 2; // Tương đương (l+r)/2 nhưng ưu điểm tránh tràn số khi l,r lớn
 
    // Nếu arr[mid] = x, trả về chỉ số và kết thúc.
    if (tuDien.get(mid).getEn().compareTo(x) ==0)
      return mid;
 
    // Nếu arr[mid] > x, thực hiện tìm kiếm nửa trái của mảng
    if (tuDien.get(mid).getEn().compareTo(x) >0)
      return binarySearch(  l, mid - 1, x);
 
    // Nếu arr[mid] < x, thực hiện tìm kiếm nửa phải của mảng
    return binarySearch(  mid + 1, r, x);
  }
 
  // Nếu không tìm thấy
  return -1;
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
    
    public void inTu(){
        for (Word word : tuDien) {
            System.out.println(word.toString());
        }
    }
}
