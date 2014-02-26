/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.library.plk.compliance;

/**
 *
 * @author Alex
 */
public interface PublisherService extends AuthorService{
    String publisherName(String publisherName);
    int numberBooks(int numBooks);
}
