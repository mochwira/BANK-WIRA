/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wira.databank.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mocha
 */
@Entity
@Table(name = "nasabah")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nasabah.findAll", query = "SELECT n FROM Nasabah n"),
    @NamedQuery(name = "Nasabah.findByNasabahId", query = "SELECT n FROM Nasabah n WHERE n.nasabahId = :nasabahId"),
    @NamedQuery(name = "Nasabah.findByNamaLengkap", query = "SELECT n FROM Nasabah n WHERE n.namaLengkap = :namaLengkap"),
    @NamedQuery(name = "Nasabah.findByAlamat", query = "SELECT n FROM Nasabah n WHERE n.alamat = :alamat"),
    @NamedQuery(name = "Nasabah.findByTempatLahir", query = "SELECT n FROM Nasabah n WHERE n.tempatLahir = :tempatLahir"),
    @NamedQuery(name = "Nasabah.findByTanggalLahir", query = "SELECT n FROM Nasabah n WHERE n.tanggalLahir = :tanggalLahir"),
    @NamedQuery(name = "Nasabah.findByNoHp", query = "SELECT n FROM Nasabah n WHERE n.noHp = :noHp"),
    @NamedQuery(name = "Nasabah.findByNoKtp", query = "SELECT n FROM Nasabah n WHERE n.noKtp = :noKtp")})
public class Nasabah implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "nasabah_id")
    private Integer nasabahId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nama_lengkap")
    private String namaLengkap;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 225)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tempat_lahir")
    private String tempatLahir;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tanggal_lahir")
    private String tanggalLahir;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "no_hp")
    private String noHp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "no_ktp")
    private String noKtp;

    public Nasabah() {
    }

    public Nasabah(Integer nasabahId) {
        this.nasabahId = nasabahId;
    }

    public Nasabah(Integer nasabahId, String namaLengkap, String alamat, String tempatLahir, String tanggalLahir, String noHp, String noKtp) {
        this.nasabahId = nasabahId;
        this.namaLengkap = namaLengkap;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.noHp = noHp;
        this.noKtp = noKtp;
    }

    public Integer getNasabahId() {
        return nasabahId;
    }

    public void setNasabahId(Integer nasabahId) {
        this.nasabahId = nasabahId;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nasabahId != null ? nasabahId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nasabah)) {
            return false;
        }
        Nasabah other = (Nasabah) object;
        if ((this.nasabahId == null && other.nasabahId != null) || (this.nasabahId != null && !this.nasabahId.equals(other.nasabahId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wira.databank.entity.Nasabah[ nasabahId=" + nasabahId + " ]";
    }
    
}
