
package com.hunterdavis.jsonresumeviewer.types;

import android.text.TextUtils;

import java.util.List;

public class Volunteer{
   	private String endDate;
   	private List<String> highlights;
   	private String organization;
   	private String position;
   	private String startDate;
   	private String summary;
   	private String website;

    @Override
    public String toString() {
        return "Volunteer{" +
                "endDate='" + endDate + '\'' +
                ", highlights=" + getHighlightListTextually()  + '\'' +
                ", organization='" + organization + '\'' +
                ", position='" + position + '\'' +
                ", startDate='" + startDate + '\'' +
                ", summary='" + summary + '\'' +
                ", website='" + website + '\'' +
                '}';
    }

    public String getHighlightListTextually() {
        return TextUtils.join("\n", highlights);
    }

    public String getEndDate(){
		return this.endDate;
	}
	public void setEndDate(String endDate){
		this.endDate = endDate;
	}
 	public List getHighlights(){
		return this.highlights;
	}
	public void setHighlights(List highlights){
		this.highlights = highlights;
	}
 	public String getOrganization(){
		return this.organization;
	}
	public void setOrganization(String organization){
		this.organization = organization;
	}
 	public String getPosition(){
		return this.position;
	}
	public void setPosition(String position){
		this.position = position;
	}
 	public String getStartDate(){
		return this.startDate;
	}
	public void setStartDate(String startDate){
		this.startDate = startDate;
	}
 	public String getSummary(){
		return this.summary;
	}
	public void setSummary(String summary){
		this.summary = summary;
	}
 	public String getWebsite(){
		return this.website;
	}
	public void setWebsite(String website){
		this.website = website;
	}
}
