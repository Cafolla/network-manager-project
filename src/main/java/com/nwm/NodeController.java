package com.nwm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ericsson")
@Service
public class NodeController {

    @Autowired
    NetworkRepositoryImpl repo;


    @PostMapping
    public ResponseEntity<Integer> addNode(@RequestBody Node node){
        if(repo.addNode(node)==0){
            return ResponseEntity.badRequest().build();
        }
       else {
            return ResponseEntity.ok().build();
        }
    }

    @GetMapping("/get/")
    public ResponseEntity<Iterable<Node>> getAllNodes(){
        Iterable<Node> result = repo.getAll();
        if(result == null){
            return ResponseEntity.badRequest().build();
        }
        else{
            return ResponseEntity.ok().body(result);
        }


    }
    @PutMapping
    public ResponseEntity<Integer> update(Node newNode, int id){
        int meid = repo.updateNode(newNode, id);
        if(meid==0){
            return ResponseEntity.badRequest().build();
        }
        else {
            return ResponseEntity.ok().build();
        }

    }
    @DeleteMapping
    public ResponseEntity<Void> deleteNode(int id){
        repo.deleteNode(id);

        return ResponseEntity.ok().build();
    }
}
