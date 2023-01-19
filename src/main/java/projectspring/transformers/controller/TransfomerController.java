package projectspring.transformers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projectspring.transformers.model.Transformer;
import projectspring.transformers.repository.TransformerRepository;

import java.util.List;

@RestController
@ResponseBody
public class TransfomerController {
        @Autowired
        TransformerRepository repository;

        @GetMapping("/transformer")
        public List<Transformer> getAllTransformers(){
            return repository.findAll();
        }

        @GetMapping("/transformer/{id}")
        public Transformer getTransformerById(@PathVariable Long id) {
            return repository.findById(id).get();
        }

        @PostMapping("/transformer")
        public Transformer saveTransformer(@RequestBody Transformer transformer) {
            return repository.save(transformer);
        }

        @DeleteMapping("/transformer/{id}")
        public void deleteTransformer(@PathVariable Long id) {
            repository.deleteById(id);
        }
}
