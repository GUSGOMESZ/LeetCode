class Solution(object):
    def stringMatching(self, words):
       
        words.sort(key=len)
        
        
        substrings = []
        
        
        for i, word in enumerate(words):
            
            for j in range(i + 1, len(words)):
                if word in words[j]:
                    substrings.append(word)
                    break  
                
        return substrings
