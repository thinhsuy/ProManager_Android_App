package com.example.promanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Project_Database {
    private String projectID;
    private String projectName;
    private String projectOwner;
    private String projectDeadline;
    private String projectDescribe;
    private String projectPrivacy;

    public ArrayList<String> activityIdList;

    public Project_Database(String projectName, String projectDeadline, String projectDescribe) {
        this.projectName = projectName;
        this.projectDeadline = projectDeadline;
        this.projectDescribe = projectDescribe;
    }

    public Project_Database() {
    }

    public ArrayList<String> getActivityIdList() {
        return activityIdList;
    }

    public void setActivityIdList(ArrayList<String> activityIdList) {
        this.activityIdList = activityIdList;
    }

    public void addActivityList(String actId){
        this.activityIdList.add(actId);
    }
    public void removeActivityList(String actId) {
        this.activityIdList.remove(actId);
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectOwner() {
        return projectOwner;
    }

    public void setProjectOwner(String projectOwner) {
        this.projectOwner = projectOwner;
    }

    public String getProjectDeadline() {
        return projectDeadline;
    }

    public void setProjectDeadline(String projectDeadline) {
        this.projectDeadline = projectDeadline;
    }

    public String getProjectDescribe() {
        return projectDescribe;
    }

    public void setProjectDescribe(String projectDescribe) {
        this.projectDescribe = projectDescribe;
    }

    public String getProjectPrivacy() {
        return projectPrivacy;
    }

    public void setProjectPrivacy(String projectPrivacy) {
        this.projectPrivacy = projectPrivacy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectID='" + projectID + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectOwner='" + projectOwner + '\'' +
                ", projectDeadline='" + projectDeadline + '\'' +
                ", projectDescribe='" + projectDescribe + '\'' +
                ", projectPrivacy='" + projectPrivacy + '\'' +
                '}';
    }

    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("projectID", this.projectID);
        result.put("projectName", this.projectName);
        result.put("projectOwner", this.projectOwner);
        result.put("projectDeadline", this.projectDeadline);
        result.put("projectDescribe", this.projectDescribe);
        result.put("projectPrivacy", this.projectPrivacy);
        result.put("activityIdList", this.activityIdList);
        return result;
    }
}
