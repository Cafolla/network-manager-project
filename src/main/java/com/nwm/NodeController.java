package com.nwm;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ericsson")
@Service
public class NodeController {

    @PostMapping
    public ResponseEntity<Node> addNode(@RequestBody Node node){
    //return ResponseEntity.ok()
        return null;
    }
    @GetMapping
    public ResponseEntity<Iterable<Node>> getAllNodes(){

      //  return ResponseEntity.ok().body().;
        return null;
    }

    public void update(){

    }
    @DeleteMapping
    public ResponseEntity<Void> deleteNode(){

        return ResponseEntity.ok().build();
    }
}
