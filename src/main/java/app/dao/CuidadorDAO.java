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
@Repository("CuidadorDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface CuidadorDAO extends JpaRepository<Cuidador, java.lang.String> {

  /**
   * Obtém a instância de Cuidador utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Cuidador entity WHERE entity.id = :id")
  public Cuidador findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Cuidador utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Cuidador entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Atendimento entity WHERE entity.cuidador.id = :id")
  public Page<Atendimento> findAtendimento(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.pet FROM Atendimento entity WHERE entity.cuidador.id = :id")
  public Page<Pet> listPet(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Atendimento entity WHERE entity.cuidador.id = :instanceId AND entity.pet.id = :relationId")
  public int deletePet(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
