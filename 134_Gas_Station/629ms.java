class Solution {
  public int canCompleteCircuit(int[] gas, int[] cost) {

    if(gas.length == 1)
      if(gas[0] < cost[0])
        return -1;
      else
        return 0;

    int startingGasStation = -1;

    for(int i = 0; i < gas.length; i++) {

      if(gas[i] > cost[i]) {

        int tank = gas[i];
        int currentIndex = i;
        int currentCost = cost[i];
        int stationsVisited = 0;

        for(int j = 0; j < gas.length; j++) {

          if((currentIndex + 1) == gas.length) {
            currentIndex = 0;
          } else {
            currentIndex++;
          }

          tank = tank - currentCost + gas[currentIndex];

          currentCost = cost[currentIndex];

          if(tank < currentCost)
            break;

          stationsVisited++;
        }

        if(stationsVisited == gas.length)
            return i;
      }
    }

    return startingGasStation;
  }
}
