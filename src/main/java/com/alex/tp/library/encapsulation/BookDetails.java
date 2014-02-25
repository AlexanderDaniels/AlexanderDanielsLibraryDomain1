/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.encapsulation;

/**
 *
 * @author Alex
 */
public class BookDetails {
    
    private String bookName;
    private int isbnNum;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String newbookName) {
        this.bookName = newbookName;
    }

    public int getIsbnNum() {
        return isbnNum;
    }

    public void setIsbnNum(int newisbnNum) {
        this.isbnNum = newisbnNum;
    }   
}
