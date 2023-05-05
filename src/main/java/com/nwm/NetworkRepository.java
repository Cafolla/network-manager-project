package com.nwm;

public interface NetworkRepository {
    void addNode(int id);
    Node getNodeById(int id);

    void updateNode(int id);

    void deleteNode(int id);


}
