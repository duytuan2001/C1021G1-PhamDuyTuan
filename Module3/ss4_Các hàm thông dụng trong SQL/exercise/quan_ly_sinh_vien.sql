USE quanlysinhvien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
SELECT * FROM `subject`
where Credit = (SELECT MAX(Credit) FROM `subject`);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
SELECT `subject`.*, mark.Mark FROM `subject`
INNER JOIN Mark on `subject`.SubID = Mark.SubID ORDER BY Mark DESC LIMIT 1;
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
SELECT Student.*, AVG(Mark)
FROM Student join Mark on Student.StudentId = Mark.StudentId
GROUP BY Student.StudentId;