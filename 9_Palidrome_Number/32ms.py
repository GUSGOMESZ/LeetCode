class Solution(object):
  def isPalidrome(self, x):
    if str(x) == str(x)[::-1]:
      return True
    else:
      return False
