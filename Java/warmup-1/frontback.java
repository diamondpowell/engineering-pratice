public String frontBack(String str) 
{
  // if string has one character only or less, return the strin
  //swap first and last letters
  // find length , legnth = 4
  // find position = 0,3
  // find middle = 1,2
  // c = 0, o = 1, d = 2, e = 3
  if (str.length()<=1)
  {
    return str;
  }
  char first = str.charAt(0);
  char last  = str.charAt(str.length()-1);
  String middle = str.substring(1, str.length()-1);
  return last + middle + first;
}
