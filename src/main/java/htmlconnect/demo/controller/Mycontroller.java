package htmlconnect.demo.controller;

import htmlconnect.demo.module.Worker;
import htmlconnect.demo.service.Myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Mycontroller {
    @Autowired
    private Myservice myservice;
    @GetMapping("get/{id}")
    public ResponseEntity getController(@PathVariable Long id)
    {
        Worker worker = myservice.getWorker(id);
        return ResponseEntity.ok(worker);
    }
    @PostMapping("post")
    public ResponseEntity postController(@RequestBody Worker worker)
    {
        myservice.saveModel(worker);
        return ResponseEntity.ok(worker);
    }
}
