/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_Project;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author suxia
 */
@Entity
@Table(name = "lostandfound", catalog = "stuff", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lostandfound.findAll", query = "SELECT l FROM Lostandfound l")
    , @NamedQuery(name = "Lostandfound.findByStuffID", query = "SELECT l FROM Lostandfound l WHERE l.stuffID = :stuffID")
    , @NamedQuery(name = "Lostandfound.findByName", query = "SELECT l FROM Lostandfound l WHERE l.name = :name")
    , @NamedQuery(name = "Lostandfound.findByColor", query = "SELECT l FROM Lostandfound l WHERE l.color = :color")
    , @NamedQuery(name = "Lostandfound.findByBrand", query = "SELECT l FROM Lostandfound l WHERE l.brand = :brand")
    , @NamedQuery(name = "Lostandfound.findByPattern", query = "SELECT l FROM Lostandfound l WHERE l.pattern = :pattern")
    , @NamedQuery(name = "Lostandfound.findByLength", query = "SELECT l FROM Lostandfound l WHERE l.length = :length")
    , @NamedQuery(name = "Lostandfound.findByWidth", query = "SELECT l FROM Lostandfound l WHERE l.width = :width")
    , @NamedQuery(name = "Lostandfound.findByAddress", query = "SELECT l FROM Lostandfound l WHERE l.address = :address")
    , @NamedQuery(name = "Lostandfound.findByDate", query = "SELECT l FROM Lostandfound l WHERE l.date = :date")
    , @NamedQuery(name = "Lostandfound.findByStatus", query = "SELECT l FROM Lostandfound l WHERE l.status = :status")
    , @NamedQuery(name = "Lostandfound.findByDescription", query = "SELECT l FROM Lostandfound l WHERE l.description = :description")})
public class Lostandfound implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "stuff_ID", nullable = false)
    private Integer stuffID;
    @Size(max = 45)
    @Column(name = "name", length = 45)
    private String name;
    @Size(max = 45)
    @Column(name = "color", length = 45)
    private String color;
    @Size(max = 45)
    @Column(name = "brand", length = 45)
    private String brand;
    @Size(max = 45)
    @Column(name = "pattern", length = 45)
    private String pattern;
    @Size(max = 45)
    @Column(name = "length", length = 45)
    private String length;
    @Size(max = 45)
    @Column(name = "width", length = 45)
    private String width;
    @Size(max = 45)
    @Column(name = "address", length = 45)
    private String address;
    @Size(max = 45)
    @Column(name = "date", length = 45)
    private String date;
    @Size(max = 45)
    @Column(name = "status", length = 45)
    private String status;
    @Size(max = 45)
    @Column(name = "description", length = 45)
    private String description;

    public Lostandfound() {
    }

    public Lostandfound(Integer stuffID) {
        this.stuffID = stuffID;
    }

    public Integer getStuffID() {
        return stuffID;
    }

    public void setStuffID(Integer stuffID) {
        this.stuffID = stuffID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stuffID != null ? stuffID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lostandfound)) {
            return false;
        }
        Lostandfound other = (Lostandfound) object;
        if ((this.stuffID == null && other.stuffID != null) || (this.stuffID != null && !this.stuffID.equals(other.stuffID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database_Project.Lostandfound[ stuffID=" + stuffID + " ]";
    }
    
}
