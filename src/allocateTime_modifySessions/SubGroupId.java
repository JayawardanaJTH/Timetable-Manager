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
public class SubGroupId {
    
    private int id;
    private String sGid;
    private String day;
    private String time_from;
    private String time_to;
    
    
    public SubGroupId(int ID, String sGid, String day,String time_from, String time_to){
        this.id = ID;
        this.sGid = sGid;
        this.day = day;
        this.time_from = time_from;
        this.time_to = time_to;
    } 
    
    public int getId()
    {
        return id;
    }
    
    public String getSGid()
    {
        return sGid;
    }
    
    public String getday()
    {
        return day;
    }
    
    public String gettime_from()
    {
        return time_from;
    }
    
    public String gettime_to()
    {
        return time_to;
    }
    
    
}
