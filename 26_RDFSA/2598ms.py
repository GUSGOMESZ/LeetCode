class Solution(object):

  def removeDuplicates(self, nums):
    s = []
    frequency = []

    for i in nums:
      if i not in s:
        s.append(i)

    for i in s:
      count = 0
      for j in nums:
        if j == i:
          count += 1

      frequency.append(count)

    index = 0
    k = len(nums)

    for i in frequency:
      for j in range(index, i + index):
        if j != index:
          nums[j] = 101
          k -= 1
      index += 1

    while(self.isOkay(nums, len(nums))):
      nums.remove(101)

    return k

  def isOkay(self, nums,len):
    for i in range(0, len):
      if nums[i] == 101:
        return True

    return False
          
