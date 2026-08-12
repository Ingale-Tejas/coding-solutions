# Write your MySQL query statement below
SELECT distinct author_id as id FROM Views #distinct-> for no duplicate
WHERE author_id = viewer_id 
ORDER BY author_id ASC; #ASC (is okay if not used cuased sql does it by default in asending)
#and DESC for decending 