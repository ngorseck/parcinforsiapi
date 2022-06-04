package sn.isi.service;

import sn.isi.dao.IRolesdao;
import sn.isi.entities.Roles;

import java.util.List;

public class RolesImpl implements IRoles{
    //appel de la couche dao
    private IRolesdao rolesdao;

    public RolesImpl(IRolesdao rolesdao) {
        this.rolesdao = rolesdao;
    }

    @Override
    public Roles save(Roles roles) {
        return rolesdao.save(roles);
    }

    @Override
    public Roles update(Roles roles) {
        Roles roles1 = rolesdao.findById(roles.getId());
        roles1.setNom(roles.getNom());
        return rolesdao.save(roles);
    }

    @Override
    public int delete(int id) {
        rolesdao.delete(rolesdao.findById(id));
        return 1;
    }

    @Override
    public Roles get(int id) {
        return rolesdao.findById(id);
    }

    @Override
    public Roles getByNom(String nom) {
        return rolesdao.findByNom(nom);
    }

    @Override
    public List<Roles> getAll() {
        return rolesdao.findAll();
    }
}
