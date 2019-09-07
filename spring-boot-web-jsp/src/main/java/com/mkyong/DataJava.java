package com.mkyong;
public class DataJava
{
    private String recordsFiltered;

    private String[][] data;

    private String draw;

    private String recordsTotal;

    public String getRecordsFiltered ()
    {
        return recordsFiltered;
    }

    public void setRecordsFiltered (String recordsFiltered)
    {
        this.recordsFiltered = recordsFiltered;
    }

    public String[][] getData ()
    {
        return data;
    }

    public void setData (String[][] data)
    {
        this.data = data;
    }

    public String getDraw ()
    {
        return draw;
    }

    public void setDraw (String draw)
    {
        this.draw = draw;
    }

    public String getRecordsTotal ()
    {
        return recordsTotal;
    }

    public void setRecordsTotal (String recordsTotal)
    {
        this.recordsTotal = recordsTotal;
    }

    @Override
    public String toString()
    {
        return "DataJava [recordsFiltered = "+recordsFiltered+", data = "+data+", draw = "+draw+", recordsTotal = "+recordsTotal+"]";
    }
}