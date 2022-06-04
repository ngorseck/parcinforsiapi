package sn.isi.service;

import sn.isi.entities.Roles;

import java.util.List;

public interface IRoles {
    public Roles save (Roles roles);
    public Roles update (Roles roles);
    public int delete (int id);
    public Roles get (int id);
    public Roles getByNom (String nom);
    public List<Roles> getAll ();
}
