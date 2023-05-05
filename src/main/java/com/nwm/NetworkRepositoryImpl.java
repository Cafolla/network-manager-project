package com.nwm;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class NetworkRepositoryImpl implements NetworkRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    @Transactional
    public int addNode(Node node) {
        entityManager.persist(node);
        entityManager.flush();
        return node.getId();
    }

    @Override
    @Transactional
    public Node getNodeById(int id) {

      return  entityManager.find(Node.class, id);
    }

    @Override
    @Transactional
    public int updateNode(Node newNode, int id) {
        Node currentNode = entityManager.find(Node.class, id);
        currentNode = newNode;
        entityManager.flush();
        return currentNode.getId();
    }

    @Override
    @Transactional
    public void deleteNode(int id) {
        Query query = entityManager.createQuery("delete from Node where id = " +id);
        query.executeUpdate();
    }

    @Override
    @Transactional
    public Collection<Node> getAll() {
        return null;
    }
}
