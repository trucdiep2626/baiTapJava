/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class dictionary {
     Scanner input= new Scanner(System.in);
    
    private ArrayList <word> dic =new ArrayList <word>();
    

    public dictionary() {
        dic.add(new word(1,"accommodate","cung cap"));
        dic.add(new word(2,"carpool","di chung xe"));
        dic.add(new word(3,"collectively","goi chung"));
        dic.add(new word(4,"command","menh lenh"));
        dic.add(new word(5,"caution","can than"));
        dic.add(new word(6,"displace","chiem cho"));
        dic.add(new word(7,"expire","het han"));
        dic.add(new word (8,"recipient","hoa don"));
        dic.add(new word(9,"provided that","voi dieu kien la"));
        dic.add(new word(10,"light","sang"));
    }

    public ArrayList<word> getDic() {
        return dic;
    }

    public void setDic(ArrayList<word> dic) {
        this.dic = dic;
    }
    
    public void showDictionary(){
        sortDictionary();
        for(int i =0;i<dic.size();i++)
        System.out.println(dic.get(i));
    }
    
    public String findVNMeaning(String str){
        String vn = null;
        for(int i=0;i<dic.size();i++)
        {if(str.compareToIgnoreCase(dic.get(i).getEn())==0)
            {
                vn= dic.get(i).getVn();
            }
        }
      return vn;
    }
    
    public void addWord(String en, String vn)
    {
        dic.add(new word(dic.size()+1,en,vn));
    }
    public void sortDictionary()
    {
        for(int i=0;i<dic.size()-1;i++)
        {
            for(int j=i+1;j<dic.size();j++)
            {
                if(dic.get(i).getEn().compareToIgnoreCase(dic.get(j).getEn())>0)
                {
                    word tmp= new word();
                            tmp=dic.get(i);
                            dic.set(i,dic.get(j));
                            dic.set(j, tmp);
                    //dic.get(i)=dic.get(j);
                    //dic.get(j)=tmp;
                }
            }
        }
    }
}
