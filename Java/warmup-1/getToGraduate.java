public boolean getToGraduate( char chem, char prog) 
{
  // chemistry == 'A' || chemistry == 'B'
  // and &&
  // programming == 'A' || programming == 'B'
  
  // if chemistry is A or B AND programming is A or B
  // return true
  // otherwise return false
  if ((chem == 'A' || chem == 'B') && (prog == 'A' || prog == 'B'))
  { 
    return true;
  }
  else 
  {
    return false;
  }
}