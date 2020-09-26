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
    private String sessionID;

    public ParallelSession(int ID, String yNs, String session, String sessionID){
        this.id = ID;
        this.yNs = yNs;
        this.session = session;
        this.sessionID = sessionID;
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

    /**
     * @return the sessionID
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * @param sessionID the sessionID to set
     */
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
}
