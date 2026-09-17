public String delDel(String str) {
  // find string length
  // find the index d= 1, e=2, l=3
  // need to use str.substring
  // == compare , strings use .equals() to compare strings
  if ((str.length() >= 4) && str.substring(1,4).equals("del"))
  {
    return str.substring(0,1) + str.substring(4);
  }
  else
  {
    return str;
  }
  
}
