package sn.isi.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.isi.dao.IIngenieurdao;
import sn.isi.dao.IRolesdao;
import sn.isi.entities.Ingenieur;
import sn.isi.entities.Roles;

import java.util.List;

@Service
@Transactional
public class IngenieurServiceImpl implements IIngenieurService {

    //appel de la couche dao
    private IIngenieurdao ingenieurdao;
    private IRolesdao rolesdao;

    public IngenieurServiceImpl(IIngenieurdao ingenieurdao, IRolesdao rolesdao) {
        this.ingenieurdao = ingenieurdao;
        this.rolesdao = rolesdao;
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

    @Override
    public Ingenieur addRoleToIngenieur(int idIngenieur, int idRole) {
        Ingenieur ingenieur = ingenieurdao.findById(idIngenieur);
        Roles roles = rolesdao.findById(idRole);
        ingenieur.getRoles().add(roles);
        return ingenieur;
    }

    @Override
    public Ingenieur addRolesToIngenieur(int idIngenieur, List<Integer> idRoles) {
        Ingenieur ingenieur = ingenieurdao.findById(idIngenieur);
        for (int id : idRoles) {
            Roles roles = rolesdao.findById(id);
            ingenieur.getRoles().add(roles);
        }
        return ingenieur;
    }
}
