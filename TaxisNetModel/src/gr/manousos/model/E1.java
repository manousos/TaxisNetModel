package gr.manousos.model;

//Generated 18 Μαρ 2013 12:42:56 πμ by Hibernate Tools 3.4.0.CR1

import gr.manousos.model.RelatePerson;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * E1 generated by hbm2java
 */
@XmlRootElement
public class E1 implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private E1Id id;
    private E1reduceTax e1reduceTax;
    private E1objectiveSpending e1objectiveSpending;
    private E1taxPayerBankAccount e1taxPayerBankAccount;
    private Taxpayer taxpayer;
    private E1infoData e1infoData;
    private E1dataFromTaxPayerFolder e1dataFromTaxPayerFolder;
    private E1personDataBorneTaxpayer e1personDataBorneTaxpayer;
    private E1expensesRemovedFromTotalIncome e1expensesRemovedFromTotalIncome;
    private E1nauticalincomes e1nauticalincomes;
    private E1prepaidTaxes e1prepaidTaxes;
    private E1taxableIncomes e1taxableIncomes;
    private E1incomesReduceTaxes e1incomesReduceTaxes;
    private String taxpayerAddress;
    private String atid;
    private Integer isComplete;
    private Date dateInserted;
    private String doy;
    private Integer marriage;
    private IncomeTax incomeTax;
    private Set<RelatePerson> relatePersons = new HashSet<RelatePerson>(0);

    public E1() {
    }

    public E1(E1Id id, Taxpayer taxpayer, String taxpayerAddress, String atid,
	    String doy, Integer marriage) {
	this.id = id;
	this.taxpayer = taxpayer;
	this.taxpayerAddress = taxpayerAddress;
	this.atid = atid;
	this.doy = doy;
	this.marriage = marriage;
    }

    public E1(E1Id id, E1reduceTax e1reduceTax,
	    E1objectiveSpending e1objectiveSpending,
	    E1taxPayerBankAccount e1taxPayerBankAccount, Taxpayer taxpayer,
	    E1infoData e1infoData,
	    E1dataFromTaxPayerFolder e1dataFromTaxPayerFolder,
	    E1personDataBorneTaxpayer e1personDataBorneTaxpayer,
	    E1expensesRemovedFromTotalIncome e1expensesRemovedFromTotalIncome,
	    E1prepaidTaxes e1prepaidTaxes, E1taxableIncomes e1taxableIncomes,
	    E1incomesReduceTaxes e1incomesReduceTaxes, String taxpayerAddress,
	    String atid, Integer isComplete, Date dateInserted,
	    IncomeTax incomeTax, Set<RelatePerson> relatePersons, String doy,
	    Integer marriage) {
	this.id = id;
	this.e1reduceTax = e1reduceTax;
	this.e1objectiveSpending = e1objectiveSpending;
	this.e1taxPayerBankAccount = e1taxPayerBankAccount;
	this.taxpayer = taxpayer;
	this.e1infoData = e1infoData;
	this.e1dataFromTaxPayerFolder = e1dataFromTaxPayerFolder;
	this.e1personDataBorneTaxpayer = e1personDataBorneTaxpayer;
	this.e1expensesRemovedFromTotalIncome = e1expensesRemovedFromTotalIncome;
	this.e1prepaidTaxes = e1prepaidTaxes;
	this.e1taxableIncomes = e1taxableIncomes;
	this.e1incomesReduceTaxes = e1incomesReduceTaxes;
	this.taxpayerAddress = taxpayerAddress;
	this.atid = atid;
	this.isComplete = isComplete;
	this.dateInserted = dateInserted;
	this.incomeTax = incomeTax;
	this.relatePersons = relatePersons;
	this.doy = doy;
	this.marriage = marriage;
    }

    public E1(E1Id id, IncomeTax incomeTax) {
	this.id = id;
	this.incomeTax = incomeTax;
    }

    public E1Id getId() {
	return this.id;
    }

    public void setId(E1Id id) {
	this.id = id;
    }

    public E1reduceTax getE1reduceTax() {
	return this.e1reduceTax;
    }

    public void setE1reduceTax(E1reduceTax e1reduceTax) {
	this.e1reduceTax = e1reduceTax;
    }

    public E1objectiveSpending getE1objectiveSpending() {
	return this.e1objectiveSpending;
    }

    public void setE1objectiveSpending(E1objectiveSpending e1objectiveSpending) {
	this.e1objectiveSpending = e1objectiveSpending;
    }

    public E1taxPayerBankAccount getE1taxPayerBankAccount() {
	return this.e1taxPayerBankAccount;
    }

    public void setE1taxPayerBankAccount(
	    E1taxPayerBankAccount e1taxPayerBankAccount) {
	this.e1taxPayerBankAccount = e1taxPayerBankAccount;
    }

    public Taxpayer getTaxpayer() {
	return this.taxpayer;
    }

    public void setTaxpayer(Taxpayer taxpayer) {
	this.taxpayer = taxpayer;
    }

    public E1infoData getE1infoData() {
	return this.e1infoData;
    }

    public void setE1infoData(E1infoData e1infoData) {
	this.e1infoData = e1infoData;
    }

    public E1dataFromTaxPayerFolder getE1dataFromTaxPayerFolder() {
	return this.e1dataFromTaxPayerFolder;
    }

    public void setE1dataFromTaxPayerFolder(
	    E1dataFromTaxPayerFolder e1dataFromTaxPayerFolder) {
	this.e1dataFromTaxPayerFolder = e1dataFromTaxPayerFolder;
    }

    public E1personDataBorneTaxpayer getE1personDataBorneTaxpayer() {
	return this.e1personDataBorneTaxpayer;
    }

    public void setE1personDataBorneTaxpayer(
	    E1personDataBorneTaxpayer e1personDataBorneTaxpayer) {
	this.e1personDataBorneTaxpayer = e1personDataBorneTaxpayer;
    }

    public E1expensesRemovedFromTotalIncome getE1expensesRemovedFromTotalIncome() {
	return this.e1expensesRemovedFromTotalIncome;
    }

    public void setE1expensesRemovedFromTotalIncome(
	    E1expensesRemovedFromTotalIncome e1expensesRemovedFromTotalIncome) {
	this.e1expensesRemovedFromTotalIncome = e1expensesRemovedFromTotalIncome;
    }

    public E1nauticalincomes getE1nauticalincomes() {
	return this.e1nauticalincomes;
    }

    public void setE1nauticalincomes(E1nauticalincomes e1nauticalincomes) {
	this.e1nauticalincomes = e1nauticalincomes;
    }

    public E1prepaidTaxes getE1prepaidTaxes() {
	return this.e1prepaidTaxes;
    }

    public void setE1prepaidTaxes(E1prepaidTaxes e1prepaidTaxes) {
	this.e1prepaidTaxes = e1prepaidTaxes;
    }

    public E1taxableIncomes getE1taxableIncomes() {
	return this.e1taxableIncomes;
    }

    public void setE1taxableIncomes(E1taxableIncomes e1taxableIncomes) {
	this.e1taxableIncomes = e1taxableIncomes;
    }

    public E1incomesReduceTaxes getE1incomesReduceTaxes() {
	return this.e1incomesReduceTaxes;
    }

    public void setE1incomesReduceTaxes(
	    E1incomesReduceTaxes e1incomesReduceTaxes) {
	this.e1incomesReduceTaxes = e1incomesReduceTaxes;
    }

    public String getTaxpayerAddress() {
	return this.taxpayerAddress;
    }

    public void setTaxpayerAddress(String taxpayerAddress) {
	this.taxpayerAddress = taxpayerAddress;
    }

    public String getAtid() {
	return this.atid;
    }

    public void setAtid(String atid) {
	this.atid = atid;
    }

    public Integer getIsComplete() {
	return this.isComplete;
    }

    public void setIsComplete(Integer isComplete) {
	this.isComplete = isComplete;
    }

    public Date getDateInserted() {
	return this.dateInserted;
    }

    public void setDateInserted(Date dateInserted) {
	this.dateInserted = dateInserted;
    }

    public String getDoy() {
	return this.doy;
    }

    public void setDoy(String doy) {
	this.doy = doy;
    }

    public Integer getMarriage() {
	return this.marriage;
    }

    public void setMarriage(Integer marriage) {
	this.marriage = marriage;
    }

    public IncomeTax getIncomeTax() {
	return incomeTax;
    }

    public void setIncomeTax(IncomeTax incomeTax) {
	this.incomeTax = incomeTax;
    }

    public Set<RelatePerson> getRelatePersons() {
	return relatePersons;
    }

    public void setRelatePersons(Set<RelatePerson> relatePersons) {
	this.relatePersons = relatePersons;
    }

}
