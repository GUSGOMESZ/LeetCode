class Solution(object):
  def __init__(self):
    self.qtt = 0

  def countNegatives(self, grid):
    for j in range(len(grid)):
      for i in grid[j]:
        if i < 0:
          self.qtt += 1

    return self.qtt
