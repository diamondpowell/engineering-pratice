public boolean lastDigit(int a, int b) {
  // given two non negative int values (a,b)
  // return true if same last digit (27, 57 = 7)
  // % mod can determine this by remainder calc
  // if a last digit  = b last digit
  
  if ((a % 10) == (b % 10))
  {
    return true;
  }
  else
  {
    return false;
  }
}
