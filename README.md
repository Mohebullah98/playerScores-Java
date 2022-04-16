# playerScores-Java
Given an array input with players and each time they score, return the top k players with their respective scores.

If two players have the same score, return the one who is lexographically less, (alphabetical order).


Given a non-empty list of playerScores, return the top k players.

Your answer should be sorted by player ranking. If two players have the same score, then the player with lexographically smaller name is ranked higher.

Example 1:

Input: {"aPlayer,2", "bPlayer,1", "aPlayer,1", "cPlayer,5", "dPlayer,2", "ePlayer,1", "bPlayer,2", "dPlayer,1"}

PlayerEvents: 

"aPlayer": 3  

"bPlayer": 3

"cPlayer": 5

"dPlayer": 3

"ePlayer": 1

k=2
Output: ["cPlayer", "aPlayer"]

k=3
Output: ["cPlayer", "aPlayer", "bPlayer"]
