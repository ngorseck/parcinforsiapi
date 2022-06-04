package sn.isi.service;

import org.springframework.stereotype.Service;
import sn.isi.entities.Roles;

import java.util.List;

@Service
public interface IRolesService {
    public Roles save (Roles roles);
    public Roles update (Roles roles);
    public int delete (int id);
    public Roles get (int id);
    public Roles getByNom (String nom);
    public List<Roles> getAll ();
}
