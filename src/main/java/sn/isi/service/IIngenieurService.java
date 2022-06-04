package sn.isi.service;

import org.springframework.stereotype.Service;
import sn.isi.entities.Ingenieur;

import java.util.List;

@Service
public interface IIngenieurService {
    public Ingenieur save (Ingenieur ingenieur);
    public Ingenieur update (Ingenieur ingenieur);
    public int delete (int id);
    public Ingenieur get (int id);
    public Ingenieur getByEmail (String email);
    public List<Ingenieur> getAll ();
    public Ingenieur login (String email, String password);
}
