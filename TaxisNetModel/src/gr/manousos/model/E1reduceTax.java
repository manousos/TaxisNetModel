package gr.manousos.model;

// Generated 3 Ιουν 2013 11:58:42 μμ by Hibernate Tools 3.4.0.CR1

import javax.xml.bind.annotation.XmlRootElement;

/**
 * E1reduceTax generated by hbm2java
 */
@XmlRootElement
public class E1reduceTax implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private E1reduceTaxId id;
    private E1 e1;
    private Integer _001;
    private Integer _002;
    private Integer _003;
    private Integer _004;
    private Integer _005;
    private Integer _006;

    public E1reduceTax() {
    }

    public E1reduceTax(E1 e1) {
	this.e1 = e1;
    }

    public E1reduceTax(E1 e1, Integer _001, Integer _002, Integer _003,
	    Integer _004, Integer _005, Integer _006) {
	this.e1 = e1;
	this._001 = _001;
	this._002 = _002;
	this._003 = _003;
	this._004 = _004;
	this._005 = _005;
	this._006 = _006;
    }

    public E1reduceTaxId getId() {
	return this.id;
    }

    public void setId(E1reduceTaxId id) {
	this.id = id;
    }

    public E1 getE1() {
	return this.e1;
    }

    public void setE1(E1 e1) {
	this.e1 = e1;
    }

    public Integer get_001() {
	return this._001;
    }

    public void set001(Integer _001) {
	this._001 = _001;
    }

    public Integer get_002() {
	return _002;
    }

    public void set_002(Integer _002) {
	this._002 = _002;
    }

    public Integer get_003() {
	return _003;
    }

    public void set_003(Integer _003) {
	this._003 = _003;
    }

    public Integer get_004() {
	return _004;
    }

    public void set_004(Integer _004) {
	this._004 = _004;
    }

    public Integer get_005() {
	return _005;
    }

    public void set_005(Integer _005) {
	this._005 = _005;
    }

    public Integer get_006() {
	return _006;
    }

    public void set_006(Integer _006) {
	this._006 = _006;
    }

    public void set_001(Integer _001) {
	this._001 = _001;
    }

}
