USE quanlysinhvien;
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’ 
SELECT * FROM student
WHERE student.StudentName LIKE 'h%';
-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
SELECT * FROM class
WHERE class.StartDate LIKE '%12%';
-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
SELECT * FROM `subject`
WHERE `subject`.Credit BETWEEN 3 AND 5;
-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
SELECT * FROM student;
SET SQL_safe_updates = 0;
UPDATE student
SET student.ClassId = 2
WHERE student.StudentName = 'Hung';
SET SQL_safe_updates = 1;
-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
-- SELECT student.StudentName, subject.SubName, mark.Mark 
-- FROM student student
-- JOIN mark mark on student.StudentId = mark.StudentId
-- JOIN subject subject on mark.SubId = subject.SubId
-- ORDER BY mark DESC ,StudentName ASC;

SELECT S.StudentName, Subj.SubName, M.Mark
FROM student S 
JOIN mark M on S.StudentId = M.StudentId
JOIN `subject` Subj on M.SubId = Subj.subId
ORDER BY mark DESC ,studentName ASC;