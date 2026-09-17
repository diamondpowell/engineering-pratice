public String backAround(String str) {
  // char = charAt
  // last character = string.length()-1
  char last = str.charAt(str.length()-1);
  return last + str + last;
}
