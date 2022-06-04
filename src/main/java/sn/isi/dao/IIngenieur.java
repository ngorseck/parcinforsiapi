package sn.isi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.isi.entities.Ingenieur;

@Repository
public interface IIngenieur extends JpaRepository<Ingenieur, Integer> {
    Ingenieur findByEmail(String email);
}
