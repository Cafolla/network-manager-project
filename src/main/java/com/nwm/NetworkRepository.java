package com.nwm;

public interface NetworkRepository {
    int addNode(Node node);
    Node getNodeById(int id);

    void updateNode(int id);

    void deleteNode(int id);


}
