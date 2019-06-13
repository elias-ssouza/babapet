package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("PetDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface PetDAO extends JpaRepository<Pet, java.lang.String> {

  /**
   * Obtém a instância de Pet utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Pet entity WHERE entity.id = :id")
  public Pet findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Pet utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Pet entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Atendimento entity WHERE entity.pet.id = :id")
  public Page<Atendimento> findAtendimento(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.cuidador FROM Atendimento entity WHERE entity.pet.id = :id")
  public Page<Cuidador> listCuidador(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Atendimento entity WHERE entity.pet.id = :instanceId AND entity.cuidador.id = :relationId")
  public int deleteCuidador(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key dono
   * @generated
   */
  @Query("SELECT entity FROM Pet entity WHERE entity.dono.id = :id")
  public Page<Pet> findPetsByDono(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key user
   * @generated
   */
  @Query("SELECT entity FROM Pet entity WHERE entity.user.id = :id")
  public Page<Pet> findPetsByUser(@Param(value="id") java.lang.String id, Pageable pageable);

}
