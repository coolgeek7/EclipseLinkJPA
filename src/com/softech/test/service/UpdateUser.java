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

public class UpdateUser {

    public static void main(String args[]){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test_PU");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class,101);

        //before update
        System.out.println("Before Update Operation");
        System.out.println(user);
        user.setUsername("root");
        user.setPassword("root");

        entityManager.getTransaction().commit();

        //after update
        System.out.println("After Update Operation");
        System.out.println(user);
        entityManager.close();
        entityManagerFactory.close();
    }
}

