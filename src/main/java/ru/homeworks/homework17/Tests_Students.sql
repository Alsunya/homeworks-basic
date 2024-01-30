CREATE TABLE Tests_Students
(
    Test_Id  varchar(50),
    Student_Id INTEGER REFERENCES Students (ID),
    Test_Date  DATE,
    Answer_To_Question1  varchar(1),
    Answer_To_Question2  varchar(1),
    Answer_To_Question3  varchar(1),
    Answer_To_Question4  varchar(1),
    Answer_To_Question5  varchar(1),
    Answer_To_Question6  varchar(1),
    Answer_To_Question7  varchar(1),
    Answer_To_Question8  varchar(1),
    Answer_To_Question9  varchar(1),
    Answer_To_Question10 varchar(1)
);