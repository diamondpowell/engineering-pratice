public String startOz(String str) {
  // find length
  // find first 2 chars
  // need to store chars to keep
  // if str has a first char, and first char = o , keep
  // if str has a second char, and first char = z, keep
  // return kept chars in str
  String result = "";
  if (str.length() >=1 && str.charAt(0) == 'o')
  {
    result = result + 'o';
  }
  if (str.length() >=2 && str.charAt(1) == 'z')
  {
    result = result + 'z';
  }
  return result;
}
