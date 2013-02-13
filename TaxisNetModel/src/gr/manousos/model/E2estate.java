package gr.manousos.model;

// Generated 17 Ιαν 2013 11:03:44 μμ by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * E2estate generated by hbm2java
 */
@XmlRootElement
public class E2estate implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer estateId;
	private E2 e2;
	private String location;
	private String position;
	private String usage;
	private float area;
	private String tenantFullName;
	private String tenantAfm;
	private int from;
	private int to;
	private float monthlyRental;
	private float rersentCoOwner;
	private float revenueFreeHome;
	private float revenueFreeOffice;
	private float revenuePrivateHotel;
	private float revenuePrivateOffice;
	private Set<E2coOwner> e2coOwners = new HashSet<E2coOwner>(0);

	public E2estate() {
	}

	public E2estate(E2 e2, String location, String position, String usage,
			float area, String tenantFullName, String tenantAfm, int from,
			int to, float monthlyRental, float rersentCoOwner,
			float revenueFreeHome, float revenueFreeOffice,
			float revenuePrivateHotel, float revenuePrivateOffice) {
		this.e2 = e2;
		this.location = location;
		this.position = position;
		this.usage = usage;
		this.area = area;
		this.tenantFullName = tenantFullName;
		this.tenantAfm = tenantAfm;
		this.from = from;
		this.to = to;
		this.monthlyRental = monthlyRental;
		this.rersentCoOwner = rersentCoOwner;
		this.revenueFreeHome = revenueFreeHome;
		this.revenueFreeOffice = revenueFreeOffice;
		this.revenuePrivateHotel = revenuePrivateHotel;
		this.revenuePrivateOffice = revenuePrivateOffice;
	}

	public E2estate(E2 e2, String location, String position, String usage,
			float area, String tenantFullName, String tenantAfm, int from,
			int to, float monthlyRental, float rersentCoOwner,
			float revenueFreeHome, float revenueFreeOffice,
			float revenuePrivateHotel, float revenuePrivateOffice,
			Set<E2coOwner> e2coOwners) {
		this.e2 = e2;
		this.location = location;
		this.position = position;
		this.usage = usage;
		this.area = area;
		this.tenantFullName = tenantFullName;
		this.tenantAfm = tenantAfm;
		this.from = from;
		this.to = to;
		this.monthlyRental = monthlyRental;
		this.rersentCoOwner = rersentCoOwner;
		this.revenueFreeHome = revenueFreeHome;
		this.revenueFreeOffice = revenueFreeOffice;
		this.revenuePrivateHotel = revenuePrivateHotel;
		this.revenuePrivateOffice = revenuePrivateOffice;
		this.e2coOwners = e2coOwners;
	}

	public Integer getEstateId() {
		return this.estateId;
	}

	public void setEstateId(Integer estateId) {
		this.estateId = estateId;
	}

	public E2 getE2() {
		return this.e2;
	}

	public void setE2(E2 e2) {
		this.e2 = e2;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getUsage() {
		return this.usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public float getArea() {
		return this.area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public String getTenantFullName() {
		return this.tenantFullName;
	}

	public void setTenantFullName(String tenantFullName) {
		this.tenantFullName = tenantFullName;
	}

	public String getTenantAfm() {
		return this.tenantAfm;
	}

	public void setTenantAfm(String tenantAfm) {
		this.tenantAfm = tenantAfm;
	}

	public int getFrom() {
		return this.from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return this.to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	public float getMonthlyRental() {
		return this.monthlyRental;
	}

	public void setMonthlyRental(float monthlyRental) {
		this.monthlyRental = monthlyRental;
	}

	public float getRersentCoOwner() {
		return this.rersentCoOwner;
	}

	public void setRersentCoOwner(float rersentCoOwner) {
		this.rersentCoOwner = rersentCoOwner;
	}

	public float getRevenueFreeHome() {
		return this.revenueFreeHome;
	}

	public void setRevenueFreeHome(float revenueFreeHome) {
		this.revenueFreeHome = revenueFreeHome;
	}

	public float getRevenueFreeOffice() {
		return this.revenueFreeOffice;
	}

	public void setRevenueFreeOffice(float revenueFreeOffice) {
		this.revenueFreeOffice = revenueFreeOffice;
	}

	public float getRevenuePrivateHotel() {
		return this.revenuePrivateHotel;
	}

	public void setRevenuePrivateHotel(float revenuePrivateHotel) {
		this.revenuePrivateHotel = revenuePrivateHotel;
	}

	public float getRevenuePrivateOffice() {
		return this.revenuePrivateOffice;
	}

	public void setRevenuePrivateOffice(float revenuePrivateOffice) {
		this.revenuePrivateOffice = revenuePrivateOffice;
	}

	public Set<E2coOwner> getE2coOwners() {
		return this.e2coOwners;
	}

	public void setE2coOwners(Set<E2coOwner> e2coOwners) {
		this.e2coOwners = e2coOwners;
	}

}
