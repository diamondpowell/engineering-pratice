public String theEnd(String str, boolean front) 
{
  ///if front true return first char else if front false return last char
  if (front)
  {
    //c1  - return char at index 0
    return str.charAt(0) + "";
  }
  else
  {
    //c2 -- return char at last index  -- str.length() - 1
    return str.charAt(str.length() - 1) + "";
  }
}