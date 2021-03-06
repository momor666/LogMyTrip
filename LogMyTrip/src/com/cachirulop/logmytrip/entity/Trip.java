package com.cachirulop.logmytrip.entity;

import java.util.Date;

/**
 * @author david
 *
 */
public class Trip
{
    private long _id;
    private Date _tripDate;
    private String _description;
    private Date _finishDate;
    
    /**
     * @return the id
     */
    public long getId ()
    {
        return _id;
    }
    
    /**
     * @param id the id to set
     */
    public void setId (long id)
    {
        this._id = id;
    }
    
    /**
     * @return the tripDate
     */
    public Date getTripDate ()
    {
        return _tripDate;
    }
    
    /**
     * @param tripDate the tripDate to set
     */
    public void setTripDate (Date tripDate)
    {
        this._tripDate = tripDate;
    }
    
    /**
     * @return the _description
     */
    public String getDescription ()
    {
        return _description;
    }
    
    /**
     * @param _description the _description to set
     */
    public void setDescription (String description)
    {
        this._description = description;
    }
    
    public Date getFinishDate ()
    {
        return _finishDate;
    }
    
    public void setFinishDate (Date value) 
    {
        _finishDate = value;
    }
    
    public boolean isFinished ()
    {
        return _finishDate != null;
    }
}
