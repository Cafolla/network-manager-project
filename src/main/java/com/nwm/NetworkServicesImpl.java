package com.nwm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NetworkServicesImpl implements NetworkRepository{

    @Autowired
    NodeController nodeController;


    @Override
    public void addNode(int id) {

    }

    @Override
    public Node getNodeById(int id) {
        return null;
    }

    @Override
    public void updateNode(int id) {

    }

    @Override
    public void deleteNode(int id) {

    }
}
