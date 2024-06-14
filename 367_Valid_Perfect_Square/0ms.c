bool isPerfectSquare(int num) {
  if(num == 1)
    return 1;
  else
  {
    int stop = 0;
    long aux = 2;

    while(!stop)
    {
      if(aux * aux == num)
        return true;

      if(aux * aux > num)
        stop = 1;

      aux++;
    }    
  }

  return false;
}
