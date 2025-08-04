package com.Stock_Overflow.Sneaky_Business.model;

import jakarta.persistence.*;

@Entity
public class DocumentUpload {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String filename;
    private String fileType; // PDF or Image
    private String path;

    @ManyToOne
    private Business business;

    public void setBusiness(Business business) {
        this.business = business;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getId() {
        return id;
    }

    public String getFilename() {
        return filename;
    }

    public String getFileType() {
        return fileType;
    }

    public String getPath() {
        return path;
    }

    public Business getBusiness() {
        return business;
    }
}
