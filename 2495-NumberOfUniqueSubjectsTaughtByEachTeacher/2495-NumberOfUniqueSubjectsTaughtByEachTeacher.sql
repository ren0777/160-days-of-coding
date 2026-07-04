-- Last updated: 7/4/2026, 10:54:46 PM
# Write your MySQL query statement below
Select
    teacher_id,
    COUNT(DISTINCT subject_id) AS cnt
FROM
    Teacher
GROUP BY
    teacher_id