public class Autobus 
{   private String kennzeichnen;
    private int sitzplatze;
    private boolean anhanger;
    
    
    
    
    public Autobus()
    {
        
        setKennzeichnen ("W-1234A");
        setSitzplatze (29);
        setAnhanger(false);
    }
    
    
    public String getKennzeichnen()
    { return kennzeichnen;
    }
    
    public int getSitzplatze()
    { return sitzplatze;
    }
    
    public boolean getAnhanger()
    { return anhanger;
    }


    
    
    public void setKennzeichnen (String neuKennzeichnen)
    { kennzeichnen = neuKennzeichnen;
    }
            
    public void setSitzplatze (int neuSitzplatze)
    { sitzplatze = neuSitzplatze;
    }
     
     public void setAnhanger(boolean neuAnhanger)
    { anhanger = neuAnhanger;
    }
     
    
    
}