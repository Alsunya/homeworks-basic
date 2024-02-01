CREATE TABLE test_results(
test_id INTEGER REFERENCES Tests(test_id),
student_id INTEGER REFERENCES Students(student_id),
question_id INTEGER REFERENCES questions(id),
answer_id INTEGER REFERENCES answers(id),
PRIMARY KEY (test_id, student_id, question_id, answer_id)
);