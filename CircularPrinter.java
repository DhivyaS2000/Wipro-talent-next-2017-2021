ArrayList<Integer> c= new ArrayList<Integer>(s.length());
    long t=0;
    int a=65;
    for(int i=0;i<s.length();i++)
    {
        c.add((int)s.charAt(i));
    }
    for(int i:c)
    {
        int temp=Math.abs(a-i);
        if(temp>13)
        {
            temp=Math.abs(temp-26);
        }
        t+=temp;
        a=i;
    }
    return t;
    }