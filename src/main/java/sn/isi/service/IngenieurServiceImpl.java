package sn.isi.service;

import org.springframework.stereotype.Service;
import sn.isi.dao.IIngenieurdao;
import sn.isi.entities.Ingenieur;

import java.util.List;

@Service
public class IngenieurServiceImpl implements IIngenieurService {

    //appel de la couche dao
    private IIngenieurdao ingenieurdao;

    public IngenieurServiceImpl(IIngenieurdao ingenieurdao) {
        this.ingenieurdao = ingenieurdao;
    }

    @Override
    public Ingenieur save(Ingenieur ingenieur) {
        return ingenieurdao.save(ingenieur);
    }

    @Override
    public Ingenieur update(Ingenieur ingenieur) {
        Ingenieur ingenieur1 = ingenieurdao.findById(ingenieur.getId());
        ingenieur1.setNom(ingenieur.getNom());
        ingenieur1.setPrenom(ingenieur.getPrenom());
        ingenieur1.setEmail(ingenieur.getEmail());
        ingenieur1.setPassword(ingenieur.getPassword());
        return ingenieurdao.save(ingenieur1);
    }

    @Override
    public int delete(int id) {
        ingenieurdao.delete(ingenieurdao.findById(id));
        return 1;
    }

    @Override
    public Ingenieur get(int id) {
        return ingenieurdao.findById(id);
    }

    @Override
    public Ingenieur getByEmail(String email) {
        return ingenieurdao.findByEmail(email);
    }

    @Override
    public List<Ingenieur> getAll() {
        return ingenieurdao.findAll();
    }

    @Override
    public Ingenieur login(String email, String password) {
        return ingenieurdao.login(email, password);
    }
}
