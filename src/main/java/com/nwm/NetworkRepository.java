package com.nwm;

import java.util.Collection;

public interface NetworkRepository {
    Long addNode(Node node);
    Node getNodeById(long id);

    Long updateNode(Node newNode, long id);

    void deleteNode(int id);

    Collection<Node> getAll();

}
