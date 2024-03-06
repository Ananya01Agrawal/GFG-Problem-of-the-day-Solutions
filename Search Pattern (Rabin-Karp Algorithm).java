class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
       ArrayList<Integer> al=new ArrayList<>();
        
        if(pattern.length()>text.length())
        return al;
        
        //ArrayList<Integer> al=new ArrayList<>();
        int l=pattern.length();
        for(int i=0;i<text.length();i++)
        {
            
             for (int j=i+l;j<=text.length();j++)
            {
            
            
              String s=text.substring(i,j);
        
        if(s.length()>pattern.length())
        {
            break;
        }
            if(s.equals(pattern))
            {
              al.add(i+1);
                break;      
            }
            
            }
        }
        
        return al;
    }
}
