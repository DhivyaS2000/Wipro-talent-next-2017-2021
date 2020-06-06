int count=0;
    ArrayList<Character> t=new ArrayList<Character>(100);
    for(int i=0;i<s.length();i++)
    {
        if(t.contains(s.charAt(i)))
        {
            count++;
            continue;
        }
        t.add(s.charAt(i));
    }
    return count;

    }

}
