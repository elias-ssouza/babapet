package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ATENDIMENTO
 * @generated
 */
@Entity
@Table(name = "\"ATENDIMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Atendimento")
public class Atendimento implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "valor", nullable = false, unique = false, insertable=true, updatable=true)
  
  private float valor;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "tempo", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data_entrada;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIME)
  @Column(name = "horario_entrada", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date horario_entrada;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_pet", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Pet pet;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_cuidador", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Cuidador cuidador;

  /**
  * @generated
  */
  @Column(name = "status", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String status;

  /**
   * Construtor
   * @generated
   */
  public Atendimento(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Atendimento setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém valor
   * return valor
   * @generated
   */
  
  public float getValor(){
    return this.valor;
  }

  /**
   * Define valor
   * @param valor valor
   * @generated
   */
  public Atendimento setValor(float valor){
    this.valor = valor;
    return this;
  }

  /**
   * Obtém data_entrada
   * return data_entrada
   * @generated
   */
  
  public java.util.Date getData_entrada(){
    return this.data_entrada;
  }

  /**
   * Define data_entrada
   * @param data_entrada data_entrada
   * @generated
   */
  public Atendimento setData_entrada(java.util.Date data_entrada){
    this.data_entrada = data_entrada;
    return this;
  }

  /**
   * Obtém horario_entrada
   * return horario_entrada
   * @generated
   */
  
  public java.util.Date getHorario_entrada(){
    return this.horario_entrada;
  }

  /**
   * Define horario_entrada
   * @param horario_entrada horario_entrada
   * @generated
   */
  public Atendimento setHorario_entrada(java.util.Date horario_entrada){
    this.horario_entrada = horario_entrada;
    return this;
  }

  /**
   * Obtém pet
   * return pet
   * @generated
   */
  
  public Pet getPet(){
    return this.pet;
  }

  /**
   * Define pet
   * @param pet pet
   * @generated
   */
  public Atendimento setPet(Pet pet){
    this.pet = pet;
    return this;
  }

  /**
   * Obtém cuidador
   * return cuidador
   * @generated
   */
  
  public Cuidador getCuidador(){
    return this.cuidador;
  }

  /**
   * Define cuidador
   * @param cuidador cuidador
   * @generated
   */
  public Atendimento setCuidador(Cuidador cuidador){
    this.cuidador = cuidador;
    return this;
  }

  /**
   * Obtém status
   * return status
   * @generated
   */
  
  public java.lang.String getStatus(){
    return this.status;
  }

  /**
   * Define status
   * @param status status
   * @generated
   */
  public Atendimento setStatus(java.lang.String status){
    this.status = status;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Atendimento object = (Atendimento)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
