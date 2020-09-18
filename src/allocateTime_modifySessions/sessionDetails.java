/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allocateTime_modifySessions;

/**
 *
 * @author hvdil
 */
public class sessionDetails {
    
    private int id;
    private String sName;
    private String tag;
    private String sGid;
    
    public sessionDetails(int ID, String sName, String tag){
        this.id = ID;
        this.sName = sName;
        this.tag = tag;
    } 
    
    public int getId()
    {
        return id;
    }
    
    public String getSession()
    {
        return sName;
    }
    
    public String gettag()
    {
        return tag;
    }
    
    public String getsGid()
    {
        return sGid;
    }
}
