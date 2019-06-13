package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela AVALIACAO
 * @generated
 */
@Entity
@Table(name = "\"AVALIACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Avaliacao")
public class Avaliacao implements Serializable {

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
  @Column(name = "avaliacao", nullable = false, unique = false, precision=5, scale=5, insertable=true, updatable=true)
  
  private java.lang.Double nota;

  /**
  * @generated
  */
  @Column(name = "texto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String texto;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_atendimento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Atendimento atendimento;

  /**
   * Construtor
   * @generated
   */
  public Avaliacao(){
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
  public Avaliacao setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nota
   * return nota
   * @generated
   */
  
  public java.lang.Double getNota(){
    return this.nota;
  }

  /**
   * Define nota
   * @param nota nota
   * @generated
   */
  public Avaliacao setNota(java.lang.Double nota){
    this.nota = nota;
    return this;
  }

  /**
   * Obtém texto
   * return texto
   * @generated
   */
  
  public java.lang.String getTexto(){
    return this.texto;
  }

  /**
   * Define texto
   * @param texto texto
   * @generated
   */
  public Avaliacao setTexto(java.lang.String texto){
    this.texto = texto;
    return this;
  }

  /**
   * Obtém atendimento
   * return atendimento
   * @generated
   */
  
  public Atendimento getAtendimento(){
    return this.atendimento;
  }

  /**
   * Define atendimento
   * @param atendimento atendimento
   * @generated
   */
  public Avaliacao setAtendimento(Atendimento atendimento){
    this.atendimento = atendimento;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Avaliacao object = (Avaliacao)obj;
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
