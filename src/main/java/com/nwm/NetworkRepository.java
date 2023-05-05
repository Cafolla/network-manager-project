package com.nwm;

import java.util.Collection;

public interface NetworkRepository {
    int addNode(Node node);
    Node getNodeById(int id);

    int updateNode(Node newNode, int id);

    void deleteNode(int id);

    Collection<Node> getAll();

}
