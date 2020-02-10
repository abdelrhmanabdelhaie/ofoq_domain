package com.github.arocketman.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "domain")
public class Domain {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name", nullable = true ,unique = true)
	private String name;
	@Column(name = "code", nullable = true ,unique = true)
	private String code;
	@Column(name = "domain", nullable = true ,unique = true)
	private String domain;
	@Column(name = "port", nullable = true)
	private String port;

	public Domain() {

	}

	

	public Domain(String name, String code, String domain, String port) {
		super();
		this.name = name;
		this.code = code;
		this.domain = domain;
		this.port = port;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Domain [id=" + id + ", name=" + name + ", code=" + code + ", domain=" + domain + ", port=" + port + "]";
	}

}
