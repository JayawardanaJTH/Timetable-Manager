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
public class ParallelSession {
    
    private int id;
    private String yNs;
    private String session;

    public ParallelSession(int ID, String yNs, String session){
        this.id = ID;
        this.yNs = yNs;
        this.session = session;
    } 
    
    public int getId()
    {
        return id;
    }
    
    public String getYnS()
    {
        return yNs;
    }
    
    public String getPSession()
    {
        return session;
    }
}
