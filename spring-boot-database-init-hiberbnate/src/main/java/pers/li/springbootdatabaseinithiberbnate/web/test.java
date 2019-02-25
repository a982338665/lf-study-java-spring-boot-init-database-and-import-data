package pers.li.springbootdatabaseinithiberbnate.web;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "test")
//@SequenceGenerator(name="employee_id_seq", initialValue=1, allocationSize=1)
public class test implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  @Id
//  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="employee_id_seq")
//  @GeneratedValue(strategy = GenerationType.AUTO)
  /**
   * mysql的自增长模式是IDENTITY。
   */
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "hello_1", nullable = false, length = 30)
  private String companyName;

  @Column(name = "hello_2", nullable = false)
  private boolean active;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

}
