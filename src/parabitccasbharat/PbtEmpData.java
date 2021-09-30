/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat;

/**
 *
 * @author ASUS
 */
public class PbtEmpData {

    public String empname;
    public String empdesig;
    public String empceid;
    public int empgrade;
    public String empemail;
    public String empcomputerno;
    public String empcity;
    public String empdistrict;
    public String empstate;

    public PbtEmpData(String empname, String empdesig, String empceid, int empgrade, String empemail, String empcomputerno, String empcity, String empdistrict, String empstate) {
        this.empname = empname;
        this.empdesig = empdesig;
        this.empceid = empceid;
        this.empgrade = empgrade;
        this.empemail = empemail;
        this.empcomputerno = empcomputerno;
        this.empcity = empcity;
        this.empdistrict = empdistrict;
        this.empstate = empstate;
    }

    public String getEmpname() {
        return empname;
    }

    public String getEmpdesig() {
        return empdesig;
    }
    
    public String getEmpceid() {
        return empceid;
    }

    public int getEmpgrade() {
        return empgrade;
    }

    public String getEmpemail() {
        return empemail;
    }

    public String getEmpcomputerno() {
        return empcomputerno;
    }
    
    public String getEmpcity() {
        return empcity;
    }
    
    public String getEmpdistrict(){      
        return empdistrict;
    }
    
    public String getEmpstate() {
        return empstate;
    }
}
