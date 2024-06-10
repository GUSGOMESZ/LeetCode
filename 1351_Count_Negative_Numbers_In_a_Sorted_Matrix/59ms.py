class Solution(object):
  def countNegatives(self, grid):
    count = 0

    for row in grid:
      for column in row:
        if column < 0:
          count += 1
    return count
