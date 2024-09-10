var isPowerOfTwo = function(n) {
    var multi = 1;

    while(multi < n)
      multi *= 2;

    if(multi == n)
      return true;
    else
      return false;
};
