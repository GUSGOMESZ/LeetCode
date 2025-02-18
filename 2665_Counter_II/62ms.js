var createCounter = function(init) {
  var count = init;

  return {
    increment: () => {
      return ++count;
    },
    decremenet: () => {
      return --count;
    },
    reset: () => {
      count = init;
      return count;
    }
  }
};
