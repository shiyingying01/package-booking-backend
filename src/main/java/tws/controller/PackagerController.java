package tws.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Packager;
import tws.repository.PackagerMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/packagers")
public class PackagerController {

    @Autowired
    private PackagerMapper packagerMapper;

    @GetMapping("")
    public ResponseEntity<List<Packager>> getAll() {
        return ResponseEntity.ok(packagerMapper.selectAll());
    }

    @PostMapping("")
    public ResponseEntity<Packager> insert(@RequestBody Packager packager) {
    	packagerMapper.insert(packager);
        return ResponseEntity.created(URI.create("/packagers/" + packager.getId())).body(packager);
    }
    
    @PatchMapping("/{id}")
    public ResponseEntity<String> Update(@PathVariable String id,@RequestParam("getTime") String getTime){
    	packagerMapper.update(id,getTime);
    	return ResponseEntity.created(URI.create("/packagers/" + id)).body("s");
    }
    
}
