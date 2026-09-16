public String front3(String str) {
  // get indices using str.substring : 0 1 2 3 4 ...
  // always start at 0, end at indices before the last
  //str.substring(0,3)
  // if str.length <3 front = whole string
  // if str.length >3 front = first 3 chars
  String front;
  if (str.length() <3)
  {
    front = str;
  }
  else
  {
    front = str.substring(0,3);
  }
  return front + front + front;
}
