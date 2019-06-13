package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiCloud;


/**
 * Classe que representa a tabela PET
 * @generated
 */
@Entity
@Table(name = "\"PET\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Pet")
public class Pet implements Serializable {

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
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "idade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String idade;

  /**
  * @generated
  */
  @Column(name = "raca", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String raca;

  /**
  * @generated
  */
  @Column(name = "foto", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="1lecBaECCVAAAAAAAAABU-G85hFfYTtf5jtuxjcE6pTxrrFdKVr4GMxsvbzU5piI")
  
  private java.lang.String foto;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_dono", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Dono dono;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private User user;

  /**
   * Construtor
   * @generated
   */
  public Pet(){
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
  public Pet setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Pet setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém idade
   * return idade
   * @generated
   */
  
  public java.lang.String getIdade(){
    return this.idade;
  }

  /**
   * Define idade
   * @param idade idade
   * @generated
   */
  public Pet setIdade(java.lang.String idade){
    this.idade = idade;
    return this;
  }

  /**
   * Obtém raca
   * return raca
   * @generated
   */
  
  public java.lang.String getRaca(){
    return this.raca;
  }

  /**
   * Define raca
   * @param raca raca
   * @generated
   */
  public Pet setRaca(java.lang.String raca){
    this.raca = raca;
    return this;
  }

  /**
   * Obtém foto
   * return foto
   * @generated
   */
  
  public java.lang.String getFoto(){
    return this.foto;
  }

  /**
   * Define foto
   * @param foto foto
   * @generated
   */
  public Pet setFoto(java.lang.String foto){
    this.foto = foto;
    return this;
  }

  /**
   * Obtém dono
   * return dono
   * @generated
   */
  
  public Dono getDono(){
    return this.dono;
  }

  /**
   * Define dono
   * @param dono dono
   * @generated
   */
  public Pet setDono(Dono dono){
    this.dono = dono;
    return this;
  }

  /**
   * Obtém user
   * return user
   * @generated
   */
  
  public User getUser(){
    return this.user;
  }

  /**
   * Define user
   * @param user user
   * @generated
   */
  public Pet setUser(User user){
    this.user = user;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pet object = (Pet)obj;
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
