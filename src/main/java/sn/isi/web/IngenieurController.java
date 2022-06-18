package sn.isi.web;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import sn.isi.entities.Ingenieur;
import sn.isi.service.IIngenieurService;

import javax.websocket.server.PathParam;
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

    @GetMapping("/addRoleToIngenieur/{idIng}/{idRole}")
    public Ingenieur addRoleToIngenieur (@PathVariable int idIng, @PathVariable int idRole) {
        return ingenieurService.addRoleToIngenieur(idIng, idRole);
    }
    @DeleteMapping("/delete/{id}")
    public int delete (@PathVariable int id) {
        try {
            ingenieurService.delete(id);
            return 1;
        }catch (Exception ex) {
            return 0;
        }
    }
    @PutMapping("/update")
    public Ingenieur update (@RequestBody Ingenieur ingenieur) {
        return ingenieurService.update(ingenieur);
    }
}
