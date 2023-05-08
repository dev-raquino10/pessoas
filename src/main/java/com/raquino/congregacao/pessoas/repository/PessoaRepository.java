package com.raquino.congregacao.pessoas.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raquino.congregacao.pessoas.entity.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    List<Pessoa> findByGrupoAndPrivilegioAndTipoPublicador(String grupo, String privilegio, String tipoPublicador);
    
    Optional<Pessoa> findById(Long id);

    List<Pessoa> findByGrupo(String grupo);

    List<Pessoa> findByTipoPublicador(String tipoPublicador);

    List<Pessoa> findByPrivilegio(String privilegio);

    List<Pessoa> findByGrupoAndTipoPublicador(String grupo, String tipoPublicador);

    List<Pessoa> findByGrupoAndPrivilegio(String grupo, String privilegio);

    List<Pessoa> findByTipoPublicadorAndPrivilegio(String tipoPublicador, String privilegio);

    List<Pessoa> findByGrupoAndTipoPublicadorAndPrivilegio(String grupo, String tipoPublicador, String privilegio);

}
