package sn.isi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.isi.entities.Ingenieur;

@Repository
public interface IIngenieurdao extends JpaRepository<Ingenieur, Integer> {
    Ingenieur findById(int id);
    Ingenieur findByEmail(String email);
    @Query("select i from Ingenieur i where i.email = :em and i.password = :pwd")
    public Ingenieur login (@Param("em") String email, @Param("pwd") String password);
}
