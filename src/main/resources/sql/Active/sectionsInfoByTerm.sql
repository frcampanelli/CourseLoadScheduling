--CS3733 Group 3
--SQL Scripts for Database
--Function: Fetches all of the currently existing sections for
--a specified term, as well as joining
--the foreign keys for information in other tables (days, course, etc.)

SELECT sections.id AS section_id,
sections.terms_id AS terms_id,
sections.section_type_id AS section_type_id,
sections.days_id AS days_id,
sections.start_id AS start_time_id,
sections.end_id AS end_time_id,
sections.courses_id AS courses_id,
terms.name AS terms_name,
section_type.type AS section_type,
days.day AS days,
courses.number AS courses_number,
courses.title AS courses_title,
start_time.time AS start_time,
end_time.time AS end_time,
sections.name AS sections_name,
faculty.first_name AS faculty_first_name,
faculty.last_name AS faculty_last_name,
schedule.faculty_id AS faculty_id
FROM schedule
LEFT JOIN sections ON schedule.sections_id = sections.id
LEFT JOIN terms ON terms.id =  sections.terms_id
LEFT JOIN section_type ON section_type.id =  sections.section_type_id
LEFT JOIN days ON days.id =  sections.days_id
LEFT JOIN courses ON courses.id =  sections.courses_id
LEFT JOIN start_time ON start_time.id =  sections.start_id
LEFT JOIN end_time ON end_time.id =  sections.end_id
LEFT JOIN faculty ON schedule.faculty_id = faculty.id
WHERE sections.terms_id = :termsId
ORDER BY courses_title DESC;