/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Name {
    private String fname;
    private String lname;
    private String mname;
    
    public Name() {}
    
    public Name(String fname) {
        this.fname = fname;
    }
    
    public Name(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
    
    public Name(String fname, String lname, String mname) {
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
    
    @Override
    public String toString() {
        List<String> nameInfo = new ArrayList<String>();
        
        if (!this.fname.equals("")) {
            nameInfo.add(this.fname);
        }
        
        if (!this.mname.equals("")) {
            nameInfo.add(this.mname);
        }
        
        if (!this.lname.equals("")) {
            nameInfo.add(this.lname);
        }
                
        return String.join(" ", nameInfo);
    }
}
