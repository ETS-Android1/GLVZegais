package com.glvz.egais.integration.model.doc.income;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.glvz.egais.integration.model.doc.DocContentIn;
import com.glvz.egais.integration.model.doc.DocIn;

import java.util.Arrays;
import java.util.List;

public class IncomeIn implements DocIn {
    @JsonProperty(value="WBRegId")
    private String wbRegId;
    @JsonProperty(value="NUMBER")
    private String number;
    @JsonProperty(value="Date")
    private String date;
    @JsonProperty(value="SkladID")
    private String skladID;
    @JsonProperty(value="SkladName")
    private String skladName;
    @JsonProperty(value="PostID")
    private String postID;
    @JsonProperty(value="PostName")
    private String postName;

    @JsonProperty(value="Content")
    private IncomeContentIn[] content;

    public String getWbRegId() {
        return wbRegId;
    }

    public void setWbRegId(String wbRegId) {
        this.wbRegId = wbRegId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSkladID() {
        return skladID;
    }

    public void setSkladID(String skladID) {
        this.skladID = skladID;
    }

    public String getSkladName() {
        return skladName;
    }

    public void setSkladName(String skladName) {
        this.skladName = skladName;
    }

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public IncomeContentIn[] getContent() {
        return content;
    }

    public void setContent(IncomeContentIn[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "IncomeIn{" +
                "wbRegId='" + wbRegId + '\'' +
                ", number='" + number + '\'' +
                ", date='" + date + '\'' +
                ", skladID='" + skladID + '\'' +
                ", skladName='" + skladName + '\'' +
                ", postID='" + postID + '\'' +
                ", postName='" + postName + '\'' +
                ", content=" + Arrays.toString(content) +
                '}';
    }

    @Override
    public String getDocId() {
        return wbRegId;
    }
}
