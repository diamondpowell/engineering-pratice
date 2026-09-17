public int close10(int a, int b) {
  // find a distance from 10
  // find b distance from 10
  // a distance from 10 closer, return a
  // b distance from 10 closer, return b
  // a +b = equal distance , return 0 (tie)
  int aDis = Math.abs(a-10);
  int bDis = Math.abs(b-10);
  
  if (aDis < bDis)
  {
    return a;
  }
  else if (aDis > bDis)
  {
    return b;
  }
  else
  {
    return 0;
  }
}
