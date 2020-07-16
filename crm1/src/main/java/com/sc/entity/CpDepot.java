package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CpDepot implements Serializable {
	
	@Override
	public String toString() {
		return "CpDepot [depotId=" + depotId + ", depotName=" + depotName + ", remarkMessage=" + remarkMessage
				+ ", companyId=" + companyId + ", lastModifiedTime=" + lastModifiedTime + ", datemin=" + datemin
				+ ", datemax=" + datemax + "]";
	}

	private BigDecimal depotId;

    private String depotName;

    private String remarkMessage;

    private String companyId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifiedTime;
    
    //扩展属性，用于查询
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemin;    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemax;
    
    //扩展属性，用于查询	start
    public Date getDatemin() {
		return datemin;
	}

	public void setDatemin(Date datemin) {
		this.datemin = datemin;
	}

	public Date getDatemax() {
		return datemax;
	}

	public void setDatemax(Date datemax) {
		this.datemax = datemax;
	}
	//扩展属性，用于查询	end

	private static final long serialVersionUID = 1L;

    public CpDepot(BigDecimal depotId, String depotName, String remarkMessage, String companyId, Date lastModifiedTime) {
        this.depotId = depotId;
        this.depotName = depotName;
        this.remarkMessage = remarkMessage;
        this.companyId = companyId;
        this.lastModifiedTime = lastModifiedTime;
    }

    public CpDepot() {
        super();
    }

    public BigDecimal getDepotId() {
        return depotId;
    }

    public void setDepotId(BigDecimal depotId) {
        this.depotId = depotId;
    }

    public String getDepotName() {
        return depotName;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName == null ? null : depotName.trim();
    }

    public String getRemarkMessage() {
        return remarkMessage;
    }

    public void setRemarkMessage(String remarkMessage) {
        this.remarkMessage = remarkMessage == null ? null : remarkMessage.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }
}