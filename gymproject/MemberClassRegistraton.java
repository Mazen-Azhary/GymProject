/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymproject;

import java.time.LocalDate;

public class MemberClassRegistraton {
    String memberId;
    String classId;
    String status;
    LocalDate registrationDate;

    public MemberClassRegistraton(String memberId, String classId, String status) {
        this.memberId = memberId;
        this.classId = classId;
        this.status = status;
        this.registrationDate = LocalDate.now();
    }
    public MemberClassRegistraton(String[] SplittedData) {
        this.memberId = SplittedData[0];
        this.classId = SplittedData[1];
        this.status = SplittedData[2];
        this.registrationDate = LocalDate.parse(SplittedData[3]);//not sure if it works
    }

    public String getMemberId() {
        return memberId;
    }

    public String getClassId() {
        return classId;
    }
    
    public LocalDate getRegistrationDate(){
    return this.registrationDate;
    }
    
        public String getSearchKey(){
    return this.memberId+this.classId;
    }

    public String toString() {
     return memberId + ", " + classId + ", " + status + ", " + registrationDate.toString();
}
    
    public String LineRepresentation(){
        return this.toString();
    }


    
}
