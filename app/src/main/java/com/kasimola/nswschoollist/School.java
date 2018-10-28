package com.kasimola.nswschoollist;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class School {
    private String supportClasses;
    private String principalNetwork;
    private String dateExtracted;
    private String fedElectorate;
    private String icseaValue;
    private long latitude;
    private String townSuburb;
    private boolean distanceEducation;
    private String fax;
    private String levelOfSchooling;
    private String localHealthDistrict;
    private String aecgRegion;
    private String phone;
    private String indigenousPercentage;
    private String ageId;
    private int studentNumber;
    private boolean opportunityClass;
    private boolean intensiveEnglishCentre;
    private String schoolSpecialityType;
    private String schoolSubtype;
    private boolean lateOpeningSchool;
    private long longitude;
    private String asgsRemoteness;
    private boolean healthyCanteen;
    private boolean preschoolInd;
    private boolean selectiveSchool;
    private String sa4;
    private String facsDistrict;
    private String schoolEmail;
    private String lga;
    private String schoolName;
    private String date1stTeacher;
    private String street;
    private String postcode;
    private String schoolGender;
    private String electorate;
    private String operationalDirectorate;
    private String schoolCode;
    private double lbotePercent;

    public String getSupportClasses()
    {
        return this.supportClasses;
    }

    public String getPrincipalNetwork()
    {
        return this.principalNetwork;
    }

    public String getDateExtracted()
    {
        return this.dateExtracted;
    }

    public String getFedElectorate() {
        return fedElectorate;
    }

    public String getIcseaValue()
    {
        return icseaValue;
    }

    public float getLatitude() {
        return latitude;
    }

    public String getTownSuburb() {
        return townSuburb;
    }

    public boolean isDistanceEducation() {
        return distanceEducation;
    }

    public boolean isHealthyCanteen() {
        return healthyCanteen;
    }

    public boolean isIntensiveEnglishCentre() {
        return intensiveEnglishCentre;
    }

    public boolean isLateOpeningSchool() {
        return lateOpeningSchool;
    }

    public boolean isOpportunityClass() {
        return opportunityClass;
    }

    public boolean isPreschoolInd() {
        return preschoolInd;
    }

    public float getLongitude() {
        return longitude;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public double getLbotePercent() {
        return lbotePercent;
    }

    public String getAecgRegion() {
        return aecgRegion;
    }

    public String getAgeId() {
        return ageId;
    }

    public String getAsgsRemoteness() {
        return asgsRemoteness;
    }

    public String getFax() {
        return fax;
    }

    public String getFacsDistrict() {
        return facsDistrict;
    }

    public String getIndigenousPercentage() {
        return indigenousPercentage;
    }

    public String getLevelOfSchooling() {
        return levelOfSchooling;
    }

    public String getLocalHealthDistrict() {
        return localHealthDistrict;
    }

    public String getPhone() {
        return phone;
    }

    public String getSchoolSpecialityType() {
        return schoolSpecialityType;
    }

    public String getSa4() {
        return sa4;
    }

    public String getSchoolSubtype() {
        return schoolSubtype;
    }

    public boolean getSelectiveSchool() {
        return selectiveSchool;
    }

    public String getDate1stTeacher() {
        return date1stTeacher;
    }

    public String getElectorate() {
        return electorate;
    }

    public String getSchoolEmail() {
        return schoolEmail;
    }

    public String getLga() {
        return lga;
    }

    public String getOperationalDirectorate() {
        return operationalDirectorate;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public String getSchoolGender() {
        return schoolGender;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getStreet() {
        return street;
    }

    public static School fromJson(JSONObject jsonObject) {
        School s = new School();
        // Deserialize json into object fields
        try {
            s.supportClasses = jsonObject.getString("Support_classes");
            s.principalNetwork = jsonObject.getString("Principal_network");
            s.dateExtracted = jsonObject.getString("Date_extracted");
            s.fedElectorate = jsonObject.getString("Fed_electorate");
            s.icseaValue = jsonObject.getString("ICSEA_value");
            s.latitude = jsonObject.getLong("Latitude");
            s.townSuburb = jsonObject.getString("Town_suburb");
            if(jsonObject.getString("Distance_education") == "Y") {
                s.distanceEducation = true;
            }
            else
                s.distanceEducation = false;
            s.fax = jsonObject.getString("Fax");
            s.levelOfSchooling = jsonObject.getString("Level_of_schooling");
            s.localHealthDistrict = jsonObject.getString("Local_health_district");
            s.aecgRegion = jsonObject.getString("AECG_region");
            s.phone = jsonObject.getString("Phone");
            s.indigenousPercentage = jsonObject.getString("Indigenous_pct");
            s.ageId = jsonObject.getString("AgeID");
            s.studentNumber = jsonObject.getInt("Student_number");
            if(jsonObject.getString("Opportunity_class") == "Y")
            {
                s.opportunityClass = true;
            }
            else {
                s.opportunityClass = false;
            }
            if(jsonObject.getString("Fed_electorate") == "Y")
            {
                s.intensiveEnglishCentre = true;
            }
            else
            {
                s.intensiveEnglishCentre = false;
            }
            s.schoolSpecialityType = jsonObject.getString("School_specialty_type");
            if(jsonObject.getString("Late_opening_school") == "Y")
            {
                s.lateOpeningSchool = true;
            }
            else {
                s.lateOpeningSchool = false;
            }
            s.longitude = jsonObject.getLong("Longitude");
            s.asgsRemoteness = jsonObject.getString("ASGS_remoteness");
            if(jsonObject.getString("Healthy canteen") == "Y")
            {
                s.healthyCanteen = true;
            }
            else
            {
                s.healthyCanteen = false;
            }
            if(jsonObject.getString("Preschool_ind") == "Y") {
                s.preschoolInd = true;
            }
            else{
                s.preschoolInd = false;
            }
            if(jsonObject.getString("Selective_school") == "Y") {
                s.selectiveSchool = true;
            } else {
                s.selectiveSchool = false;
            }
            s.sa4 = jsonObject.getString("SA4");
            s.facsDistrict = jsonObject.getString("FACS_district");
            s.schoolEmail = jsonObject.getString("School_Email");
            s.lga = jsonObject.getString("LGA");
            s.schoolName = jsonObject.getString("School_name");
            s.date1stTeacher = jsonObject.getString("Date_1st_teacher");
            s.street = jsonObject.getString("Street");
            s.postcode = jsonObject.getString("Postcode");
            s.schoolGender = jsonObject.getString("School_gender");
            s.electorate = jsonObject.getString("Electorate");
            s.operationalDirectorate = jsonObject.getString("Operational_directorate");
            s.schoolCode = jsonObject.getString("School_code");
            s.lbotePercent = jsonObject.getDouble("LBOTE_pct");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
        // Return new object
        return s;
    }

    public static ArrayList<School> fromJson(JSONArray jsonArray) {
        JSONObject schoolJson;
        ArrayList<School> schools = new ArrayList<School>(jsonArray.length());
        // Process each result in json array, decode and convert to business object
        for (int i=0; i < jsonArray.length(); i++) {
            try {
                schoolJson = jsonArray.getJSONObject(i);
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }

            School school = School.fromJson(schoolJson);
            if (school != null) {
                schools.add(school);
            }
        }

        return schools;
    }
}
