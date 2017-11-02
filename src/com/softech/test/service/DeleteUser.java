/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softech.test.service;

import com.softech.test.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.print.DocFlavor;

public class DeleteUser {

    public static void main(String args[]){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test_PU");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        User user = entityManager.find(User.class, 1000);

        entityManager.remove(user);

        try{
        entityManager.getTransaction().commit();
        }
        catch(Exception e){
            System.out.println("Error Deleting object");
        }
        entityManager.close();
        entityManagerFactory.close();
    }
}

