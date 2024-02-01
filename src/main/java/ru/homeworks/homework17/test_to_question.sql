CREATE TABLE test_to_question(
test_id INTEGER REFERENCES tests(test_id),
question_id INTEGER REFERENCES questions(id),
primary key (test_id, question_id)
);
