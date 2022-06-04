package sn.isi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.isi.entities.Roles;

@Repository
public interface IRolesdao extends JpaRepository<Roles, Integer> {
    Roles findById(int id);
    Roles findByNom(String nom);
}
