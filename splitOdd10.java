public boolean splitOdd10(int[] nums) {
  return splitList(0, 0, nums);
}

public boolean splitList(int first, int second, int[] remaining){
  
  if (remaining.length == 0){
    if (first % 10 == 0 && second % 2 == 1){
      return true;
    }
    else if (first % 2 == 1 && second % 10 == 0){
      return true;
    }
    return false;
  }
  
  int nextUp = remaining[0];
  
  int[] newRemaining = new int[remaining.length - 1];
  
  for (int i = 0; i < remaining.length-1; i ++){
    newRemaining[i] = remaining[i+1];
  }
  
  if (splitList(first+nextUp, second, newRemaining)){
    return true;
  }
  
  else if (splitList(first, second+nextUp, newRemaining)){
    return true;
  }
  
  return false;
}
