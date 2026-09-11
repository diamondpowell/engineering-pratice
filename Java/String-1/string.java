public String firstHalf(String str) 
{
  //2 String methods used is length() and substring()
  
  //find length of string (even)
   int length = str.length();
  //we want first half  --> find half of length
  int halfLen = length / 2;
  //find the first chars up to AND including half
  String firstHalfOfWord = str.substring(0, halfLen);
  //return the first half of string
  return firstHalfOfWord;
}