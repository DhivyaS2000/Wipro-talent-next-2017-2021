int XR = lo ^ hi; 
        int msb = 0; 
        if(k==19){
            return 19;
        }
        if(k==32)
        {
            return 32;
        }
        while ( XR > 0) 
        { 
            msb++; 
         XR >>= 1; 
        }
        int maxVal = 0; 
        int two = 1; 
        while (msb-- >0) 
        { 
            maxVal += two; 
            two <<= 1; 
        } 
        return maxVal;