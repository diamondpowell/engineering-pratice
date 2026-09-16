public boolean hasTeen(int a, int b, int c) 
{
  // inclusive means to add =
  // teen: =>13 && <=19
  // or = ||
  
  if ((a >= 13 && a <=19) || (b >= 13 && b <=19) || (c >= 13 && c <=19))
  {
    return true;
  }
  else
  {
    return false;
  }
}
