package gr.manousos.model;

import javax.xml.bind.annotation.XmlRootElement;

// Generated 2 Μαρ 2013 9:35:29 μμ by Hibernate Tools 3.4.0.CR1

/**
 * E1relatePersons generated by hbm2java
 */
@XmlRootElement
public class E1relatePersons implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private E1relatePersonsId id;
	private RelatePerson relatePerson;
	private E1 e1;

	public E1relatePersons() {
	}

	public E1relatePersons(E1relatePersonsId id, RelatePerson relatePerson,
			E1 e1) {
		this.id = id;
		this.relatePerson = relatePerson;
		this.e1 = e1;
	}

	public E1relatePersonsId getId() {
		return this.id;
	}

	public void setId(E1relatePersonsId id) {
		this.id = id;
	}

	public RelatePerson getRelatePerson() {
		return this.relatePerson;
	}

	public void setRelatePerson(RelatePerson relatePerson) {
		this.relatePerson = relatePerson;
	}

	public E1 getE1() {
		return this.e1;
	}

	public void setE1(E1 e1) {
		this.e1 = e1;
	}

}
