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
public class LecturersTime {
    
    private int id;
    private String lecName;
    private int lecId;
    private String day;
    private String time_from;
    private String time_to;
    
    public LecturersTime(int ID, String lecName,int lecId, String day,String time_from, String time_to){
        this.id = ID;
        this.lecName = lecName;
        this.lecId = lecId;
        this.day = day;
        this.time_from = time_from;
        this.time_to = time_to;
    }
    public int getId()
    {
        return id;
    }
    
    public String getLecName()
    {
        return lecName;
    }
    public int getLecId()
    {
        return lecId;
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
