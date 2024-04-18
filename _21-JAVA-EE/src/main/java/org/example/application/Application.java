package org.example.application;

import org.example.entities.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

//        01 - INSERT
//        Pessoa p1 = new Pessoa(null, "João", "joao@gmail.com");
//        em.getTransaction().begin();
//        em.persist(p1);
//        em.getTransaction().commit();

//        02 - FIND BY ID
//        Pessoa p = em.find(Pessoa.class, 2);

//        03 - DELETE
//        é necessário ter objeto da Pessoa instanciada e vinda do banco de dados para fazer a remoção dela.
//        em.getTransaction().begin();
//        Pessoa p = em.find(Pessoa.class, 2);
//        em.remove(p);
//        em.getTransaction().commit();

//        04 - UPDATE
//        em.getTransaction().begin();
//        Pessoa p = em.find(Pessoa.class, 1);
//        p.setName("Herbert Duarte");
//        em.getTransaction().commit();

//        05 - LIST ALL

//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery<Pessoa> cq = cb.createQuery(Pessoa.class);
//        Root<Pessoa> root = cq.from(Pessoa.class);
//        cq.select(root);
//        javax.persistence.Query q = em.createQuery(cq);
//        List<Pessoa> list = q.getResultList();
//
//        for(Pessoa p : list){
//            System.out.println(p.toString());
//        }

        System.out.println("Done!");

        em.close();
        emf.close();
    }
}
