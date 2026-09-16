public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  // if both smiling in trouble
  // return true
  
  // if both not smiling in trouble
  // return true
  
  // if one is smiling not in trouble
  // return false
  
  if ((aSmile && bSmile) || (!aSmile && !bSmile))
  {
    return true;
  }
  else
  {
    return false;
  }
}
