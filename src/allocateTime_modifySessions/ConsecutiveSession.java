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
public class ConsecutiveSession {
    
    private int id;
    private String sGid;
    private String cSession;

    public ConsecutiveSession(int ID, String sGid, String cSession){
        this.id = ID;
        this.sGid = sGid;
        this.cSession = cSession;
    } 
    
    public int getId()
    {
        return id;
    }
    
    public String getSgid()
    {
        return sGid;
    }
    
    public String gettag()
    {
        return cSession;
    }

}
