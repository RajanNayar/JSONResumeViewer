
package com.hunterdavis.jsonresumeviewer.types;

import java.util.List;

public class Resume{
   	private List<Awards> awards;
   	private Basics basics;
   	private List<Education> education;
   	private List<Interests> interests;
   	private List<Languages> languages;
   	private List<Publications> publications;
   	private List<References> references;
   	private List<Skills> skills;
   	private List<Volunteer> volunteer;
   	private List<Work> work;

    @Override
    public String toString() {
        return "Resume{" +
                "awards=" + getAwardsListTextually() + '\'' +
                ", basics=" + basics.toString() + '\'' +
                ", education=" + getEducationListTextually() + '\'' +
                ", interests=" + getInterestListTextually() + '\'' +
                ", languages=" + geLanguagesListTextually() + '\'' +
                ", publications=" + getPublicationsListTextually() + '\'' +
                ", references=" + getReferencesListTextually() + '\'' +
                ", skills=" + getSkillsListTextually() + '\'' +
                ", volunteer=" + getVolunteerListTextually() + '\'' +
                ", work=" + getWorkListTextually() + '\'' +
                '}';
    }

    public String getWorkListTextually() {
        String ret = "";

        if(work != null) {
            for (Work work1 : work) {
                ret += (work1.toString() + "," + '\'');
            }
        }

        return ret;
    }

    public String getVolunteerListTextually() {
        String ret = "";

        if(volunteer != null) {
            for (Volunteer volunteer1 : volunteer) {
                ret += (volunteer1.toString() + "," + '\'');
            }
        }

        return ret;
    }

    public String getSkillsListTextually() {
        String ret = "";

        if(skills != null) {
            for (Skills skills1 : skills) {
                ret += (skills1.toString() + "," + '\'');
            }
        }

        return ret;
    }

    public String getReferencesListTextually() {
        String ret = "";

        if(references != null) {
            for (References references1 : references) {
                ret += (references1.toString() + "," + '\'');
            }
        }

        return ret;
    }

    public String getPublicationsListTextually() {
        String ret = "";

        if(publications != null) {
            for (Publications publications1 : publications) {
                ret += (publications1.toString() + "," + '\'');
            }
        }

        return ret;
    }

    public String geLanguagesListTextually() {
        String ret = "";

        if(languages != null) {
            for (Languages languages1 : languages) {
                ret += (languages1.toString() + "," + '\'');
            }
        }

        return ret;
    }

    public String getInterestListTextually() {
        String ret = "";

        if(interests != null) {
            for (Interests interest : interests) {
                ret += (interest.toString() + "," + '\'');
            }
        }

        return ret;
    }

    public String getAwardsListTextually() {
        String ret = "";

        if(awards != null) {
            for (Awards award : awards) {
                ret += (award.toString() + "," + '\'');
            }
        }

        return ret;
    }

    public String getEducationListTextually() {
        String ret = "";

        if(education != null) {
            for (Education education1 : education) {
                ret += (education1.toString() + "," + '\'');
            }
        }

        return ret;
    }



    public List<Awards> getAwards(){
		return this.awards;
	}
	public void setAwards(List awards){
		this.awards = awards;
	}
 	public Basics getBasics(){
		return this.basics;
	}
	public void setBasics(Basics basics){
		this.basics = basics;
	}
 	public List<Education> getEducation(){
		return this.education;
	}
	public void setEducation(List education){
		this.education = education;
	}
 	public List<Interests> getInterests(){
		return this.interests;
	}
	public void setInterests(List interests){
		this.interests = interests;
	}
 	public List<Languages> getLanguages(){
		return this.languages;
	}
	public void setLanguages(List languages){
		this.languages = languages;
	}
 	public List<Publications> getPublications(){
		return this.publications;
	}
	public void setPublications(List publications){
		this.publications = publications;
	}
 	public List<References> getReferences(){
		return this.references;
	}
	public void setReferences(List references){
		this.references = references;
	}
 	public List<Skills> getSkills(){
		return this.skills;
	}
	public void setSkills(List skills){
		this.skills = skills;
	}
 	public List<Volunteer> getVolunteer(){
		return this.volunteer;
	}
	public void setVolunteer(List volunteer){
		this.volunteer = volunteer;
	}
 	public List<Work> getWork(){
		return this.work;
	}
	public void setWork(List work){
		this.work = work;
	}
}
