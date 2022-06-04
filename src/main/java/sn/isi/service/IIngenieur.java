package sn.isi.service;

import sn.isi.entities.Ingenieur;

import java.util.List;

public interface IIngenieur {
    public Ingenieur save (Ingenieur ingenieur);
    public Ingenieur update (Ingenieur ingenieur);
    public int delete (int id);
    public Ingenieur get (int id);
    public Ingenieur getByEmail (String email);
    public List<Ingenieur> getAll ();
    public Ingenieur login (String email, String password);
}
