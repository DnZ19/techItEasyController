package nl.novi.techItEasyController.Controller;

import nl.novi.techItEasyController.Exceptions.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionController {

    @GetMapping("television")
    public ResponseEntity<String> getAllTelevisions(){
        //shortcut: return ResponseEntity.ok("television");
        return new ResponseEntity("television", HttpStatus.OK);
    }

    @GetMapping("television/{id}")
    public ResponseEntity<String> getTVWithId(@PathVariable int id){

        if(id == 5){
            throw new RecordNotFoundException("Things");
        }

        return ResponseEntity.ok("television: " + id);

    }

    @PutMapping("television/{id}")
    public ResponseEntity<String> updateTVList(@PathVariable int id, @RequestParam String name){
        return ResponseEntity.noContent().build();
    }

    @PostMapping("television")
    public ResponseEntity<String> addTVList(@RequestBody String television){
        return ResponseEntity.created(null).body(television);
    }

    @DeleteMapping("television")
    public ResponseEntity<String> deleteTVByID(@PathVariable int id){

        return ResponseEntity.noContent().build();

    }


}
