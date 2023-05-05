package com.nwm;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NetworkServicesImpl implements NetworkRepository{

    @Autowired
    NodeController nodeController;

    @PersistenceContext
    protected EntityManager entityManager;


    @Override
    @Transactional
    public int addNode(Node node) {
         entityManager.persist(node);
         entityManager.flush();
         return node.getId();

    }

    @Override
    public Node getNodeById(int id) {
        entityManager.find(Node.class, id);
    }

    @Override
    public void updateNode(int id) {
        Node currentNode = entityManager.find(Node.class, id);

    }

    @Override
    public void deleteNode(int id) {

    }
}
