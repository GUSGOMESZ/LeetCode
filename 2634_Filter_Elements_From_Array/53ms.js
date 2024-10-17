var filter = function(arr, fn) {
    
  let ret = [];

  arr.forEach((el, index) => {
    if(fn(el, index))
      ret.push(el);
  }

  return ret;
};
