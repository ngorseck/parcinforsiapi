package sn.isi.web;

import org.springframework.web.bind.annotation.*;
import sn.isi.entities.Ingenieur;
import sn.isi.service.IIngenieurService;

import java.util.List;

@RestController
@RequestMapping("/ingenieur")
public class IngenieurController {

    //appel de la couche service
    private IIngenieurService ingenieurService;

    public IngenieurController(IIngenieurService ingenieurService) {
        this.ingenieurService = ingenieurService;
    }

    @PostMapping("/save")
    public Ingenieur add (@RequestBody Ingenieur ingenieur) {

        return ingenieurService.save(ingenieur);
    }

    @GetMapping("/getAll")
    public List<Ingenieur> getAll () {

        return ingenieurService.getAll();
    }
}
