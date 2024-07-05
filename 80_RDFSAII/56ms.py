class Solution(object):
  def removeDuplicates(self, nums):
    uniqueArray = []
    frequencyArray = []

    for i in nums:
      if i not in uniqueArray:
        uniqueArray.append(i)

    for i in uniqueArray:
      count = 0
      for j in nums:
        if i == j:
          count += 1

      frequencyArray.append(count)

    tupArray = []

    for i in range(0, len(uniqueArray)):
      tup = (uniqueArray[i], frequencyArray[i])
      tupArray.append(tup)

    l = len(nums)

    for i, j in tupArray:
      if j > 2:
        for k in range(0, j - 2):
          nums.remove(i)
          l -= 1

    return l
