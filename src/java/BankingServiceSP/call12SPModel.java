/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankingServiceSP;

/**
 *
 * @author akifraza
 */
public class call12SPModel {
    private String EMPLOYEE_ID;
    private String FULL_NAME;
    private String EMAIL;
    private String HIRE_DATE;
    private String Phone_number;
    private String JOB_ID;
    private int SALARY;
    private float COMMISSION;
    private String Manager;
    private String DEPARTMENT;
    private String CITY;
    private String COUNTRY;
    private String REGION;

    public String getEMPLOYEE_ID() {
        return EMPLOYEE_ID;
    }

    public void setEMPLOYEE_ID(String EMPLOYEE_ID) {
        this.EMPLOYEE_ID = EMPLOYEE_ID;
    }

    public String getFULL_NAME() {
        return FULL_NAME;
    }

    public void setFULL_NAME(String FULL_NAME) {
        this.FULL_NAME = FULL_NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getHIRE_DATE() {
        return HIRE_DATE;
    }

    public void setHIRE_DATE(String HIRE_DATE) {
        this.HIRE_DATE = HIRE_DATE;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String Phone_number) {
        this.Phone_number = Phone_number;
    }

    public String getJOB_ID() {
        return JOB_ID;
    }

    public void setJOB_ID(String JOB_ID) {
        this.JOB_ID = JOB_ID;
    }

    public int getSALARY() {
        return SALARY;
    }

    public void setSALARY(int SALARY) {
        this.SALARY = SALARY;
    }

    public float getCOMMISSION() {
        return COMMISSION;
    }

    public void setCOMMISSION(float COMMISSION) {
        this.COMMISSION = COMMISSION;
    }

    public String getManager() {
        return Manager;
    }

    public void setManager(String Manager) {
        this.Manager = Manager;
    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    public String getREGION() {
        return REGION;
    }

    public void setREGION(String REGION) {
        this.REGION = REGION;
    }
    
            
}




//	pEMPLOYEE_ID IN OUT VARCHAR2,
//	pFULL_NAME OUT VARCHAR2,
//	pEMAIL OUT VARCHAR2,
//	pHIRE_DATE OUT VARCHAR2,
//	pPHONE_NUMBER OUT VARCHAR2,
//	pJOB_ID OUT VARCHAR2,
//	pSALARY OUT NUMBER,
//	pCOMMISSION OUT FLOAT,
//	pMANAGER OUT VARCHAR2,
//	pDEPARTMENT OUT VARCHAR2,
//    pCITY       OUT VARCHAR2,
//    pSTATE      OUT VARCHAR2,
//    pCOUNTRY    OUT VARCHAR2,
//    pREGION     OUT VARCHAR2