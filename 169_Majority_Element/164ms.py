class Solution(object):
  def majorityElement(self, nums):
    currentNum = None
    count = 0

    for i in nums:
      if count == 0:
        currentNum = i
        count = 1
      elif i == currentNum:
        count += 1
      else:
        count -=

    return currentNum
