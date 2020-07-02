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
    public int empgrade;
    public String empemail;
    public String empcomputerno;

    public PbtEmpData(String empname, String empdesig, int empgrade, String empemail, String empcomputerno) {
        this.empname = empname;
        this.empdesig = empdesig;
        this.empgrade = empgrade;
        this.empemail = empemail;
        this.empcomputerno = empcomputerno;
    }

    public String getEmpname() {
        return empname;
    }

    public String getEmpdesig() {
        return empdesig;
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
}
