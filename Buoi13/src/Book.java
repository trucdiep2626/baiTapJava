/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Book {
    private String ID;
    private String Author;
    private String Category;
    private String Title;

    public Book() {
    }

    public Book(String ID, String Author, String Category, String Title) {
        this.ID = ID;
        this.Author = Author;
        this.Category = Category;
        this.Title = Title;
    }

    @Override
    public String toString() {
        return ID + "," + Author + ","+ Category + "," + Title +"\n";
    }
    
    public String[] toStringArray() {
        String [] ds={ ID ,Author , Category,Title};
        return ds;
    }
}
