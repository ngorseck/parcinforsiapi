package sn.isi.web;

import org.springframework.web.bind.annotation.*;
import sn.isi.entities.Ingenieur;
import sn.isi.entities.Roles;
import sn.isi.service.IIngenieurService;
import sn.isi.service.IRolesService;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolesController {

    //appel de la couche service
    private IRolesService rolesService;

    public RolesController(IRolesService rolesService) {
        this.rolesService = rolesService;
    }

    @PostMapping("/save")//http://localhost:8082/roles/save
    public Roles add (@RequestBody Roles roles) {

        return rolesService.save(roles);
    }

    @GetMapping("/getAll")//http://localhost:8082/roles/getAll
    public List<Roles> getAll () {

        return rolesService.getAll();
    }
}
